import 'dart:convert';
import 'dart:html';
import 'dart:ui';
import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;

class Login extends StatefulWidget {
 

  @override
  State<Login> createState() => _LoginState();
}

class _LoginState extends State<Login> {

  TextEditingController emailcontroller = TextEditingController();
  TextEditingController paswordcontroller = TextEditingController();

  String? namevaleu;
  bool loading = false;
  String? lastnamevaleu;
  String mensaje = "";

  Future<List> loginp() async{
    final url = Uri.parse("htpp:// 192.168.1.10/cinyuje/login.php");
    final respuesta = await http.post(url, body: {
      "username": emailcontroller.text,
      "pasword": paswordcontroller.text
    });

    var datauser = json.decode(respuesta.body);

    if(datauser.length == 0){
      setState(() {
        mensaje = "usuario o contraseña incorrecta";
        });
      
    }else{
      if(datauser[0]['tipo'] == 'Admin'){
          Navigator.pushNamed(context, 'decoracion');
        }else if(datauser[0]['tipo'] == 'cliente'){
          Navigator.pushNamed(context, 'principal');
        }
      setState(() {
        namevaleu = datauser[0]['username'];    
      });
    }
    return datauser;
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          Container(
            width: double.infinity,
            decoration: BoxDecoration(
              gradient: LinearGradient(
                colors: [
                  Colors.cyan.shade300,
                  Colors.cyan.shade800,
                ]
              )
            ),
            child: Image.asset(
              'images/logo_oscuro.png',
              height: 200,
              ),           
          ),
          Transform.translate(
            offset: Offset(0, -80),
            child: SingleChildScrollView(
              child: Card(
                elevation: 4,
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(20)
                ),
                margin: EdgeInsets.only(left: 20, right: 20,top: 260,bottom: 20),
                child: Padding(
                  padding: const EdgeInsets.symmetric(horizontal: 35, vertical: 20),
                  child: Column(
                    mainAxisSize: MainAxisSize.min,
                    children: [
                      TextFormField(
                        controller: emailcontroller,
                        decoration: InputDecoration(labelText: 'Email', icon: Icon(Icons.email)),
                      ),
                      SizedBox(height: 40,),
                      TextFormField(
                        controller: paswordcontroller,
                        decoration: InputDecoration(labelText: 'Password',icon: Icon(Icons.password)),
                        obscureText: true,
                      ),
                      SizedBox(height: 20,),
                      OutlinedButton(                 
                        style: ButtonStyle(
                          backgroundColor: MaterialStateProperty.all(Color(0xFF4DD0E1)),
                          padding: MaterialStateProperty.all(EdgeInsets.symmetric(vertical: 20))
                        ),
                        onPressed: () {                                    
                          _login(context);
                        }, 
                        child: Row(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            Text('Inicio de Seccion',style: TextStyle(color: Colors.white),),
                          if(loading)
                            Container(
                              width: 20,
                              height: 20,
                              margin: EdgeInsets.only(left: 20),
                              child: CircularProgressIndicator(color: Colors.white,),
                            )
                          ],
                        )
                      ),
                      SizedBox(height: 20,),
                      Row(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: [
                          Text('¿No estas registrado?'),
                          Container(
                            width: 150,
                            //height: 20,
                            child: ListTile(
                              title: Text('Registrarse'),
                              textColor: Color(0xFF4DD0E1), 
                              trailing: Icon(Icons.login_sharp),
                              iconColor: Color(0xFF4DD0E1),                    
                              onTap: () {
                                Navigator.of(context).pushNamed('/page2');
                              },),
                          )
                        ],
                      )
                    ],
                  ),
                ),
              ),
            ),
          )
        ],
      )
    );
  }
  
  void _login(BuildContext context) {
    if(!loading){
      setState(() {
        loading = true;
      });
    }
  }
}
import 'package:cinyuje/pages/page3.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

class Pap extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      //backgroundColor: Color.fromARGB(255, 221, 230, 230),
      appBar: AppBar(
        title: Center(child: Text('REGISTRO USUARIO')),
        backgroundColor: Color.fromARGB(129, 3, 29, 58),
      ),
      body: Page2(color: Colors.white),
    );
  }

}


class Page2 extends StatefulWidget {
  final Color color;

  Page2({ required this.color});
  

  @override
  State<Page2> createState() => _Page2State();
}

class _Page2State extends State<Page2> {

  int? id;
  String? namevaleu;
  String? lastnamevaleu;
  String? telephone;
  String? emai;

  final fromky = GlobalKey<FormState>();

  @override
  Widget build(BuildContext context) {
    
    return Scaffold(
      backgroundColor: Color.fromARGB(255, 221, 230, 230) ,
      body: Container(
        //color: Colors.cyan,
        child: ListView(
          children: [
         Form(
          key: fromky,
          child: Column(
          children: [  
           Image(image: AssetImage('images/crear_usuario.png')),       
          //Center(child: Text('REGISTRO USUARIO')), 
          TextFormField(
              decoration: InputDecoration(labelText: 'Identificacion'),
              keyboardType: TextInputType.phone,
              onSaved: (value) {
                id = int.parse(value.toString());
              },
              validator: (value) {
                if(value!.isEmpty){
                  return 'no aceptan campos vacios';
                }
              },             
          ),              
          TextFormField(
              decoration: InputDecoration(labelText: 'Nombre'),
              onSaved: (value) {
                namevaleu = value;
              },
              validator: (value) {
                if(value!.isEmpty){
                  return 'no aceptan campos vacios';
                }
              },             
          ),
          TextFormField(
              decoration: InputDecoration(labelText: 'Apellido'),
              
              onSaved: (value) {
                lastnamevaleu = value;
              },
              validator: (value) {
                if(value!.isEmpty){
                  return 'no aceptan campos vacios';
                }
              },
          ),
          TextFormField(
              decoration: InputDecoration(labelText: 'Telefono'),
              keyboardType: TextInputType.phone,
              onSaved: (value) {
                telephone = value;
              },
              validator: (value) {
                if(value!.isEmpty){
                  return 'no aceptan campos vacios';
                }
              },
          ),
          TextFormField(
              decoration: InputDecoration(labelText: 'Correo electronico'),
              keyboardType: TextInputType.emailAddress,
              onSaved: (value) {
                emai = value;
              },
              validator: (value) {
                if(value!.isEmpty){
                  return 'no aceptan campos vacios';
                }
              },
          ),
          OutlinedButton(
            onPressed: () {
              _showsPage(context);
            }, 
            child: Text('mostrar'))      
        ],
      ),
    ),
          ]
        )
  )
);

} 

void _showsPage(BuildContext context) {

    if(fromky.currentState!.validate()){
      fromky.currentState!.save();
      Navigator.of(context).pushNamed('/page3',
      arguments: Argumento(
        id!.toInt(),
        namevaleu.toString(), 
        lastnamevaleu.toString(),
        telephone.toString(),
        emai.toString()
        ));
    }

  
  }


  
  
} 
import 'package:flutter/material.dart';

class Login extends StatelessWidget {
 

  String? namevaleu;
  String? lastnamevaleu;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      
      appBar: AppBar(
        title: Center(child: Text('LOGIN')),
        backgroundColor: Color.fromARGB(129, 3, 29, 58),
      ),
      body: Container(
        child: Column(
          children: [
            //Image(image: AssetImage('images/cake_backg.jpg')),
              Center(
                child: Container(
                  color: Color.fromARGB(255, 201, 225, 245),
                  width: 300,
                  child: Column(
                    children: [                 
                      Image(image: AssetImage('images/logo_oscuro.png')),
                      TextFormField(
                      decoration: InputDecoration(labelText: 'Usuario'),
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
                          decoration: InputDecoration(labelText: 'Password'),
                          
                          onSaved: (value) {
                            lastnamevaleu = value;
                          },
                          validator: (value) {
                            if(value!.isEmpty){
                              return 'no aceptan campos vacios';
                            }
                          },
                      ),
                    ],
                  ),
                ),
              ),
          ]
        )
      )
    );
  }
}
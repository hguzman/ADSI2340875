import 'dart:ui';

import 'package:flutter/material.dart';

class Login extends StatefulWidget {
 

  @override
  State<Login> createState() => _LoginState();
}

class _LoginState extends State<Login> {
  String? namevaleu;
  bool loading = false;
  String? lastnamevaleu;

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
          Center(
            child: Card(
              margin: EdgeInsets.only(left: 20, right: 20,top: 260),
              child: Padding(
                padding: const EdgeInsets.symmetric(horizontal: 35, vertical: 20),
                child: Column(
                  mainAxisSize: MainAxisSize.min,
                  children: [
                    TextFormField(
                      decoration: InputDecoration(labelText: 'Usuario:'),
                    ),
                    SizedBox(height: 40,),
                    TextFormField(
                      decoration: InputDecoration(labelText: 'Usuario:'),
                      obscureText: true,
                    ),
                    OutlinedButton(
                      style: ButtonStyle(
                        backgroundColor: MaterialStateProperty.all(Color(0xFF4DD0E1))
                      ),
                      onPressed: () { }, 
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: [
                          Text('Inicio de Seccion',style: TextStyle(color: Colors.white),),
                        ],
                      )
                      )
                  ],
                ),
              ),
            ),
          )
        ],
      )
    );
  }
}
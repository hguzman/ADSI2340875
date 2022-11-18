
import 'package:cinyuje/pages/inicio.dart';
import 'package:cinyuje/pages/login.dart';
import 'package:cinyuje/pages/formulario.dart';
import 'package:cinyuje/pages/page3.dart';
import 'package:flutter/material.dart';


void main() {
  runApp( MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: "Cinyuje",
      //color: Color.fromARGB(0, 52, 130, 194),
      //home: Sena() ,
      initialRoute: '/',
      routes: {
        '/': (BuildContext context)=> Sena(),
        '/login': (BuildContext context)=> Login(),
        '/page2': (BuildContext context)=> Pap(),
        '/page3': (BuildContext context)=> Page3(),
      },
    );
  }
 
}
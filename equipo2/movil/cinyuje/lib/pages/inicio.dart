import 'package:cinyuje/methods/drawer.dart';
import 'package:cinyuje/pages/page1.dart';
import 'package:cinyuje/pages/formulario.dart';
import 'package:cinyuje/pages/page3.dart';
import 'package:flutter/material.dart';

class Sena extends StatefulWidget {
  @override
  State<Sena> createState() => _SenaState();
}

class _SenaState extends State<Sena> {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Center(child: Text('Welcome Proyect Cinyuje')),
        backgroundColor: Color.fromARGB(129, 3, 29, 58),
        actions: [
          Center(child: Text('Login')),
           IconButton(
                icon: Icon(Icons.login),
                tooltip: 'Inicio de seccion',
                onPressed: _add,),           
        ],
      ),
      body:  Page1(),
      drawer: Draws(),                            
    );
  }

  void _add() {
    print("hola");
     Navigator.pushNamed(context, '/login');
  }
}

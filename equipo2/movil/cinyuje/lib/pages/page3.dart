import 'package:flutter/material.dart';

class Page3 extends StatelessWidget {
  //const Page3(this.nombre);
//Argumento argument = new Argumento();

  @override
  Widget build(BuildContext context) {
     Argumento  name =  ModalRoute.of(context)!.settings.arguments as Argumento;
    //Argumento argument = name;
    

    return Scaffold(
      appBar: AppBar(
        title: Text('Cinyuje'),
        backgroundColor: Color.fromARGB(129, 3, 29, 58),
      ),
      body: Container(
        child: Column(
          children: [
            Text(name.id.toString()),
            Text(name.nombre),
            Text(name.apellido),
            Text(name.telefono),
            Text(name.email)
          ],
        ),
      ),
    );
  }
}

class Argumento {
  int id;
  String nombre;
  String apellido;
  String telefono;
  String email;
  Argumento(
    this.id,
    this.nombre,
    this.apellido,
    this.telefono,
    this.email
);
}
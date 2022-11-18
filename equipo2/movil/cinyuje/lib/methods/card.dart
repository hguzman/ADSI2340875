import 'package:flutter/material.dart';

class Decoracion extends StatelessWidget {
  final String nombre;
  final String imagen;
  final String descripcion;

  Decoracion({
    required this.nombre,
    required this.imagen, 
    required this.descripcion});

  @override
  Widget build(BuildContext context) {
    return Card(   
      margin: EdgeInsets.all(20.0), 
      elevation: 10,
      child: Container( 
             
        width: 170,
        //height: 150,
        child: Column(
          children: [
            Text(nombre,style: TextStyle(fontWeight: FontWeight.bold),),
            Image(image: AssetImage(imagen),width: 100,height: 100,),
            Container(
              width: 195,
              //color: Color.fromARGB(255, 180, 188, 235),
              child: Column(
              children: [ 
                Text(descripcion),
              ]
              ),
            )           
          ],
        ),
      ),

    );
  }

}
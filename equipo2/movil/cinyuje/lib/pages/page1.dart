import 'dart:async';

import 'package:flutter/material.dart';

import '../methods/card.dart';


class Page1 extends StatefulWidget {

  @override
  State<Page1> createState() => _Page1State();
}

class _Page1State extends State<Page1> {

  String name = 'images/Cinyuje.png';

  @override
  Widget build(BuildContext context) {

    return Scaffold(
      backgroundColor: Color.fromARGB(255, 221, 230, 230) ,
      body:SingleChildScrollView(
        child: Column(        
          children: [
            Container(             
              height: 200,
              color: Colors.blue,
              child: Image(image: 
                AssetImage(name)
              )
            ),
            Row(             
              mainAxisAlignment: MainAxisAlignment.spaceAround,
              children:[
                Container(
                  margin: EdgeInsets.all(20.0),
                  width: 100,
                  height: 100,
                  decoration: BoxDecoration(
                    //color: const Color(0xff7c94b6),      
                    border: Border.all(
                      width: 3,
                    ),
                    borderRadius: BorderRadius.circular(5),
                  ),
                  child: Image(image: AssetImage('images/Categoriag.png')),
                ),
                Container(
                  margin: EdgeInsets.all(10.0),
                  width: 100,
                  height: 100,
                  decoration: BoxDecoration(
                    //color: const Color(0xff7c94b6),      
                    border: Border.all(
                      width: 3,
                    ),
                    borderRadius: BorderRadius.circular(5),
                  ),
                  child: Image(image: AssetImage('images/Categoria_3.png')),
                ),
              ]
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceAround,
              children: [
                Decoracion(
                  nombre: 'Globos',
                  imagen: 'images/globos.jpg',
                  descripcion: 'Lleva tus globos para las fiestas',),
                  Decoracion(
                  nombre: 'Canguros',
                  imagen: 'images/Canguro.png',
                  descripcion: 'Canguros para tus niños en el colegio',),
              ],
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceAround,
              children: [
                  Decoracion(
                  nombre: 'Detalles',
                  imagen: 'images/Detalles.png',
                  descripcion: 'No olvides esos detalles de amistad',),
                  Decoracion(
                  nombre: 'Piñata',
                  imagen: 'images/pinata.jpg',
                  descripcion: ' Lindas piñatas personalizadas para tus fiestas',)
              ],
            ),
            Row(
              children: [
                Decoracion(
                  nombre: 'Minions',
                  imagen: 'images/minions.gif',
                  descripcion: 'Decoraciones para morrales personalizados',
                ),
                Decoracion(
                  nombre: 'Pinguinos',
                  imagen: 'images/pato.gif',
                  descripcion: 'Decoraciones para tus fiestas de niños personalizalos',
                ),
              ],
            )
          ],
        ),
      ),
      //floatingActionButton: FloatingActionButton(
        //child: Icon(Icons.pages),
        //onPressed: camcioimage
      //),   
    );
  }

  void cambioimage(){
    setState(() {
      if(name == 'images/Cinyuje.png'){
        name = 'images/Welcome.png';
      } else {
        name = 'images/Cinyuje.png';
      }
    });
  }

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
    Timer.periodic(Duration(seconds: 5), (value){
      cambioimage();
    });
  }

  @override
  void dispose() {
    // TODO: implement dispose
    super.dispose();
  }
} 
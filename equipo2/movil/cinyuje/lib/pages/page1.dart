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
            Text('Categorias',style: TextStyle(
              color: Color.fromARGB(255, 2, 12, 70),
              fontSize: 20.0
            ),),
            Row(             
              mainAxisAlignment: MainAxisAlignment.spaceAround,
              children:[
                OutlinedButton(
                  onPressed: () => _showdialog(context), 
                  child: 
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
                  child: Image(image: AssetImage('images/Categoriag.png')),
                )
                ),
                OutlinedButton(
                  onPressed: () => _dialog(context), 
                  child:
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
                )
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
              mainAxisAlignment: MainAxisAlignment.spaceAround,
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

  void _showdialog(BuildContext context){
    showDialog(
      context: context, 
      builder: (BuildContext context) {
        return SimpleDialog(
          title: Text('Categoria'),
          children: [
            ListTile(
              title: Text('Decoraciones'),
              subtitle: Text('Aqui encontraras todo para tus fiestas'),
              leading: Icon(Icons.image),
              onTap: () {
                Navigator.pushNamed(context, '/decoracion');
              },
            )
          ],
        );
      }
    );
  }

  void _dialog(BuildContext context){
    showDialog(
      context: context, 
      builder: (BuildContext context) {
        return SimpleDialog(
          title: Text('Categoria'),
          children: [
            ListTile(
              title: Text('RECORDATORIOS'),
              subtitle: Text('Tus mejores recordatorios para fiestas'),
              leading: Icon(Icons.image),
              onTap: () {
                Navigator.pushNamed(context, '/recordatorio');
              },
            )
          ],
        );
      }
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
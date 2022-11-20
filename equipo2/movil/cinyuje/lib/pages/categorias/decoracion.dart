import 'package:flutter/material.dart';

import '../../methods/card.dart';

class Decorar extends StatelessWidget {
  const Decorar({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Center(child: Center(child: Text('DECORACIONES'))),
        backgroundColor: Color.fromARGB(129, 3, 29, 58),
      ),
      body: SingleChildScrollView(
        child: Column(
          children: [
            Decoracion(
                  nombre: 'Detalles',
                  imagen: 'images/Detalles.png',
                  descripcion: 'No olvides esos detalles de amistad',),
            Decoracion(
                  nombre: 'Piñata',
                  imagen: 'images/pinata.jpg',
                  descripcion: ' Lindas piñatas personalizadas para tus fiestas',),
            Decoracion(
                  nombre: 'Globos',
                  imagen: 'images/globos.jpg',
                  descripcion: 'Lleva tus globos para las fiestas',),
          ],
        ),
      ),
    );
  }
}
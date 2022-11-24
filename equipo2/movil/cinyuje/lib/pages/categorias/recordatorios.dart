import 'package:flutter/material.dart';

import '../../methods/card.dart';

class Record extends StatelessWidget {
  const Record({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Center(child: Center(child: Text('Recordatorios'))),
        backgroundColor: Color.fromARGB(129, 3, 29, 58),
      ),
      body: SingleChildScrollView(
        child: Column(
          children: [
            Decoracion(
                  nombre: 'Canguros',
                  imagen: 'images/Canguro.png',
                  descripcion: 'Canguros para tus niños en el colegio',),
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
        ),
      ),
    );
  }
}
import 'package:flutter/material.dart';

class Page2 extends StatelessWidget {
  final Color color;

  const Page2({ required this.color});

  @override
  Widget build(BuildContext context) {
    
    return Scaffold(
      body: Container(
        color: color,
        child: Column(
        children: [       
          Text('holaaaaa'),
                  
          TextField(
              decoration: InputDecoration(labelText: 'Nombre'),
          ),         
        ],
    ),
  )
);
  } 
} 
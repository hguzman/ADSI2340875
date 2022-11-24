import 'package:flutter/material.dart';


class Pagina2 extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    
return Scaffold(
  drawer: Drawer(
    child:  Container(
      color: Color.fromARGB(255, 12, 12, 12),
      child: Column(children: [
        Container(
          margin: const EdgeInsets.only(top: 5 , bottom: 5),
          child: Image.network('https://th.bing.com/th/id/R.f7a64a85fe7cf552be90b5529a2e1e32?rik=%2bKMKW50i9d0cXA&pid=ImgRaw&r=0'),
        ),
         Text("GYM OLIMPO", style: TextStyle(fontWeight: FontWeight.bold, fontSize: 20, color: Color.fromARGB(255, 248, 247, 247)),),
      Container(
        margin: const EdgeInsets.only(top: 10),
        padding: const EdgeInsets.all(20),
        width: double.infinity,
        color: Color.fromARGB(115, 24, 22, 22),
        child: const Text("inicio", style: TextStyle(color: Color.fromARGB(255, 241, 239, 239)),),
         

      ),
      Container(
        margin: const EdgeInsets.only(top: 10),
        padding: const EdgeInsets.all(20),
        width: double.infinity,
        color: Color.fromARGB(115, 24, 22, 22),
        child: const Text ("eventos", style: TextStyle(color: Colors.white),),
         

      ),
      Container(
        margin: const EdgeInsets.only(top: 10),
        padding: const EdgeInsets.all(20),
        width: double.infinity,
        color: Color.fromARGB(115, 24, 22, 22),
        child: const Text("clases", style: TextStyle(color: Colors.white),),
         

      ),
      Container(
        margin: const EdgeInsets.only(top: 10),
        padding: const EdgeInsets.all(20),
        width: double.infinity,
        color: Color.fromARGB(115, 24, 22, 22),
        child: const Text("servicios", style: TextStyle(color: Colors.white),),
         

      ),
      Container(
        margin: const EdgeInsets.only(top: 10),
        padding: const EdgeInsets.all(20),
        width: double.infinity,
        color: Color.fromARGB(115, 24, 22, 22),
        child: const Text("team on fire", style: TextStyle(color: Colors.white),),
         

      ),
      Container(
        margin: const EdgeInsets.only(top: 10),
        padding: const EdgeInsets.all(20),
        width: double.infinity,
        color: Color.fromARGB(115, 24, 22, 22),
        child: const Text("¿quienes somos?", style: TextStyle(color: Colors.white),),
         

      )
      ]),
      
    ),
  ),
  appBar: AppBar(
  title: Text("WELCOME"),
  backgroundColor: Colors.black,
  ),
  
);  }

}
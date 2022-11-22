import 'package:flutter/material.dart';

 
void main() => runApp(const MyApp());
 
class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);
 
 
 
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      
      home: Scaffold(
       
        body:  const Paginas(
        
        ),
      ),
    );
  }
}
 
class Paginas extends StatefulWidget {
  const Paginas({Key? key}) : super(key: key);
 
  @override
  State<Paginas> createState() => _PaginasState();
}
 
class _PaginasState extends State<Paginas> {
  TextEditingController nameController = TextEditingController();
  TextEditingController passwordController = TextEditingController();
 
  @override
  Widget build(BuildContext context) {
    return  Padding(
        padding: const EdgeInsets.all(5),
        child: ListView(
          children: <Widget>[
            Container(
                alignment: Alignment.center,
                padding: const EdgeInsets.all(5),
                child: const Text(
                  'GYM OLYMPO',
                  style: TextStyle(
                      color: Colors.red,
                      fontWeight: FontWeight.w500,
                      fontSize: 30),
                )),
            Container(
                alignment: Alignment.center,
                padding: const EdgeInsets.all(5),
                child: const Text(
                  'REGISTRO',
                  style: TextStyle(
                    color: Colors.red,
                    fontSize: 20),
                )),
            Container(
              padding: const EdgeInsets.all(5),
              child: TextField(
                controller: nameController,
                decoration: const InputDecoration(
                  
                  border: OutlineInputBorder(),
                
                  labelText: 'usuario',
                  
                  
                ),
              ),
            ),
            Container(
              padding: const EdgeInsets.fromLTRB(10, 10, 10, 0),
              child: TextField(
                obscureText: true,
                controller: passwordController,
                decoration: const InputDecoration(
                  border: OutlineInputBorder(),
                  labelText: 'contraseña',
                ),
              ),
            ),
            TextButton(
              onPressed: () {
              },
              child: const Text('recordar contraseña',),
            ),
            Container(
                height: 50,
                padding: const EdgeInsets.fromLTRB(10, 0, 10, 0),
                child: ElevatedButton(
                  child: const Text('enviar'),
                  onPressed: () {
                    Navigator.of(context).push(MaterialPageRoute(builder:(context) => Pagina2(), ),);
                    print(nameController.text);
                    print(passwordController.text);
                  },
                )
            ),
            Row(
              children: <Widget>[
                const Text('?'),
                TextButton(
                  child: const Text(
                    '',
                    style: TextStyle(fontSize: 20),
                  ),
                  onPressed: () {
                  
                  },
                )
              ],
              mainAxisAlignment: MainAxisAlignment.center,
            ),
          ],
        ));
  }
}

class Pagina2 extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    
return Scaffold(
  appBar: AppBar(
  title: Text("WELCOME"),
  backgroundColor: Colors.black,
  ),
);  }

}
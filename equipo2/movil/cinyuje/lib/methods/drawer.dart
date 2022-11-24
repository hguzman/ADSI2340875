import 'package:flutter/material.dart';

class Draws extends StatelessWidget {
  const Draws({super.key});

  @override
  Widget build(BuildContext context) {
    return Drawer(
        child: ListView(
          children: [
            UserAccountsDrawerHeader(
              accountName: Text('Piñateria y decoraciones'), 
              accountEmail: Text('Cinyuje'),
              currentAccountPicture: Image(image: AssetImage('images/logo_oscuro.png')),
              otherAccountsPictures: [
                Image(image: AssetImage('images/logo_oscuro.png')),
                Image(image: AssetImage('images/logo_oscuro.png')),
              ],
              onDetailsPressed: () {},
              decoration: BoxDecoration(
                gradient: LinearGradient(colors: [Color.fromARGB(255, 55, 6, 100),Colors.black],
                  end: Alignment.bottomRight)
              ),
            ),
            ListTile(
              onTap: () {
                Navigator.pushNamed(context, '/page2');
              },
              leading: Icon(Icons.verified_user),
              title: Text('Registro de usuario'),
              trailing: Icon(Icons.arrow_right),
            ),
            Center(
              child: Text('Categorias',style: TextStyle(
                color: Color.fromARGB(255, 2, 12, 70),
                fontSize: 20.0
              ),),
            ),
            ListTile(
              onTap: () {
                Navigator.pushNamed(context, '/decoracion');
              },
              leading: Icon(Icons.image_aspect_ratio_rounded),
              title: Text('Decoracion'),
              trailing: Icon(Icons.arrow_right),
            ),ListTile(
              onTap: () {
                Navigator.pushNamed(context, '/recordatorio');
              },
              leading: Icon(Icons.image_aspect_ratio_rounded),
              title: Text('Recordatorio'),
              trailing: Icon(Icons.arrow_right),
            ),
          ],
        ),
      );
  }
}


/*DrawerHeader(
              decoration: BoxDecoration(color: Colors.blue),
              child: Row(
                children: [
                  ,
                  
                ],
              )
            )*/
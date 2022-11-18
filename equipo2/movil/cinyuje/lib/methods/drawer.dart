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
                gradient: LinearGradient(colors: [Colors.blue,Colors.black],
                  end: Alignment.bottomRight)
              ),
            ),
            ListTile(
              onTap: () {
                Navigator.pushNamed(context, '/page2');
              },
              leading: Icon(Icons.verified_user),
              title: Text('Registro de usuario'),
              trailing: Icon(Icons.fork_right_rounded),
            )
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
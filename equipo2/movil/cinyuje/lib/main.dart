import 'package:cinyuje/pages/page1.dart';
import 'package:cinyuje/pages/page2.dart';
import 'package:flutter/material.dart';


void main() {
  runApp( MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Cinyuje",
      color: Color.fromARGB(0, 52, 130, 194),
      home: Sena(),
    );
  }
 
}

class Sena extends StatefulWidget {
  @override
  State<Sena> createState() => _SenaState();
}

class _SenaState extends State<Sena> {
  int page = 0;
  final PageController pageController = new PageController( initialPage: 0);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Center(child: Text('Welcome Proyect Cinyuje')),
        backgroundColor: Color.fromARGB(129, 3, 29, 58),
        actions: [
          IconButton(
            onPressed: _add, 
            icon: Icon(Icons.verified_user_outlined))
        ],
        //leading: IconButton(
          //onPressed: _add,
          //icon: Icon(Icons.arrow_back),)
      ),
      body:        
          PageView(
            controller: pageController,
            physics: NeverScrollableScrollPhysics(),
            children: [
              Page1(),
              Page2(color: Colors.grey),
              Page2(color: Color.fromARGB(255, 18, 72, 219)),
            ],
          ),
        
      
      bottomNavigationBar: BottomNavigationBar(
        currentIndex: page,
        onTap: (index) {
          page = index;
          pageController.animateToPage(index,
          duration: Duration(seconds: 2),curve: Curves.easeInOutCubic );

          setState(() {
            
          });
        },
        backgroundColor: Colors.grey,
        selectedItemColor: Colors.blue,
        items: [
          BottomNavigationBarItem(icon: Icon(Icons.pages_outlined),
          label: 'user'
          ),
          BottomNavigationBarItem(icon: Icon(Icons.pageview),
          label: 'Home'
          ),
          BottomNavigationBarItem(icon: Icon(Icons.pageview),
          label: 'Page'
          ),
         ]
        ),
        drawer: Drawer(),
    );
  }

  void _add() {
    print("hola");
  }
}

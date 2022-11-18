/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

const imagen = document.getElementById('imagen');
const validarimagen = ()=> {
    var ima = document.getElementById('imagen').file[0].name;
    document.getElementById('fotoId').setAttribute("value",ima);
    
    console.log("Entro a validar imagen");
    
};

imagen.addEventListener('Keyup', validarimagen);
imagen.addEventListener('blur', validarimagen);




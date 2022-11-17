const formulario = document.getElementById('formulario');
const inputs = document.querySelectorAll('#formulario input');

const expreciones = {
  identificacion: /^\d{7,10}$/, //numeros
  correo: /^[a-zA-Z0-9._+-]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]+$/, //formato de correo prueba@prueba.com
  nombre: /^[a-zA-Z\s]{3,40}$/, //lestras y espacio
  apellido: /^[a-zA-Z\s]{3,40}$/, //lestras y espacio
  direccion: /^[a-zA-Z0-9\_\-\#\s]{5,40}$/, //Letras, numeros, guion, guion bajo
  telefono: /^[0-9]{10}$/, //numeros
  usuario: /^[a-zA-Z0-9\_\-]{4,20}$/, // letras, numeros, guion
  contrasena: /^[a-zA-Z0-9\_\-]{4,20}$/ // letras, numeros, guion
};

const campos = {
    identificacion: false,
    correo: false,
    nombre: false,
    apellido: false,
    direccion: false,
    telefono: false,
    usuario: false,
    contrasena: false
};

const validarformulario = (e) => {
    switch (e.target.name){
        case "id":
            validarcampo(expreciones.identificacion, e.target, 'identificacion');
            break;
        case "correo":
            validarcampo(expreciones.correo, e.target, 'correo');
            break;
        case "nombre":
            validarcampo(expreciones.nombre, e.target, 'nombre');
            break;
        case "apellido":
            validarcampo(expreciones.apellido, e.target, 'apellido');
            break;  
        case "direccion":
            validarcampo(expreciones.direccion, e.target, 'direccion');
            break;
        case "telefono":
            validarcampo(expreciones.telefono, e.target, 'telefono');
            break;
        case "usuario":
            validarcampo(expreciones.usuario, e.target, 'usuario');
            break;
        case "contrasena":
            validarcampo(expreciones.contrasena, e.target, 'contrasena');
            break;  
        case "contrasena2":
            validarcontrasena2();
            break;
    }
};

const validarcampo = (expresion, input, campo) =>{
    if (expresion.test(input.value)){
        document.getElementById(`grupo__${campo}`).classList.remove('formulario__grupo-incorrecto');
        document.getElementById(`grupo__${campo}`).classList.add('formulario__grupo-correcto');
        document.querySelector(`#grupo__${campo} i`).classList.remove('fa-times-circle');
        document.querySelector(`#grupo__${campo} i`).classList.add('fa-check-circle');
        document.querySelector(`#grupo__${campo} .formulario__input-error`).classList.remove('formulario__input-error-activo');
        campos[campo] = true;
    }else{
        document.getElementById(`grupo__${campo}`).classList.add('formulario__grupo-incorrecto');
        document.getElementById(`grupo__${campo}`).classList.remove('formulario__grupo-correcto');
        document.querySelector(`#grupo__${campo} i`).classList.add('fa-times-circle');
        document.querySelector(`#grupo__${campo} i`).classList.remove('fa-check-circle');
        document.querySelector(`#grupo__${campo} .formulario__input-error`).classList.add('formulario__input-error-activo');
        campos[campo] = false;
    }
};

const validarcontrasena2 = () => {
    const inputcontrasena1 = document.getElementById('contrasena');
    const inputcontrasena2 = document.getElementById('contrasena2');
    if (inputcontrasena1.value !== inputcontrasena2.value){
        document.getElementById('grupo__contrasena2').classList.add('formulario__grupo-incorrecto');
        document.getElementById('grupo__contrasena2').classList.remove('formulario__grupo-correcto');
        document.querySelector('#grupo__contrasena2 i').classList.add('fa-times-circle');
        document.querySelector('#grupo__contrasena2 i').classList.remove('fa-check-circle');
        document.querySelector('#grupo__contrasena2 .formulario__input-error').classList.add('formulario__input-error-activo');
        campos['contrasena'] = false;
    }else{
        document.getElementById('grupo__contrasena2').classList.remove('formulario__grupo-incorrecto');
        document.getElementById('grupo__contrasena2').classList.add('formulario__grupo-correcto');
        document.querySelector('#grupo__contrasena2 i').classList.remove('fa-times-circle');
        document.querySelector('#grupo__contrasena2 i').classList.add('fa-check-circle');
        document.querySelector('#grupo__contrasena2 .formulario__input-error').classList.remove('formulario__input-error-activo');
        campos['contrasena'] = true;
    }
    
};


inputs.forEach((input)=>{
    input.addEventListener('keyup',validarformulario);
    input.addEventListener('blur',validarformulario);
});

formulario.addEventListener('submit', (e) => {
    const terminos = document.getElementById('terminos');
    if (campos.identificacion && campos.correo && campos.nombre && campos.apellido && campos.direccion && campos.telefono && campos.usuario && campos.contrasena && terminos.checked){
        
    }else{
        e.preventDefault();
        document.getElementById('formulario__mensaje').classList.add('formulario__mensaje-activo');
    }
});





const botonMenu = document.querySelector('.menu-toggle');
const navegacion = document.querySelector('.main-nav');

//formularios
const formularioRegistro = document.querySelector('.auth-form')
const inputNombre = document.querySelector('#name');
const inputEmailRegistro = document.querySelector('#register-email');
const selectPerfil = document.querySelector('#role');
const inputPasswordRegistro = document.querySelector('#register-password');
const checkTerminos = document.querySelector('.check input[type="checkbox"]');

if (botonMenu && navegacion) {


    botonMenu.addEventListener('click', () => {


        const menuEstaAbierto = navegacion.classList.contains('open');

        if (menuEstaAbierto) {

            navegacion.classList.remove('open');
            botonMenu.setAttribute('aria-expanded', 'false');
        } else {

            navegacion.classList.add('open');
            botonMenu.setAttribute('aria-expanded', 'true');
        }

    });

}

formularioRegistro.addEventListener('submit', (evento) => {


    const nombre = inputNombre.value.trim();
    const email = inputEmailRegistro.value.trim();
    const rol = selectPerfil.value;
    const password = inputPasswordRegistro.value.trim();
    const aceptoTerminos = checkTerminos ? checkTerminos.checked : false;

    if (nombre === '' || password === '' || email === '') {
        alert('Por favor, llena todos los campos');
    }

    if (!aceptoTerminos) {
        alert('Por favor, acepta los terminos');
    }

    const usuarioRegistrado = {
        nombre: nombre,
        email: email,
        rol: rol,
        password: password
    };

    localStorage.setItem('usuarioRegistrado', JSON.stringify(usuarioRegistrado));
    alert('¡Cuenta creada exitosamente! Ahora puedes iniciar sesión.');

    window.location.href = 'login.html';


});
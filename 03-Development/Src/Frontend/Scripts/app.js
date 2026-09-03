
const botonMenu = document.querySelector('.menu-toggle');
const navegacion = document.querySelector('.main-nav');

//formulario registro
const formularioRegistro = document.querySelector('.auth-form')
const inputNombre = document.querySelector('#name');
const inputEmailRegistro = document.querySelector('#register-email');
const selectPerfil = document.querySelector('#role');
const inputPasswordRegistro = document.querySelector('#register-password');
const checkTerminos = document.querySelector('.check input[type="checkbox"]');

//formulario login
const formularioLogin = document.querySelector('.auth-form');
const inputEmailLogin = document.querySelector('#email');
const inputPasswordLogin = document.querySelector('#password');


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

if (inputEmailLogin && inputPasswordLogin && formularioLogin) {
    formularioLogin.addEventListener('submit', (evento) => {
        evento.preventDefault();

        const email = inputEmailLogin.value.trim();
        const password = inputPasswordLogin.value.trim();

        if (email === '' || password === '') {
            alert('Por favor, ingresa tu correo y contraseña');
        }

        const datosEnStorage = localStorage.getItem('usuarioRegistrado');

        if (datosEnStorage === null) {
            alert('NO existe ninguna cuenta registrada. Por favor crea una cuenta primero');
            window.location.href = 'register.html';
            return;
        }

        const usuarioGuardado = JSON.parse(datosEnStorage);

        const correoCoincide = email === inputEmailRegistro;
        const passwordCoincide = password === inputPasswordRegistro;

        if (passwordCoincide && correoCoincide) {
            alert(`¡Bienvenido de nuevo ${usuarioGuardado.nombre}!`);

            localStorage.setItem('sesionActiva', 'true');

            window.location.href = 'index.html';
        } else {
            alert('Correo y password no coinciden');
        }


    });
}


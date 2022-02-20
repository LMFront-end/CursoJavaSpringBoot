// Call the dataTables jQuery plugin
$(document).ready(function() {

    //en ready
});

async function registrarUsuario() {

    let datos = {}
    // nombre
    datos.nombre = document.getElementById('txtNombre').value;

    // apellido
    datos.apellido = document.getElementById('txtApellido').value;

    // Email
    datos.email = document.getElementById('txtEmail').value;

    // Password
    datos.password = document.getElementById('txtPassword').value;

    let repetirPassword = document.getElementById('txtRepeatPassword').value;

    if(repetirPassword !==  datos.password) {
        alert("No coinciden las contraseñas");
        return;
    }

    const request = await fetch('api/usuarios', {
        method: 'POST', // Crear una nueva entidad
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(
            datos
        )
    });
    //const usuarios = await request.json();
    //console.log(usuarios);
}




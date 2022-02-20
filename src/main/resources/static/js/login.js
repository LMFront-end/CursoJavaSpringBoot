// Call the dataTables jQuery plugin
$(document).ready(function() {

    //en ready
});

async function iniciarSesion() {

    let datos = {}
    // Email
    datos.email = document.getElementById('txtEmail').value;

    // Password
    datos.password = document.getElementById('txtPassword').value;


    const request = await fetch('api/login', {
        method: 'POST', // Crear una nueva entidad
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });

    const respuesta = await request.text();

    if(respuesta == "Ok"){
        window.location.href = "usuarios.html"
    }else{
        alert('Las credenciales son incorrectas, por favor intenten nuevamente');
    }
    console.log(respuesta);
}




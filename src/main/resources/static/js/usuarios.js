// Call the dataTables jQuery plugin
$(document).ready(function() {
//alert("Hola mundo");
cargarUsuario();
  $('#usuarios').DataTable();
});

async function cargarUsuario() {
      const request = await fetch('api/usuarios', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        //body: JSON.stringify({a: 1, b: 'Textual content'})
      });
      const usuarios = await request.json();

      console.log(usuarios);

      let listadoHTML = '';


    for(let usuario of usuarios){

        let telefonoTexto = usuario.telefono === null ? "--" : usuario.telefono;

        let botonEliminar = '<a href="#" onclick="eliminarUsuario(' + usuario.id + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>'

        let usuarioHTML = '<tr><td>1</td><td>' + usuario.nombre + ' ' + usuario.apellido+ '</td><td>' +usuario.email+ '</td><td>' +telefonoTexto+ '</td><td>'+botonEliminar+'</td></tr>'

      listadoHTML += usuarioHTML;
    }
        //document
        document.querySelector("#usuarios tbody").outerHTML = listadoHTML;

}

async function eliminarUsuario(id){

    if(!confirm('¿Desea eliminar este usuario? ')){
        return;
    }

    const request = await fetch('api/usuarios/' + id, {
        method: 'DELETE',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        //body: JSON.stringify({a: 1, b: 'Textual content'})
    });

    location.reload();

}



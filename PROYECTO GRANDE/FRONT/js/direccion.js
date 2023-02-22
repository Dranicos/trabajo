function cargaDireccion(){

    fetch('http://localhost:8088/inicio/direcciones/' + localStorage.getItem("username") + '')
    .then(response => response.json())
    .then((data) =>{ 
        console.log("Direccion", data);
        localStorage.setItem("Direccion", JSON.stringify(data));
        let direccion=document.querySelector(".direccion");
        data.forEach((element, i) => {
            direccion.innerHTML += 
            "<div class='producto " + i + " '><p>Localidad: "+ element.localidad +"</p><p>Codigo Postal: "+
            element.codigo_Postal +"</p><p>Calle: "+ element.calle +"</p><p>Numero: "+ element.numero +
            "</p><p>Piso: "+ element.piso +"</p><p>Letra: "+ element.letra +"</p><button onclick='eliminarDireccion()'>Eliminar</button></div>";
        });
    });
    }

function eliminarDireccion() {

}


    window.addEventListener("load", cargaDireccion())


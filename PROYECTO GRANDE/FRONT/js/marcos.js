function cargaMarcos(){

    fetch('http://localhost:8088/productos/producto/2')
    .then(response => response.json())
    .then((data) =>{ 
    console.log("Productos", data);
    let productos=document.querySelector(".marco");
    data.forEach(element => {

        productos.innerHTML += "<div class='producto'><img src='../assets/img/" + element.img +
            "'><h3>"+ element.nombre +"</h3><p>Precio: "+ element.precio +
            " $</p> <button>Agregar a Carrito</button> </div>";
    });
    });
}

window.addEventListener("load", cargaMarcos())
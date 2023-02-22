function cargaBicis(){

    fetch('http://localhost:8088/productos/producto/1')
    .then(response => response.json())
    .then((data) =>{ 
    console.log("Productos", data);
    let productos=document.querySelector(".bici");
    data.forEach(element => {
        productos.innerHTML += "<div class='producto'><img src='../assets/img/" + element.img +
            "'><h3>"+ element.nombre +"</h3><p>Precio: "+ element.precio +
            " $</p> <button>Agregar a Carrito</button> </div>";

    });
    });
}

window.addEventListener("load", cargaBicis())
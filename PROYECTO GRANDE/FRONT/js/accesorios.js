function cargaAccesorios(){

fetch('http://localhost:8088/productos/producto/3')
.then(response => response.json())
.then((data) =>{ 
    console.log("Productos", data);
    localStorage.setItem("Productos", JSON.stringify(data));
    let productos=document.querySelector(".accesorio");
    data.forEach((element, i) => {
        productos.innerHTML += "<div class='producto'><img src='../assets/img/" + element.img +
        "'><h3>"+ element.nombre +"</h3><p>Precio: "+ element.precio +
        " $</p> <button value='" + element.id_Producto + "' onclick='store("+ i + ")'>Agregar a Carrito</button> </div>";
    });
});
}

function store(producto) {
    let produc = JSON.parse(localStorage.getItem("Productos"))
    let car = JSON.parse(localStorage.getItem("carrito"))

    for (let index = 0; index < produc.length; index++) {
        for (let index = 0; index < car.length; index++) {
            if (JSON.stringify(produc[producto]) == JSON.stringify(produc[index])) {   
            
                if(car == null) {
                    localStorage.setItem("carrito", JSON.stringify(produc[producto]));
                }
                else {
                    car.push(produc[produc[producto]])
                    localStorage.setItem("carrito", JSON.stringify(car));
                }
            }
        }
    }
}


window.addEventListener("load", cargaAccesorios())
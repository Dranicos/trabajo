
// ? funcionalidad carrusel
const carrusel = document.querySelector('.carrusel');
const carruselItems = document.querySelectorAll('.carrusel-item');
const indicadoresContainer = document.querySelector('.carrusel-indicadores');

let index = 0;

// Crear un indicador por cada item del carrusel
carruselItems.forEach((item, i) => {
  const indicador = document.createElement('div');
  indicador.classList.add('carrusel-indicador');
  if (i === 0) {
    indicador.classList.add('active');
  }
  indicador.addEventListener('click', () => {
    index = i;
    actualizarCarrusel();
  });
  indicadoresContainer.appendChild(indicador);
});

// Función para actualizar la posición del carrusel y los indicadores
function actualizarCarrusel() {
    carrusel.classList.add('carrusel-transition');
    carrusel.style.transform = `translateX(-${index * 100}%)`;
    document.querySelectorAll('.carrusel-indicador').forEach(indicador => {
      indicador.classList.remove('active');
    });
  }


  carrusel.addEventListener('transitionend', () => {
    carrusel.classList.remove('carrusel-transition');
  });

// Avanzar el carrusel cada 5 segundos
setInterval(() => {
  index++;
  if (index >= carruselItems.length) {
    index = 0;
  }
  actualizarCarrusel();
}, 5000);


//carrusel


// ? datos

function cargaBicis(){

  fetch('http://localhost:8088/productos/producto/1')
  .then(response => response.json())
  .then((data) =>{ 
    console.log("Productos", data);
    let productos=document.querySelector(".bici");
    let counter = 0;
    data.forEach(element => {
      if (counter < 4) {
        productos.innerHTML += "<div class='producto'><img src='../assets/img/" + element.img +
          "'><h3>"+ element.nombre +"</h3><p>Precio: "+ element.precio +
          " $</p> <button>Agregar a Carrito</button> </div>";
        counter++;
      }
    });
  });
}

function cargaMarcos(){

  fetch('http://localhost:8088/productos/producto/2')
  .then(response => response.json())
  .then((data) =>{ 
    console.log("Productos", data);
    let productos=document.querySelector(".marco");
    let counter = 0;
    data.forEach(element => {
      if (counter < 4) {
        productos.innerHTML += "<div class='producto'><img src='../assets/img/" + element.img +
          "'><h3>"+ element.nombre +"</h3><p>Precio: "+ element.precio +
          " $</p> <button>Agregar a Carrito</button> </div>";
        counter++;
      }
    });
  });
}

function cargaAccesorios(){

  fetch('http://localhost:8088/productos/producto/3')
  .then(response => response.json())
  .then((data) =>{ 
    console.log("Productos", data);
    let productos=document.querySelector(".accesorio");
    let counter = 0;
    data.forEach(element => {
      if (counter < 4) {
        productos.innerHTML += "<div class='producto'><img src='../assets/img/" + element.img +
          "'><h3>"+ element.nombre +"</h3><p>Precio: "+ element.precio +
          " $</p> <button>Agregar a Carrito</button> </div>";
        counter++;
      }
    });
  });
}

window.addEventListener("load", cargaBicis())
window.addEventListener("load", cargaMarcos())
window.addEventListener("load", cargaAccesorios())
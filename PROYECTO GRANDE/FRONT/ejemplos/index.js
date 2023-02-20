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
    document.querySelector('.carrusel-indicador:nth-child(' + (index + 1) + ')').classList.add('active');
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

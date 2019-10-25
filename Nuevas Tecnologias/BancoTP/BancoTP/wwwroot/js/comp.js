// función que actualiza el zoom del elemento body
function actualizarTama() {
  
  $("body").css("zoom", window.innerHeight / 900);
  
}

$(document).ready(function() {

  // actualizaremos el zoom cuando la ventana cambie de tamaño
  $(window).on("resize", actualizarTama);
  
  // y al cargar la página
  actualizarTama();
  
});
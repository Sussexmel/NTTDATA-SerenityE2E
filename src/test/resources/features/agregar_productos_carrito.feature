#author: Melissa Garcia
#language: es

Característica: Agregar dos productos al carrito de compras

  Yo como usuario
  Quiero ingresar a la web
  Para realizar la compra de dos productos

  Antecedentes:
    Dado "usuario" va a ingresar al sistema

  @successful
  Escenario: abrir con el navegador la pagina web
    Y deseo añadir dos productos al carrito
    Y comprar los productos y finalizar la compra
    Cuando seleccione dos productos para comprar
    Entonces podrá realizar la compra exitosamente.
#author: Melissa Garcia
#language: es

Característica: Agregar productos al carrito de compras

  Yo como usuario
  Quiero ingresar a la web
  Para realizar la compra de productos

  Antecedentes:
    Dado "usuario" va a ingresar al sistema

  Esquema del escenario: Realizar una compra exitosa
    Dado que el usuario abre el navegador en la página web
    Cuando añade los productos "<producto1>" y "<producto2>" al carrito
    Y compra los productos y finaliza la compra
    Entonces podrá realizar la compra exitosamente.

    Ejemplos:
      | producto1          | producto2         |
      | Samsung galaxy s6  | Nexus 6           |
      | Nokia lumia 1520   | Samsung galaxy s7 |
      | Iphone 6 32gb      | Sony xperia z5    |
      | HTC One M9         | Sony vaio i5      |
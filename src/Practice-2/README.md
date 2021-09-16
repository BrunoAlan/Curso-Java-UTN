## Ejercicio 1

Dada diferentes figuras geometricas:

1. Rectangulo
2. Cuadrado
3. Circulo
   Con sus correspondientes propiedades, crear una clase Principal, que me deje instanciar las mismas y me permita calcular el area y el perimetro de cada una.

## Ejercicio 2

Crear una clase abstracta denominada Animal, de la cual derivan las clases Perro, Gato y Vaca. Todas las subclases deben redefinir el método abstracto hablar(), de la clase Animal, según como “hable” cada uno. Para ello puede declarar el método como de tipo de retorno void y abstracto y luego utilizar el método println de System.out en cada implementación del mismo.
Además realice una clase que contenta el método main() denominada Principal que invoque a un método denominado hablarAnimal(Animal a) que reciba un “Animal” como parámetro, y que le permita “hablar”, polimórficamente, según sea Gato, Perro o Vaca.

## Ejercicio 3

Teniendo en cuenta los gustos alimenticios de los animales del ejercio anterior (el gato y el perro son carnívoros y la vaca herbívora), incluir las respectivas interfaces de manera que cada uno de los correspondientes objetos pueda comerCarne o comerHierba.

## Ejercicio 4

Modifique el método main utilizado en el ejercicio 2, invocando a otro método denominado comerAnimal que reciba como parámetro a un Animal e invoque al correspondiente método para comer (comerCarne o comerHierba) según el tipo de animal que sea.

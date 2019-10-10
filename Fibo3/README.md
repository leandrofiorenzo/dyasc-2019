# Diseño y arquitectura de sistemas de computación.

## Introducción

### Generar el jar.
+ mvn clean package
+ mvn package

### Ejecutar.
+ java -jar fibo.jar n -opts

### opts:
-f=x ('x' define el archivo donde se va a guardar el resultado de la ejecución)
-o=xy 
    ('x' define la orientación del resultadoo. Puede ser 'v' (vertical) o 'h' (horizontal))
    ('y' define la direccion del resultado. Puede ser 'd' (directa) o 'i' (inversa))
-m=x ('x' define el modo de funcionamiento del programa. Puede ser 'l' (lista) o 's' (sumatoria))

#### Ejemplos.
##### 1)
java -jar fibo.jar -o=vd -m=l 5

resultado: 
fibo<5>: 
0 
1 
1 
2 
3

##### 2)
java -jar fibo.jar -o=vd -m=s 5

resultado: 
fibo<5>: 7

##### 3)
java -jar fibo.jar -f=prueba.txt -o=vd -m=s 8

resultado: 
fibo<8> guardado en prueba.txt

## Decisiones de diseño
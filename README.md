# Informe sobre el Sorteo de Equipos para una Liga Profesional

## Descripción del Ejercicio

Este programa facilita la organización del sorteo de equipos para una liga de fútbol profesional, donde los equipos compiten en diversas etapas como octavos de final, cuartos de final y semifinales. El sorteo se lleva a cabo de manera aleatoria, garantizando que no se repitan los enfrentamientos entre los mismos equipos en una misma etapa. Además, el algoritmo emplea recursividad para realizar el sorteo de manera eficiente y continua, reduciendo el número de equipos a la mitad en cada ronda.

## Objetivo

El objetivo es desarrollar una aplicación en Java que realice lo siguiente:

1. Permitir al usuario ingresar la etapa del torneo (octavos, cuartos, semifinales).
2. Ingresar los nombres de los equipos para la etapa seleccionada.
3. Realizar el sorteo aleatorio de los equipos y mostrar los emparejamientos en cada etapa.
4. Utilizar recursividad para reducir la cantidad de equipos en cada ronda hasta obtener los finalistas.

## Explicación del Código

1. **Main.java**:
   - En este archivo se gestiona la entrada de datos desde el usuario, incluyendo la etapa del torneo y los nombres de los equipos.
   - Después de obtener estos datos, se llama al método `sorteoEquipos()` de la clase `Sorteo` para realizar el sorteo.

2. **Sorteo.java**:
   - Contiene el método recursivo `sorteoEquipos()` que primero mezcla aleatoriamente los equipos, luego imprime los emparejamientos, y finalmente llama a sí mismo con un conjunto reducido de equipos para la siguiente etapa.

## Funcionamiento

1. El programa pide al usuario que ingrese la etapa del torneo (octavos, cuartos, semifinales).
2. Luego, solicita los nombres de los equipos para esa etapa.
3. El programa realiza el sorteo utilizando recursividad para emparejar aleatoriamente los equipos.
4. Después de cada ronda, los equipos ganadores se reducen a la mitad y el sorteo continúa hasta la final.

## Conclusión

Este programa es una herramienta eficaz para organizar aleatoriamente los partidos en una liga profesional, garantizando la imparcialidad y evitando que un equipo se enfrente a otro en la misma fase.
Proyecto de Programación Orientada a Objetos - Contenido Audiovisual

Este proyecto forma parte de la Unidad 2 del curso de Programación Orientada a Objetos. A partir del código base proporcionado en el [Repositorio Original](https://github.com/CS-Programacion-Orientada-Objetos/poo_unidad1), se amplió y reorganizó el sistema para modelar distintos tipos de contenido audiovisual utilizando los principios de la POO en Java.

---

Objetivos del Proyecto

- Aplicar los principios de la Programación Orientada a Objetos (abstracción, herencia, encapsulamiento y polimorfismo).
- Ampliar una jerarquía de clases mediante nuevas entidades relacionadas.
- Implementar relaciones entre clases: asociación, agregación y composición.
- Utilizar Git y GitHub como herramientas de control de versiones.
- Crear un sistema funcional en Eclipse, probado y documentado.

---

Clases Implementadas

Clases base del sistema
- ContenidoAudiovisual (abstracta)
- Pelicula
- SerieDeTV
- Documental

Nuevas clases relacionadas
- Actor: Relacionada con 'Pelicula' (agregación)
- Temporada: Relacionada con 'SerieDeTV' (composición)
- Investigador: Relacionada con 'Documental' (asociación)

Nuevas subclases de 'ContenidoAudiovisual'
- VideoYouTube
- Cortometraje

---

Importar en Eclipse
- Abre Eclipse.
- Selecciona File > Import > Projects from Git (whit smart import)
- Selecciona Clone URI
- En el campo URI coloca la dirección del repositorio GitHub
    https://github.com/GabrielMarin78/poo_unidad2.git
- Presiona Net en las próximas pantallas dejando todas las selecciones por defecto.
- Presiona Finish

Abre el proyecto poo_unidad2

Ejecutar
- Ejecuta la clase PruebaAudioVisual.java.

Verás en consola los detalles de los objetos instanciados.

# Plantilla: propuesta del Proyecto A

---

## 0 · Datos

| | |
|---|---|
| **Bancada 1923** | |
| **Pablo Martínez Clavero** | |
| **23/09/2026** | |

---

## 1 · La idea en una frase

> Qué hace tu app y para quién, en una sola frase.
>
> Fórmula: «Una app que permite a [quién] hacer [qué] para [para qué].»

Una app que permite al celtista mantenerse informado y actualizado constantemente sobre su equipo simplemente entrando en la aplicación, además de poder mantener debates en foros de la propia app con cualquier otro usuario.

---

## 2 · El problema

> ¿Qué problema resuelve? ¿Cómo se resuelve hoy sin tu app?

Actualmente no hay una aplicación concreta que ayude al celtista a informarse sobre su equipo, solamente hay foros en internet muy anticuados que llevan mucho sin actualizarse.

---

## 3 · Personas usuarias

> ¿Quién la va a usar? Describe a una persona concreta: edad, soltura con la
> tecnología, cuándo y dónde abre la app, cuánto tiempo le dedica y qué pasa
> si le falla.

La puede usar cualquiera, pero está dirigida para una persona amante del RC Celta, de cualquier edad a partir de unos 16 años, no es necesario que tenga ningún conocimiento tecnológico, simplemente saber navegar por el teléfono móvil. 

La app está hecha para que se abra cuando y donde quiera, ya que es una app en la que simplemente se va a buscar información y a dialogar con otros usuarios.

No es necesario dedicarle mucho tiempo al día, ya que es interactiva y bastante rápida.

---

## 4 · Funcionalidades

### Imprescindibles (sin esto la app no tiene sentido)

| # | Funcionalidad |
|---|---------------|
| F1 | Información de la actualidad del RC Celta (Noticias) |  
| F2 | Foro de debate entre usuarios sobre temas relacionados con el RC Celta|
| F3 | Implementar un seguimiento de ubicación/localización para poder saber en todo momento cual es la tienda del RC Celta más cercana y a cuantos metros está el usuario del estadio |

### Opcionales (si sobra tiempo)

| # | Funcionalidad |
|---|---------------|
| O1 | Tienda de segunda mano en la cual cualquier usuario puede publicar su producto relacionado con el club y puede comprar cualquier producto de otro usuario |
| O2 | |

---

## 5 · Pantallas

| Pantalla | Para qué sirve | Se llega desde |
|----------|----------------|----------------|
| Inicio | Se ve una vista previa de noticias destacadas sin login ni logup | (arranque) |
| Noticias | Pagina de noticias donde aparecen boxes de noticias | Hipervinculo en barra de secciones de la app |
| Noticia individual | Página individual de cada noticia | Hipervinculo en la pagina general de noticias |
| Foro de debate | Página del foro donde aparecen boxes de debates | Hipervinculo en barra de secciones de la app |
| Foro individual | Página individual de cada debate | Hipervinculo en la pagina general del foro |

---

## 6 · Bocetos

> Dibuja las pantallas principales. A mano y fotografiado es válido.
> Pega aquí las imágenes o indica el nombre de los archivos adjuntos.
---

Archivo adjunto - "bocetosInicialesPMDM.png"

## 7 · Qué datos guarda la app

| Tipo de dato | Campos | Ejemplo |
|--------------|--------|---------|
| Usuario | 	ID, nombre de usuario, correo electrónico, contraseña | usuario: Pablo23, correo: pablo@gmail.com |
| Noticia | ID, título, contenido, imagen, fecha, enlace | El Celta ficha a un nuevo jugador, 30/09/2026 |
| Debate | 	ID, título, contenido, autor, fecha | ¿Qué os parece el nuevo fichaje? |
| Comentario | ID, debate, autor, contenido, fecha | Creo que es un buen fichaje |
| Ubicación | latitud, longitud | 42.2406, -8.7207 |
| Producto (si haces la tienda de segunda mano) | 	ID, nombre, descripción, precio, imagen, vendedor | Camiseta Celta 2024, 30 € |
---

## 8 · Encaje con los requisitos del módulo

> Apartado obligatorio: ninguna casilla puede quedar vacía.

| Requisito | Dónde encaja en tu app | Tema |
|-----------|------------------------|------|
| **Persistencia de datos** — la información sobrevive al cerrar la app | Usuarios, noticias, debates y comentarios se almacenan para que sigan disponibles al cerrar y abrir la aplicación. | 4 |
| **Servicio web** — la app consulta datos por internet | La aplicación obtiene las noticias mediante Internet. | 5 |
| **Sensor o localización** | Se utiliza la ubicación del móvil para calcular la distancia hasta Balaídos y localizar la tienda del Celta más cercana. | 6 |
| **Contenido multimedia** — foto, audio, vídeo o animación | Las noticias pueden incluir imágenes y los debates pueden permitir imágenes de perfil. | 7 |

---

## 9 · Riesgos

| Lo que me preocupa | Plan B |
|--------------------|--------|
| Que sea complicado conseguir noticias actualizadas automáticamente. | Utilizar una fuente de noticias más sencilla o introducir algunas noticias manualmente. |
| Que la función de localización no funcione correctamente. | Permitir que el usuario consulte las ubicaciones mediante un mapa o mostrar las direcciones de las tiendas y del estadio. |
| Que el sistema de foros sea demasiado complicado de desarrollar. | 	Hacer un foro básico en el que los usuarios puedan crear debates y responder a ellos, sin añadir funciones avanzadas. |
| Que no haya tiempo suficiente para desarrollar todas las funcionalidades. | Priorizar las tres funciones principales: noticias, foro y localización, dejando la tienda de segunda mano como funcionalidad opcional. |

---

## Antes de entregar

- [ ] La idea cabe en una frase.
- [ ] El público es una persona concreta, no «todo el mundo».
- [ ] Hay **3 o 4** funcionalidades imprescindibles, no diez.
- [ ] Cada funcionalidad imprescindible tiene su pantalla.
- [ ] Hay bocetos de las pantallas principales.
- [ ] **Las cuatro casillas del apartado 8 están rellenas.**
- [ ] Está identificado al menos un riesgo con su plan B.

package com.pablo.bancada1923.ui.page.data

data class Noticia(
    val id: Int,
    val titulo: String,
    val descripcion: String,
    val contenido: String,
    val fecha: String,
    val enlace: String = ""
)

val noticiasEjemplo = listOf(
    Noticia(
        id = 1,
        titulo = "Noticia 1",
        descripcion = "Nuevo fichaje del Celta",
        contenido = ".....1",
        fecha = "21/10/2026",
        enlace = "https://www.ejemplo.com/noticia1"
    ),
    Noticia(
        id = 2,
        titulo = "Noticia 2",
        descripcion = "Se lesiona iago aspas",
        contenido = ".....2",
        fecha = "21/10/2026",
    ),
    Noticia(
        id = 3,
        titulo = "Previa del proximo partido",
        descripcion = ".....3",
        contenido = ".....3",
        fecha = "21/10/2026",
    )
)
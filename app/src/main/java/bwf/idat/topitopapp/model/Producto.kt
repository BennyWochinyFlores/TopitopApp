package bwf.idat.topitop.model

class Producto (
    val nombre:String,
    val precio :Float,
    val descuento :Float
        )fun getData(): List<Producto> = listOf(
    Producto("Polo Blanco para Hombre en cuello Circular",25.4f ,23.2f),
    Producto("Polo Negro",25.4f ,23.2f),
    Producto("Polo Blanco",25.4f ,23.2f),
    Producto("Polo Blanco",25.4f ,23.2f),
    Producto("Polo Blanco",25.4f ,23.2f),
    Producto("Polo Blanco",25.4f ,23.2f),
    Producto("Polo Blanco",25.4f ,23.2f),
    Producto("Polo Blanco",25.4f ,23.2f)

        )

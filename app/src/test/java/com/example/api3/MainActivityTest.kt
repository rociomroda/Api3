package com.example.api3
import org.junit.Assert.assertEquals
import org.junit.Test
import org.robolectric.RobolectricTestRunner
import org.junit.runner.RunWith
@RunWith(RobolectricTestRunner::class)
class MainActivityTest {
    private val activity = MainActivity()

    @Test
    fun 'Dado un listado de productos, validar que la informacion se pueda mostrar por pantalla'(){
        //Preparar datos de prueba
        val productos=listOf(
            Product(
            id=1,
            name= "Product A",
            description= "This is a sample product",
            price= 10.99,
            currency="USD",
            in_stock=true
        ),
            Product(
                id=2,
                name= "Product B",
                description= "Another sample product",
                price= 24.49,
                currency="EUR",
                in_stock=false

            )
        )
        // Ejecutar metodo
        val resultado = activity.obtenerListadoProductos(productos)
        //Validar resultados
        assertEquals(
            """
                ID: 1, Nombre: Product A
                ID:2 , Nombre: Product B
            """.trimIndent(),
            resultado

        )
        }
    @Test
    fun 'Cuando el listado esta vacio, validar que no se pueda mostrar informacion en pantalla'() {
    //Preparar datos de prueba
        val productos = emptyList<Product>()

    //Ejecutar metodo
        val resultado = activity.obtenerListadoProductos(productos)

    //validar resultado
        assertEquals("No hay resultados disponibles", resultado)
}
}
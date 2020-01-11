
fun main (args: Array<String>){
    var mnsj=": : Bienvenido a Recipe Maker : :"
    println(mnsj)
    println("\n")
    var opciones:String="""Selecciona la opción deseada
1. Hacer recetas
2. Ver recetas
3. Salir """.trimMargin()
    println(opciones)

    //leer respuesta del usuario

    var response:String?= readLine()
    do {
        if (response.equals("1")){
            println("Eligió hacer recetas")
            makeRecipe()

        }else{
            if (response.equals("2")){
                println("Eligio ver recetas")
            }else{
                if (response.equals("3")){
                    println("Eligio Salir")
                }
            }
        }
        response= readLine()
    }while(!response.equals("3"))

}
//metodo make recipe
fun makeRecipe(){
    val mensaje="""Hacer receta
Selecciona por categoría el ingrediente que buscas"""

    val ingredients= arrayOf("Agua","leche","carne","Verduras","Frutas","Cereal","Huevos","Aceite")
    //imprimir arreglo ingredients con índice +1
    for(index in ingredients.indices){
        println("${(index+1)}. ${ingredients.get(index)}")
    }
}
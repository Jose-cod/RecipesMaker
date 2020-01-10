
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
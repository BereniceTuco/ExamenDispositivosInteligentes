import java.util.*

fun main(args:Array<String>){

    val scanner = Scanner(System.`in`)

    var opc=0

    var bandera=false
    var bandera2=true
    do {
        println("Menu de Sistema de cursos \n1.-Registro de curso de cocina\n2.-Registro de curso de programación\n3.-getAll\n4.-Salir")
        var resp=scanner.nextInt();
        when(resp){
            1 ->
                do{
                    println("registro de curso de cocinar \n1.-Add\n2.-Update\n3.-Eliminar\n4.-Get\n5.-Regresar al menu principal")
                    opc=scanner.nextInt();
                    when(opc){
                        1 -> println("ADD")
                        2 -> println("UPDATE")
                        3 -> println("ELIMINAR")
                        4 -> println("GET")
                        5 -> bandera2=false

                        else -> println("Error: Numero fuera de rango ")
                    }

                }while(bandera2)
            2 ->
                do{
                    println("registro de curso de programación \n1.-Add\n2.-Update\n3.-Eliminar\n4.-Get\n5.-Regresar al menu principal")
                    opc=scanner.nextInt();
                    when(opc){
                        1 -> println("ADD")
                        2 -> println("UPDATE")
                        3 -> println("ELIMINAR")
                        4 -> println("GET")
                        5 -> bandera2=false

                        else -> println("Error: Numero fuera de rango")
                    }

                }while(bandera2)
            3 ->

                println("GET ALL")



            4 -> bandera=true

            else -> println("ERROR: numero fuera de rango")
        }

    }while (!bandera)

}
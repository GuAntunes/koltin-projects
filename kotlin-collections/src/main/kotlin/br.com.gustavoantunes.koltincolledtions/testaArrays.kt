package br.com.gustavoantunes.koltincolledtions

fun testaArrays() {

    //Inicialização passando o tamanho do array e atribuindo valores linha a linha
    val idades = IntArray(4)
    idades[0] = 25
    idades[1] = 30
    idades[2] = 35
    idades[3] = 40

    //Inicialização no momento da construção do objeto com "arrayOf()"
    val idades2 = intArrayOf(25, 30, 35, 40)
    val doubleArray: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 1000.0)

    //iterando um Array através do for() com indices
    for (indice in idades.indices) {
        if (idades[indice] < 18) {
            println("É menor de idade")
        } else {
            println("É maior de idade")
        }
    }

    //Iterando um Array através do foreach com indice
    idades.forEachIndexed { i, idade ->
        if (idades[i] < 18) {
            println("É menor de idade")
        } else {
            println("É maior de idade")
        }
    }

    //Tranformando o Array no tipo List ou MutableList
    val listIdades: List<Int> = idades.toList()
    val mutableListIdades = idades.toMutableList()
    val setIdades = idades.toSet()
    val mutableSetIdades = idades.toMutableSet()
}
package br.com.gustavoantunes.koltincolledtions

fun testaCollections() {

    //Inicializando uma Collection com collectionOf
    val listNames = listOf("Gustavo", "Antunes", "Silvia", null)
    println(listNames)

    //Inicializando uma lista vazia
    val listNamesEmpty = emptyList<String>()
    println(listNamesEmpty)

    //Inicializando uma lista excluindo valores nulos
    val listNamesNullSafety = listOfNotNull("Gustavo", "Antunes", null)
    println(listNamesNullSafety)


    //Inicializando MutableList empty
    val mutableListOf = mutableListOf<String>()
    //Adicionando valores na lista criada
    mutableListOf.add("Gustavo")
    mutableListOf.add("Antunes")
    //Removendo valores da lista
    mutableListOf.remove("Gustavo")
    println(mutableListOf)


}
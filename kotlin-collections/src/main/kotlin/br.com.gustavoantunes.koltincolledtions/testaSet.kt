package br.com.gustavoantunes.koltincolledtions

fun testaSet() {

//    - union(): devolve um novo Setcom a soma dos elementos dos conjuntos
//    - subtract(): devolve um novo Set subtraindo os elementos contidos no segundo conjunto
//    - intersect(): devolve um novo Set apenas com os elementos contidos em ambos os conjuntos

    val assistiramCursoAndroid = setOf("Alex", "Gustavo", "Maria", "Filipe")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")

    //Union
    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid.union(assistiramCursoKotlin))
    println(assistiramCursoAndroid union (assistiramCursoKotlin))
    println(assistiramCursoAndroid union assistiramCursoKotlin)

    //Subtract
    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid.subtract(assistiramCursoKotlin))
    println(assistiramCursoAndroid subtract (assistiramCursoKotlin))
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    //Intersect
    println(assistiramCursoAndroid.intersect(assistiramCursoKotlin))
    println(assistiramCursoAndroid intersect (assistiramCursoKotlin))
    println(assistiramCursoAndroid intersect assistiramCursoKotlin)

}
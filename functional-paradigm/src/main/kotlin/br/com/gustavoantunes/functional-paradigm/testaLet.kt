package br.com.gustavoantunes.functional

fun testaLet() {


}

private fun testaNullSafetyWithLet() {
    val str: String? = "Hello"
//    processNonNullString(str)  Copillation error: str can be null
    val length = str?.let {
        println("let() called on $it")
        processNonNullString(it)
        it.length
    }
    if (length == null) println("String is null :|")
    //OUTPUT: let() called on Hello
}

private fun processNonNullString(str: String){
    println("Processando... $str")
}

private fun testaPrintArray() {
    val numbers = mutableListOf("um", "dois", "três", "quatro", "cinco")
    val resultList = numbers.map { it.length }.filter { it > 3 }
    val reversedList = resultList.asReversed()
    val unique = resultList.distinct()
    println(resultList)
    println(reversedList)
    println(unique)

    //utilizando let

    val numbers2 = mutableListOf("um", "dois", "três", "quatro", "cinco")
    numbers2.map { it.length }.filter { it > 3 }.let {
        println(it)
        println(it.asReversed())
        println(it.distinct())
    }
}

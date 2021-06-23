package br.com.gustavoantunes.functional

fun testaRun(){
    testaRunExtensionFunction()
}


fun testaRunExtensionFunction(){
    val numbers = mutableListOf("um", "dois", "três", "quatro", "cinco")
    val firstAndLast = "The first element is ${numbers.first()}," +
            " the last element is ${numbers.last()}"
    println(firstAndLast)
    //OUTPUT: The first element is um, the last element is cinco

    //utilizando run
    val firstAndLast2 = numbers.run {
        "The first element is ${first()}," +
                " the last element is ${last()}"
    }
    println(firstAndLast2)
    //OUTPUT: The first element is um, the last element is cinco

}

fun testaRunNotExtensionFunction(){
    val hexNumberRegex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"

        Regex("[$sign]?[$digits$hexDigits]+")

    }
    println(hexNumberRegex)
}
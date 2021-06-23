package br.com.gustavoantunes.`functional-paradigm`

class testaAlso {
    fun execute(){
        val numbers = mutableListOf("one", "two", "three")
        numbers
            .also { println("The list elements before adding new one: \$it") }
            .add("four")
    }
}
package br.com.gustavoantunes.`functional-paradigm`

class testaWith {

    fun execute(){
        val numbers = mutableListOf("one", "two", "three")
        with(numbers) {
            println("'with' is called with argument $this")
            println("It contains $size elements")
        }

        val numbers2 = mutableListOf("one", "two", "three")
        val firstAndLast = with(numbers2) {
            "The first element is ${first()}," +
                    " the last element is ${last()}"
        }
        println(firstAndLast)
    }
}
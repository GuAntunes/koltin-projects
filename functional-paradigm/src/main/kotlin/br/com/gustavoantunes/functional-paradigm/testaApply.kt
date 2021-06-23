package br.com.gustavoantunes.`functional-paradigm`

class testaApply {

    fun execute(){
        val adam = Person("Adam").apply {
            age = 32
            city = "London"
        }
        println(adam)
    }
}

data class Person(val nome: String){

    var age: Int = 0
    var city: String = ""
}
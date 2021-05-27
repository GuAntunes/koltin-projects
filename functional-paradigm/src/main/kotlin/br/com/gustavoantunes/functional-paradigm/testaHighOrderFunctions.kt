package br.com.gustavoantunes.`functional-paradigm`

fun main() {

    Endereco(
        "Professora ...",
        "São Paulo",
        "SP"
    ).let {

    }

    "".let {::testeRecebeString}

    1.let {

    }
    teste(1){

    }

    testaLet()

    soma(1,5){ resultado ->
        println(resultado)
    }

}

private fun testaLet() {
    Endereco(
        "Professora ...",
        "São Paulo",
        "SP"
    ).let { endereco ->
        "${endereco.rua}, ${endereco.cidade}, ${endereco.estado}".uppercase()
    }.let(::println)
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit = {}) {
    println("Executando soma")
    resultado(a + b)
    println("Depois da soma")
}


fun testeRecebeString(valor: String){

}

fun teste( teste: Int, bloco: () -> Unit){

}

class Endereco(
    val rua: String,
    val cidade: String,
    val estado: String
)
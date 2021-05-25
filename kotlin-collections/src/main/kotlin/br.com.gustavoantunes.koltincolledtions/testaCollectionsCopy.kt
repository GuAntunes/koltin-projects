package br.com.gustavoantunes.koltincolledtions

fun testaCollectionsCopy(){

    //Utilizando copias das collections
    val listNames = listOf("Gustavo", "Antunes")
    val listNamesMutable = listNames.toMutableList()

    //Testando problema do shallow copy
    val bancoDeNomes = BancoDeNomes()
    bancoDeNomes.salva("Gustavo")
    bancoDeNomes.salva("Antunes")
    println(bancoDeNomes.nomes)
    
    val nomes = bancoDeNomes.nomes as MutableList
    nomes.add("Filipe")
    println(nomes)
    println(bancoDeNomes)
}

class BancoDeNomes {
    val nomes: Collection<String>
        get()= dados

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

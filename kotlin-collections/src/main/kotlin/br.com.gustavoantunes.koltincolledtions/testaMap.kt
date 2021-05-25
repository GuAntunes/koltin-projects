package br.com.gustavoantunes.koltincolledtions

fun testaMap() {

    //Inicializando Map com Pair
    val funcionarios = mapOf(Pair(1, 1000.0), Pair(2, 2000.0))
    println(funcionarios)

    //Inicializando Map com infix 'to'
    val funcionarios2 = mapOf(1 to 1000.0, 2 to 2000.0)
    println(funcionarios2)

    //Pegando valores através do indice
    println(funcionarios[1])

    //Pegando valores através do get
    println(funcionarios.get(1))

    //Inicializando um Mutable Map
    val funcionariosMapMutable = mutableMapOf(1 to 1000.0, 2 to 2000.0)
    println(funcionariosMapMutable)
    //Adicionando mais um valor através do indice
    funcionariosMapMutable[3] = 3000.0 //Forma mais utilizada
    println(funcionariosMapMutable)
    //Adicionando mais um valor através do put
    funcionariosMapMutable.put(4, 6000.0)
    println(funcionariosMapMutable)

    //Adicionando valores se não existir
    funcionariosMapMutable.putIfAbsent(4,4000.0)
    println(funcionariosMapMutable)
}
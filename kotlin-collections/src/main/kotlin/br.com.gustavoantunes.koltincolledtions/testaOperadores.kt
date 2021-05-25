package br.com.gustavoantunes.koltincolledtions


fun testaOperadores() {
    //Operador + -
    //Inicializa lista com engenheiros back e outra lista engenheiros front
    val engenheiroFront = setOf("Felipe", "Eric")
    val engenheiroBack = listOf("Gustavo", "Charles", "Eric")
    //soma as duas listas e atribui a uma lista de timeEngeharia
    val timeEngenharia = engenheiroBack + engenheiroFront
    println(timeEngenharia)

    //Realiza um teste somando as duas listas porém trocando o tipo de uma das listas para o SET
    //Verificar o tipo retornado para a nova coleção
    val timeEngenharia2 =  engenheiroFront + engenheiroBack
    println(timeEngenharia2)

    //Atualizar a lista de engenheiro back e front adicionando um nome em comum
    //Criar uma nova lista utilizando o distinct
    val timeEngenhariaDistinct = timeEngenharia.distinct()
    println(timeEngenhariaDistinct)
}
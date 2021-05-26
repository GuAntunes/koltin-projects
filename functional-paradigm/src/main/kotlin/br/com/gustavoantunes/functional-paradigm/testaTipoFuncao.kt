package br.com.gustavoantunes.`functional-paradigm`

private fun testaTipoFuncaoComFuncaoAnonima() {
    val minhaFuncaoLambda: () -> Unit = fun() {
        println("Executa como lambda")
    }
    println(minhaFuncaoLambda())
}

private fun testaTipoFuncaoLambda() {
    //val minhaFuncaoLambda: () -> Unit = {
    val minhaFuncaoLambda = {
        println("Executa como lambda")
    }
    println(minhaFuncaoLambda())
}


private fun testaTipoFuncaoReferencia() {
    //Exemplo do variável do "Tipo Função"
    // () - São os parâmetros da função
    // -> - Divisão entre os parâmetros da função e o retorno
    // *obs: Toda variável do tipo função exige um retorno
    // :: - Indica a referência do método e não sua execução
    val minhaFuncao: () -> Unit = ::teste
    //Para executar a função deveremos chamar com os parenteses
    println(minhaFuncao())
}

fun teste(){
    println("Executando função teste")
}

private fun testaTipoFuncaoClasse() {
    //Exemplo de utilização de classe como tipo função
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

//Quando utilizamos o tipo função com classe precisamos
//obrigatóriamente sobrescrever o método invoke
class Teste: () -> Unit {
    override fun invoke() {
        println("Executando invoke do Teste")
    }
}


private fun testaTipoFuncaoReferenciaComRetorno() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(1, 2))
}

fun soma(a: Int, b: Int): Int{
    return a + b
}

private fun testaTipoFuncaoClasseComRetorno() {
    //Exemplo de utilização de classe como tipo função
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(10,5))
}

class Soma: (Int, Int) -> Int {
    override fun invoke(p1: Int, b: Int): Int {
        return p1 + b
    }
}

private fun testaTipoFuncaoComFuncaoAnonimaComParametrosERetorno() {
    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int {
        return a + b
    }
    //ou
    val minhaFuncaoAnonimaSimplificada = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(40, 50))
}

private fun testaTipoFuncaoLambdaComParametrosERetorno() {
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        a + b
    }
    //ou
    val minhaFuncaoLambdaSimplificada = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(20, 30))
}

private fun testaLambdaComMultiplosRetornos() {
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        }
        salario + 100.0
    }
    println(calculaBonificacao(10000.0))
}

fun main() {



}

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
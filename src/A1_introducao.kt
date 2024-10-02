// Aula 1: Primeiro contato

fun main() {
    println("1. Olá, mundo!")

    print("2. Matheus Bento")
    print(" ")
    print("Bento")

    println()

    var nome = "3. Matheus Bento\nBentinho\nBento"
    println(nome)

    // var nome = "Não posso redeclarar uma variável"
    nome = "Matheus" // mas posso reatribuir um novo valor
    print("4. Olá, " + nome + "\n")

    var sobrenome = "Bento"
    println("5. Como vai, $nome $sobrenome?")

    val variavelEstatica = "Bom dia"
    // variavelEstatica = "Não posso reatribuir um novo valor!"

    val nomeCompleto = "6. " + nome + " Bentinho " + sobrenome
    println(nomeCompleto)
    println("7. $variavelEstatica, ${nomeCompleto}!")
}
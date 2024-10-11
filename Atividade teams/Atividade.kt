fun main() {
    // Tarefa 1: Imprimindo números em ordem crescente
    println("Tarefa 1: Números de 1 a 50 em ordem crescente")
    for (i in 1..50) {
        print("$i ")
    }
    println("\n")

    // Tarefa 2: Imprimindo números em ordem decrescente
    println("Tarefa 2: Números de 50 a 1 em ordem decrescente")
    for (i in 50 downTo 1) {
        print("$i ")
    }
    println("\n")

    // Tarefa 3: Imprimindo números de 1 a 50 excluindo múltiplos de 5
    println("Tarefa 3: Números de 1 a 50 excluindo múltiplos de 5")
    for (i in 1..50) {
        if (i % 5 != 0) {
            print("$i ")
        }
    }
    println("\n")

    // Tarefa 4: Somando números no intervalo de 1 a 500
    println("Tarefa 4: Soma dos números de 1 a 500")
    var sum = 0
    for (i in 1..500) {
        sum += i
    }
    println("A soma de 1 a 500 é: $sum")
    println("\n")

    // Tarefa 5: Imprimindo uma escada de caracteres de libra (#)
    println("Tarefa 5: Escada de caracteres de libra (#)")
    val n = 5  // Substitua 5 por qualquer valor desejado
    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}
fun main() {
    // Chamadas das funções
    exercicioUmBaloes()
    litrosUsandoDO()
    fizzBuzz()
}

// Função para calcular quantos balões de 7 litros cabem em uma caixa de 2000 litros
fun exercicioUmBaloes() {
    var caixaDagua: Int = 2000
    var contadorBaloes: Int = 0

    while (caixaDagua >= 7) {
        caixaDagua -= 7
        contadorBaloes++
    }
    println("A quantidade de balões necessários é: $contadorBaloes")
}

// Versão usando "do while"
fun litrosUsandoDO() {
    var caixa = 2000
    var numBaloes = 0

    do {
        caixa -= 7
        numBaloes++
    } while (caixa >= 7)

    println("Cabem $numBaloes balões na caixa d'água.")
}

// Função FizzBuzz para imprimir números de 1 a 50, com as regras fornecidas
fun fizzBuzz() {
    var y = 1
    while (y <= 50) {
        if (y % 3 == 0 && y % 5 == 0) {
            println("FizzBuzz")
        } else if (y % 3 == 0) {
            println("Buzz")
        } else if (y % 5 == 0) {
            println("Fizz")
        } else {
            println(y)
        }
        y++
    }
}

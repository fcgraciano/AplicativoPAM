package com.etecbauru.console

class MinhaClasse {
}

fun main(){
    //println("Hello World!! Bem vindo!")
    print("Qual é o seu nome? ")
    val nome = readln()
    print("Quantos anos você tem? ")
    val idade = readln().toInt()
    println("$nome terá ${idade + 1} anos no ano que vem.")




    /*
    val nome = "   Fernando   "
    val pontos = 21
    println("Jogadora: $nome")
    println("Pontos: $pontos")
    println("Dobro: ${pontos * 2}")
    println("Letras no nome: ${nome.length}")
    println("Letras Maiusculas: ${nome.uppercase()}")
    println("Letras Minusculas: ${nome.lowercase()}")
    println("Retira os espaços do final: ${nome.trim()}")
    println("Letras no nome: ${nome.length}")
    println("Letras no nome: ${nome.trim().length}")


    var pontos = 10
    if(pontos != 20){
        println("Diferente de 20")
    }
    var passou = true

    if(!passou){
        println("Passou")
    }else{
        println("Reprovou")
    }
    */
}

package com.etecbauru.console

class MinhaClasse {
}

fun main(){

    val mao = mutableListOf<String>()
    mao.add("2 de Ouro")
    mao.add("4 de espada")
    mao.add("5 5 4")
    mao.add("Rei de copas")
    if( mao.contains("5") ){
        println("Contem o 5")
    }else{
        mao.shuffle()
        for (item in mao){
            println(item)
        }
    }



    /*
    println("Digite sua nota")
    val nota = readln().toInt()
    when (nota) {
        in 0..5 -> println("Precisa de recuperação")
        in 6..8 -> println("Aprovado")
        else -> println("Aprovado com destaque")
    }



    //println("Hello World!! Bem vindo!")
    //print("Qual é o seu nome? ")
    //val nome = readln()
    //print("Quantos anos você tem? ")
    //val idade = readln().toInt()
    //println("$nome terá ${idade + 1} anos no ano que vem.")

    val pontos = 18
    val situacao = if (pontos > 21 ) "estourou" else "no jogo"
    println("Digite o numero da carta")
    val valor = readln().toInt()
    val nomeCarta = when (valor){
        1-> "Ás"
        11 -> "Valete"
        12 -> "Dama"
        13 -> "Rei"
        else -> valor.toString()
    }
    println(nomeCarta)

   print("Digite seus pontos ")
   val pontos = readln().toInt()
   if(pontos > 21){
       println("Estourou")
   }else if(pontos == 21){
       println("Ganhou o jogo")
   }else{
       println ("Compre mais cartas")
   }




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

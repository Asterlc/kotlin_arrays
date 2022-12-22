package arrayskt

import java.math.RoundingMode

class ArraysKotlin {

    companion object {
        var idades: IntArray = intArrayOf(19,22,33,55,70,27,25,22,23,0)
            private set
        var salarios: DoubleArray = doubleArrayOf(2200.735,2135.5,775.55)
            private set
        fun maiorIdade(): Int {
            val idade1 = 25
            val idade2 = 19
            val idade3 = 33

            val idade = if (idade1 > idade2 && idade1 > idade3) {
                idade1
            } else if (idade2 > idade1 && idade2 > idade3) {
                idade2
            } else {
                idade3
            }
            return idade
        }

        fun maiorIdadeComArray(): Int{
            println(idades.size)
            var maiorIdade = Int.MIN_VALUE

            for (idade in idades){
                if(idade > maiorIdade){
                    maiorIdade = idade
                }
            }
            return maiorIdade
        }

        fun menorIdade(): Int {
            var menorIdade = Int.MAX_VALUE
            idades.forEach { idade: Int ->
                if(idade < menorIdade){
                    menorIdade = idade
                }
            }
            return menorIdade
        }
        
        
        fun salarios(): List<Double> {
          var aumento = 1.1
            return salarios.map { salario:Double -> (salario * aumento ).toBigDecimal().setScale(2, RoundingMode.UP).toDouble()}
        }
    }
}

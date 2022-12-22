package rangeskt

class RangesKT {
    companion object{
        val serie: IntRange = 1.rangeTo(10)
        val pares = 0.until(100) step 2
        val paresInverso = 100 downTo 0 step 2
        fun intervalo1(){
            for(s in serie){
                print("$s ")
            }
        }

        fun numPares(){
            for(par in pares){
                print("$par ")
            }
        }
        fun paresInverso(){
            for(par in paresInverso){
                print("$par ")
            }
        }
    }
}
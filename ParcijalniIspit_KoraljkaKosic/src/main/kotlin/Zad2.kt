fun main(){
brojeviAsc(2, 5)
}
 fun brojeviAsc(a: Int, b: Int){
     val raspon = when{
         a < b -> a..b
         a > b -> b..a
         else ->a..b
     }
     for (br in raspon){
         println(br)
     }

 }
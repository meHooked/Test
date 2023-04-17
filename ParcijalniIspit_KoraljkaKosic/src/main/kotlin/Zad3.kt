fun main (){
    val a1 = Automobil("crvena", 1985)
    val a2 = Automobil("crna", 1930)
    val a3 = Automobil("plava", 2002)
    val a4 = Automobil("siva", 2012)
    val a5 = Automobil("zelena", 2020)

    println(Automobil.minGod())
    println(Automobil.maxGod())
    println(Automobil.avgGod())
}
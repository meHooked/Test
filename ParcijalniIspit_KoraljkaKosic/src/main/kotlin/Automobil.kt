class Automobil(boja: String, god: Int): Vozilo(boja, god) {
    override fun vozi() {
        println("Automobil vozi")
    }

    override fun parkiraj() {
        println("Automobil parkira")
    }

    override fun ubrzaj() {
        println("Automobil ubrzava")
    }

    override fun zaustaviSe() {
        println("Automobil se zaustavlja")
    }
    init {
        dodaj(this)
    }

    companion object {
        val godAuta = arrayListOf<Automobil>()
        fun dodaj(auto:Automobil){
            godAuta.add(auto)
        }

        fun maxGod():Int{
            return godAuta.map { it.god }.max()
        }
        fun minGod(): Int{
            return godAuta.map { it.god }.min()
        }
        fun avgGod ():Double{
            return godAuta.map { it.god }.sum()/ godAuta.size.toDouble()
        }

    }
}
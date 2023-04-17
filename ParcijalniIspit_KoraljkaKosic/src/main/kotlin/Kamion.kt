class Kamion(boja: String, god: Int): Vozilo(boja, god) {
    override fun vozi() {
       println("Kamion vozi")
    }

    override fun ubrzaj() {
        println("Kamion ubrzava")
    }

    override fun parkiraj() {
        println("Kamion parkira")
    }

    override fun zaustaviSe() {
        println("Kamion se zaustavlja")
    }
}
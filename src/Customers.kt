data class Customer(var id: Long, val name: String)

class CustomerDatabase() {
    val customers = listOf(
        Customer(1, "Carlos"),
        Customer(2, "Azusa"),
        Customer(3, "Pepe"),
        Customer(4, "Susana")
    )

    @Throws(IllegalAccessException::class)
    fun addCustomer(c: Customer){
        throw IllegalAccessException("You cannot add a customer")
    }

    companion object {
        @JvmStatic
        fun helloWorld(){
            println("Hello World")
        }
    }
}
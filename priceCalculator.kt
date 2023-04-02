fun calculateRetail(wholeSaleCost: Double, markupPercentage: Double): Double {
    return wholeSaleCost * (1 + markupPercentage / 100)
}

fun main () {
    print("Enter the wholesale cost of the item: ")
    val wholeSaleCost = readln().toDouble()

    print("Enter the markup percentage of the item: ")
    val markupPercentage = readln().toDouble()

    val retailPrice = calculateRetail(wholeSaleCost, markupPercentage)

    print("The retail price of the item should be: $$retailPrice")

}
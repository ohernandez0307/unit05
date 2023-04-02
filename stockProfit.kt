fun stockProfitOrLoss(NS: Int, PP: Double, PC: Double, SP: Double, SC: Double): Double {
    val profit = ((NS * SP) - SC) - ((NS * PP) + PC)
    return profit
}

fun main() {

    print("Enter the number of shares: ")
    val NS = readln().toInt()

    print("Enter the purchase price per share: ")
    val PP = readln().toDouble()

    print("Enter the purchase commision paid: ")
    val PC = readln().toDouble()

    print("Enter the sale price per share: ")
    val SP = readln().toDouble()

    print("Enter the sales commission paid: ")
    val SC = readln().toDouble()

    val profit = stockProfitOrLoss(NS, PP, PC, SP, SC)

    if (profit < 0) {
        println("The sale resulted in a loss of ${"%.2f".format(profit)}")
    } else if (profit > 0) {
        println("The sale resulted in a profit of ${"%.2f".format(profit)}")
    } else {
        println("You broke even on the sale of the stock")
    }
}
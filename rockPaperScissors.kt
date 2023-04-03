import kotlin.random.Random


fun getComputerChoice(): String {
    val cpuAnswer = when (Random.nextInt(1, 4)) {
        1 -> "r"
        2 -> "p"
        else -> "s"
    }
    return cpuAnswer
}

fun getResult(playerAnswer: String, cpuAnswer: String) {
    return when {
        (playerAnswer == "r" && cpuAnswer == "s") || (playerAnswer == "p" && cpuAnswer == "r") || (playerAnswer == "s" && cpuAnswer == "p") -> println(
            "You win!"
        )


        (playerAnswer == "r" && cpuAnswer == "p") || (playerAnswer == "p" && cpuAnswer == "s") || (playerAnswer == "s" && cpuAnswer == "r") -> println(
            "You lose!"
        )

        (playerAnswer == cpuAnswer) -> println("It's a tie!")

        else -> {
            println("Invalid")
        }
    }
}

fun main() {
    var playAgain = true


    while (playAgain) {
        println("Do you want to play Rock, Paper, Scissors? (y/n)")
        val wantsToPlay = readln().lowercase()

        if (wantsToPlay == "y") {
            println("Please choose rock, paper, or scissors")
            println("Rock is r")
            println("Paper is p")
            println("Scissors is s")

            println("What's your answer?")
            val playerAnswer = readln().lowercase()

            val cpuAnswer = getComputerChoice()
            println("The computer chose: $cpuAnswer")


            val result = getResult(playerAnswer, cpuAnswer)

        } else {
            println("Thanks for playing")
            break
        }

        println("Do you want to play again? (y/n")
        playAgain = readln().lowercase() == "y"
    }
}
package leti.example.mobileserver.model

data class UserInput(
        val text: String,
        val userId: String,
        val symbolsToSpeed: List<Pair<Pair<Int, Int>, Long>>
)
package domain


fun List<Car>.getWinner(): List<Car> {
    val maxPosition = this.maxOf { it.position }

    return this.filter { it.position == maxPosition }
}

fun List<Car>.movement(strategy: () -> Int) = this.forEach { it.move(strategy) }

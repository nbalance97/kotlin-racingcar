package domain

class Car(
    val name: String,
    position: Int
) {
    var position = position
        private set

    fun move(strategy: () -> Int) {
        val movementFlag = strategy()

        if (movementFlag >= 4) {
            position += 1
        }
    }
}

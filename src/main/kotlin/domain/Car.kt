package domain

private const val MOVEMENT_FLAG = 4

class Car(
    val name: String,
    position: Int
) {
    var position = position
        private set

    fun move(strategy: () -> Int) {
        val movementFlag = strategy()

        if (movementFlag >= MOVEMENT_FLAG) {
            position += 1
        }
    }
}

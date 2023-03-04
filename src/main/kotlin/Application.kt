import domain.Car
import domain.getWinner
import domain.movement
import view.InputView
import view.OutputView
import kotlin.random.Random

fun main() {
    val names = InputView.inputName()
    require(names.isNotEmpty()) {
        "자동차는 0개가 될 수 없습니다."
    }
    val cars = names.map {
        require(it.isNotEmpty() && it.length <= 5) { "자동차의 이름이 비거나 5자 이하일 수 없습니다." }
        Car(it, 0)
    }

    val tryCount = InputView.inputCount()
    require(tryCount in 0..10) {
        "횟수는 0회~10회 입력 가능합니다."
    }

    OutputView.printMovementTitle()
    for (i in 0 until tryCount) {
        cars.movement { Random.nextInt(10) }
        OutputView.printMovement(cars)
    }

    OutputView.printWinners(cars.getWinner())
}

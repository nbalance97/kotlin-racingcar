package view

import domain.Car

class InputView {

    fun inputName(): List<String> {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")

        return readln().split(",")
    }

    fun inputCount(): Int {
        println("시도할 회수는 몇회인가요?")

        return readln().toInt()
    }

    fun printMovementTitle() = println("실행 결과")

    fun printMovement(cars: List<Car>) {
        cars.forEach {
            println("${it.name} : ${"-".repeat(it.position)}")
        }
    }

    fun printWinners(winners: List<Car>) {
        println("${winners.joinToString(separator = ", ")}가 최종 우승했습니다.")
    }
}

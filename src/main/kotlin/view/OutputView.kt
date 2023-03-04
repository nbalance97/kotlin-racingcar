package view

import domain.Car

class OutputView {

    companion object {
        fun printMovementTitle() {
            println()
            println("실행 결과")
        }

        fun printMovement(cars: List<Car>) {
            cars.forEach {
                println("${it.name} : ${"-".repeat(it.position)}")
            }

            println()
        }

        fun printWinners(winners: List<Car>) =
            println("${ winners.joinToString(separator = ", ") { it.name }}가 최종 우승했습니다.")

    }
}

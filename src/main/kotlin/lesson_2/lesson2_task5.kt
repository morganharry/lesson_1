package lesson_2

import kotlin.math.*

fun main() {
    var deposit = 70_000.00
    val rateDeposit = 16.7 / 100
    val termDeposit = 20

    deposit = deposit * (1.0 + rateDeposit).pow(termDeposit)
    println(String.format("%.3f", deposit))
}

/*
println((deposit * 1000.0).roundToInt() / 1000.0)

ок, решение рабочее! однако, в данном случае, чтобы не заниматься лишними вычислениями,
 лучше посмотреть в сторону String.format() для нужного вывода количества знаков после запятой
 */

/*
Задача 5* к Уроку 2

Напиши программу-калькулятор для банковского приложения (такой функционал бывает на промо экранах).
Используя формулу сложных процентов (ее можно загуглить), нужно посчитать размер вклада через 20 лет с такими условиями:

 – Клиент ввел в приложении сумму 70_000 рублей (считать ее известной заранее и проинициализировать переменную);
 – Процентная ставка 16,7% (проценты начисляются в конце года);
 – Подсчитать размер вклада через 20 лет;
 – Результат должен быть дробным числом с 3 знаками после запятой;
 – Ответ должен получиться таким 1536438.428.
 */
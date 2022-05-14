val commission = 0.0075
val min_commission = 3500
fun main() {
    print("Введите сумму перевода: ")
    var amount = readln().toDouble()
    var score_commission = if (amount * commission <= min_commission) min_commission
    else amount * commission
    print("Размер комиссии составит: $score_commission")

}
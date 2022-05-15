val commission = 0.0075
val minCommision = 3500
fun main() {
    print("Введите сумму перевода: ")
    var amount = readln().toDouble()
    var scoreCommission = if (amount * commission <= minCommision) minCommision
    else amount * commission
    print("Размер комиссии составит: $scoreCommission")

}
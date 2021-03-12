package co.cyclopsapps.kotlintestpoo

/**
 * Created by Carlos Daniel Agudelo on 12/03/2021.
 */
class Execute() {

    fun method(obj: Hola, obj2: Sumar) {
        println("Hello World")
        // val obj = Hola()
        obj.saludar()
        // val obj2 = Sumar()
        println("Ingrese el primer numero: ")
        val num1 = readLine()!!.toInt()
        println("Ingrese el segundo numero: ")
        val num2 = readLine()!!.toInt()

        val suma = obj2.sumar(num1, num2)
        println("El resultado de la suma es $suma")
    }
}
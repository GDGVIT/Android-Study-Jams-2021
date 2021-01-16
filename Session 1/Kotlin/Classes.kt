class Lamp {

    // property (data member)
    private var isOn: Boolean = false

    // member function
    fun turnOn() {
        isOn = true
    }

    // member function
    fun turnOff() {
        isOn = false
    }

    fun displayLightStatus(lamp: String) {
        if (isOn)
            println("$lamp lamp is on.")
        else
            println("$lamp lamp is off.")
    }
}

fun main() {

    val l1 = Lamp() // create l1 object of ref.Lamp class
    val l2 = Lamp() // create l2 object of ref.Lamp class

    l1.turnOn()
    l2.turnOff()

    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")
}
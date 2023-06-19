
fun main() {
    //This program checks if an email address is valid or not
    println("Enter an email to check its validity:")
    val email = readlnOrNull()
    val regEx = Regex("[A-Za-z0-9_%+-.]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")
    val isValid = email?.matches(regEx)

    if (isValid!!) {
        println("The email is valid")
    }
    else {
        println("Not a valid email address")
    }
}
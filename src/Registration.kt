class Registration {

    private var email: String = ""
    private var password: String = ""

    fun getEmail() = email
    fun getPassword() = password

    fun setPassword(password: String) {
        if (password.length < 6){
            println("Пароль меньше 6 символов")
        } else {
            this.password = password
        }

    }
    fun setEmail(email: String){
        this.email = email
    }
}
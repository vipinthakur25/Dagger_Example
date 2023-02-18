package com.example.daggerexample

class UserRegistrationService {
    private val userRepository = UserRepository()
    private val emailService = EmailService()

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "Vipin112@gmmail.com", "User Registered")
    }
}
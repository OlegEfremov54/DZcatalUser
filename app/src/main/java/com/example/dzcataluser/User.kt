package com.example.dzcataluser

class User(val name: String, val age: Int) {
    override fun toString(): String {
        return "Пользователь: $name, возраст: $age лет"
    }
}
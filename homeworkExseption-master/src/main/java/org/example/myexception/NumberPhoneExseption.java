package org.example.myexception;

public class NumberPhoneExseption extends RuntimeException{
    public NumberPhoneExseption() {
        super("Введен неправильный номер. Пожалуйста введите номер в формате 7 или 11 цифр.");
    }

    public NumberPhoneExseption(String message) {
        super(message);
    }
}

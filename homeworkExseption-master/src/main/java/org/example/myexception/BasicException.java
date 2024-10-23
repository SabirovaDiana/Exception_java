package org.example.myexception;

public class BasicException extends ArrayIndexOutOfBoundsException{
    public BasicException() {
        super("Указаны не все значения.");
    }

    public BasicException(String s) {
        super("Указаны не все значения.");
    }

    public BasicException(int index) {
        super("Указаны не все значения." + index);
    }
}

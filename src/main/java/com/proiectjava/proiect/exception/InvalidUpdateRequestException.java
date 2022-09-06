package com.proiectjava.proiect.exception;

public class InvalidUpdateRequestException extends RuntimeException{
        public InvalidUpdateRequestException(){
              super("Id-ul din path trebuie sa se potriveasca cu cel din body");
        }
}

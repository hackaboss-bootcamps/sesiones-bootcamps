package com.example.grupo4.InterfaCe;

public interface Ejemplo {
	
	final String data = "Error";
	
	Void Calular();
	
	int sumar(int a, int b);

    default int restar(int a, int b) {
        return a - b;
    }
}

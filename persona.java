public class persona {
    
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;
	
}
//Iniciar atributos:
public persona () {
	this.nombre=""; //Está vacío porque no sabemos el nombre
	this.edad=0; //empezamos desde la edad 0
	this.dni=""; //No sabemos el DNI, empieza vacío
	this.sexo= GeneroPorDefecto; // elegir entre M y H, podemos iniciarlo con'H, necesario constante.**falta poner la constante!!
	this.peso=0; //iniciamos en 0
	this.altura=0; //iniciamos en 0
}

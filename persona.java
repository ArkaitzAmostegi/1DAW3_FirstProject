public class persona {
    
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;
	

//Iniciar atributos:
public persona () {
	this.nombre=""; //Está vacío porque no sabemos el nombre
	this.edad=0; //empezamos desde la edad 0
	this.DNI=""; //No sabemos el DNI, empieza vacío
	this.sexo= 'M'; // elegir entre M y H, podemos iniciarlo con'H, necesario constante.**falta poner la constante!!
	this.peso=0; //iniciamos en 0
	this.altura=0; //iniciamos en 0
}

//Función calcularIMC()
public int calcularIMC(){
	double imcCalculo= peso/(altura*altura);//Peso en kg y altura en m
	int imc=0;
	
	//Condición para la devolución del imc
	if (imcCalculo<20)imc=-1;
	else if (imcCalculo>=20 && imcCalculo<=25 )imc=0;
	else imc=1;
	
	return imc;
}
//Función esMayorDeEdad()
public boolean esMayorDeEdad() {
	boolean mayorDeEdad=false;
	
	//Condición para la devolución de la edad
	if(this.edad<18)mayorDeEdad=false;
	else mayorDeEdad=true;
	
	return mayorDeEdad;
}
}
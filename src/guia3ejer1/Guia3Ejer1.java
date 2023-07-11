/*
Realizar un programa para que una Persona pueda adoptar hasta tres Perros. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño, un constructor que
permita inicializar todos sus atributos y los respectivos métodos getter y setter de sus atributos; y
la clase Persona con atributos: nombre, apellido, edad, documento y tres atributos de tipo Perro,
un constructor que sólo permita inicializar los atributos: nombre, apellido, edad y documento. La
Persona cuenta además con los siguientes métodos:
adoptarPerro() Este método recibe por parámetro un Perro y lo asigna en alguna de las variables
vacías; si todas las variables atributos Perro están ocupadas, mostrará un mensaje “Ya no puedo
adoptar”.
perroMasGrande() Este método retornará el Perro de mayor edad.
 */
package guia3ejer1;


public class Guia3Ejer1 {

  
    public static void main(String[] args) {
        Perro perro1 = new Perro("Fido", "Labrador", 5, "Grande");
        Perro perro2 = new Perro("Luna", "Chihuahua", 3, "Pequeño");
        Perro perro3 = new Perro("Toby", "Dogo", 7, "Grande");
        Perro perro4 = new Perro("Max", "Pastor Ovejero", 2, "Mediano");
        
        Persona persona = new Persona("Juan", "Garetto", 19, 44954668);
        
        persona.adoptarPerro(perro1);
        persona.adoptarPerro(perro2);
        persona.adoptarPerro(perro3);
        persona.adoptarPerro(perro4); // No se puede adoptar más perros

        Perro perroMasViejo = persona.perroMasGrande();
        System.out.println("El perro más viejo es " + perroMasViejo.getNombre() + ", de raza " + perroMasViejo.getRaza() + " y tiene " + perroMasViejo.getEdad() + " años.");
        } 
    }
    

 
    


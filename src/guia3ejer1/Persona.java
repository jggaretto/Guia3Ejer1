
package guia3ejer1;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro perro1;
    private Perro perro2;
    private Perro perro3;
    
    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }
    
   
// Métodos getter y setter para los atributos de la clase Persona
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerro1() {
        return perro1;
    }

    public void setPerro1(Perro perro1) {
        this.perro1 = perro1;
    }

    public Perro getPerro2() {
        return perro2;
    }

    public void setPerro2(Perro perro2) {
        this.perro2 = perro2;
    }

    public Perro getPerro3() {
        return perro3;
    }

    public void setPerro3(Perro perro3) {
        this.perro3 = perro3;
    }
 // Método para adoptar un perro
    public void adoptarPerro(Perro perro) {
        if (perro1 == null) {
            perro1 = perro;
        } else if (perro2 == null) {
            perro2 = perro;
        } else if (perro3 == null) {
            perro3 = perro;
        } else {
            System.out.println("Ya no puedo adoptar");
        }
    }
    
    // Método para obtener el perro de mayor edad
    public Perro perroMasGrande() {
        Perro perroMayorEdad = perro1;
        
        if (perro2 != null && perro2.getEdad() > perroMayorEdad.getEdad()) {
            perroMayorEdad = perro2;
        }
        
        if (perro3 != null && perro3.getEdad() > perroMayorEdad.getEdad()) {
            perroMayorEdad = perro3;
        }
        
        return perroMayorEdad;
    }
}
    
  

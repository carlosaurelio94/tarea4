/*Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá
la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono,
        el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una
        variable salario que solo tenga la clase Trabajador.***/

package com.example.demo2;

public class tarea4 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 29;
        cliente.nombre = "Juan Alvarenga";
        cliente.telefono = 1123456789;
        cliente.credito = 45212.254;

        System.out.println("Su edad es: " + cliente.edad);
        System.out.println("Su nombre es: " + cliente.nombre);
        System.out.println("Su telefono es: " + cliente.telefono);
        System.out.println("Su credito disponible es: $" + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 32;
        trabajador.nombre = "Mariel Reyes";
        trabajador.telefono = 1198765432;
        trabajador.salario = 3459.32;

        System.out.println("Su edad es: " + trabajador.edad);
        System.out.println("Su nombre es: " + trabajador.nombre);
        System.out.println("Su telefono es: " + trabajador.telefono);
        System.out.println("Su salario es de: $" + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}
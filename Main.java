public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 35;
        cliente.nombre = "Ricardo Bochini";
        cliente.telefono = "11-666-66666";
        cliente.credito = 5000;
        System.out.println("El cliente se llama " + cliente.nombre + " tiene " + cliente.edad + " años, su teléfono es " + cliente.telefono + " y su credito es $" + cliente.credito);
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 30;
        trabajador.nombre = "Roberto";
        trabajador.telefono = "297-569-1563";
        trabajador.salario = 2500;
        System.out.println("El trabajador se llama " + trabajador.nombre + " tiene " + trabajador.edad + " años, su teléfono es " + trabajador.telefono + " y su salario es $" + trabajador.salario);

    }
}
class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}
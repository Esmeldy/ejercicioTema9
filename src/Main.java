public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setEdad(20);
        c1.setNombre("Jorge");
        c1.setTelefono(636552233);
        c1.setCredito(5000.90);

        System.out.println("Edad: "+c1.getEdad()+"\n" +
                "Nombre: "+c1.getNombre()+"\n" +
                "Teléfono: "+c1.getTelefono()+"\n" +
                "Crédito: "+c1.getCredito()+"\n");

        Trabajador t1 = new Trabajador();
        t1.setSalario(50000);
        System.out.println("Salario del Trabajador: "+t1.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }


}

class Trabajador extends Persona {
    private double Salario;

    public double getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }
}
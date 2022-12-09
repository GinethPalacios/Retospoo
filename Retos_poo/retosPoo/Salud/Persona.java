package Salud;
import java.util.Scanner;


public class Persona
{
        private String tipodeDocumento;
        private int documento;
        private String nombre;
        private String apellido;
        private int peso;
        private double estatura;    
        private int edad;
        private String sexo;

        public String getTipodeDocumento() {
            return tipodeDocumento;
        }
        public void setTipodeDocumento(String tipodeDocumento) {
            this.tipodeDocumento = tipodeDocumento;
        }
        public int getDocumento() {
            return documento;
        }
        public void setDocumento(int documento) {
            this.documento = documento;
        }
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
        public int getPeso() {
            return peso;
        }
        public void setPeso(int peso) {
            this.peso = peso;
        }
        public double getEstatura() {
            return estatura;
        }
        public void setEstatura(double estatura) {
            this.estatura = estatura;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public String getSexo() {
            return sexo;
        }
        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
        public Persona(){}
        
        public Persona(String tipodeDocumento,int documento,String nombre,String apellido)
        {
            this.tipodeDocumento=tipodeDocumento;
            this.documento=documento;
            this.nombre=nombre;
            this.apellido=apellido;
        }

        Scanner lectura = new Scanner (System.in);

        public void pedirDatos()
        {
            System.out.println("Ingrese su tipo documento");
            tipodeDocumento = lectura.next();
            
            System.out.println("Ingrese su numero de documento");
            documento = lectura.nextInt();

            System.out.println("Ingrese su nombre");
            nombre = lectura.next();

            System.out.println("Ingrese su apellido");
            apellido =lectura.next();

            System.out.println("Ingrese su peso");
            peso =lectura.nextInt();

            System.out.println("Ingrese su estatura");
            estatura =lectura.nextDouble();

            System.out.println("Ingrese su edad");
            edad =lectura.nextInt();

            System.out.println("Ingrese su sexo");
            sexo =lectura.next();

        }
        public void mostrarPersona()
        {
            System.out.println("El tipo de documento de la persona es "+tipodeDocumento +""+ "El numero de documento de la persona es " +documento);
            System.out.println("El nombre de la persona es "+nombre +""+  "El apellido de la persona es " +apellido);
            System.out.println("El peso de la persona es "+peso);
            System.out.println("La estatura de la persona es "+estatura);
            System.out.println("El sexo de la persona es "+sexo);
        }
        public void mayorEdad()
            {
                if(edad<18)
                {
                    System.out.println("La persona es menor de edad");
                }
                else if (edad>18)
                {
                    System.out.println("La persona es mayor de edad");
                }

            }
        public double  calcularlmc()
        {
            double x = peso/estatura;
            double pesoActual=Math.pow(x,2);

            return pesoActual;

        }
            
}  


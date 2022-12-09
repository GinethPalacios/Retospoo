package Principal;
import Salud.Persona;
import Salud.empleado;
public class inicio
 {
    public static void main(String[] args) 
    {
        Persona persona = new Persona();
        empleado Empleado = new empleado( 5000, 12, persona.getTipodeDocumento(),persona.getDocumento(),persona.getNombre(),persona.getApellido());

        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularlmc();
        persona.mayorEdad();

       Empleado.calcularHonorarios();

       double respuesta = persona.calcularlmc();

       if(respuesta<20)
            {
                System.out.println("el peso está por debajo de lo ideal");
 
            }
            else if(persona.calcularlmc()>=20 && persona.calcularlmc()<25)
            {
                System.out.println("El peso es ideal");
            }
            else if(persona.calcularlmc()>25)
            {
                System.out.println("Tiene sobrepeso");
            }
        }  
            

        

}

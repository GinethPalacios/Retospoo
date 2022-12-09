package Salud;

public class empleado  extends Persona
 {
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;
    
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public empleado (double valorHora,int horasTrabajadas,String tipodeDocumento,int documento,String nombre,String apellido)
    {
      super(tipodeDocumento,documento,nombre,apellido);
      this.valorHora=valorHora;
      this.horasTrabajadas=horasTrabajadas;
     
    }
    public void calcularHonorarios()
    {
       double totalpago = valorHora * horasTrabajadas-0.966;

       System.out.println("El tipo de documento del empleado es " +getTipodeDocumento());
       System.out.println("El numero de documento del empleado es " +getDocumento());
       System.out.println("El nombre del empleado es " +getNombre());
       System.out.println("El apellido del empleado es" +getApellido());
       System.out.println("El cargo del empleado es "+cargo);
       System.out.println("Las horas trabajadas por el empleado son" +horasTrabajadas);
       System.out.println("El valor por hora es " +valorHora);
       System.out.println("El total a pagar es " +totalpago);
   }
    
       
}



import javax.swing.JOptionPane;

public class Mascotas1 {
    // Atributos
    private int codigo;
    private String nombre;
    private String marca;
    private String accion;
    private String tipo;
    private int modelo;
    
    //getters y setters
    
    public int getCodigo() {
    	return codigo;
    }
    
    public void setCodigo(int codigo) {
    	this.codigo = codigo;
    }
    
    public int getModelo() {
    	return modelo;
    }
    
    public void setModelo(int modelo) {
    	this.modelo = modelo;
    }
    
    public String getNombre() {
    	return nombre;
    }
    
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public String getMarca(){
    	return marca;
    }
    
    public void setMarca(String marca) {
    	this.marca = marca;
    }
    
    public String getAccion() {
    	return accion;
    }
    
    public void setAccion(String accion) {
    	this.accion = accion;
    }
    
    public String getTipo() {
    	return tipo;
    }
    
    public void setTipo(String tipo) {
    	this.tipo = tipo;
    }

    public Mascotas1() {
    }

    public void ingresar() {
        nombre = JOptionPane.showInputDialog("Ingrese nombre del barco");
        marca = JOptionPane.showInputDialog("Ingrese la marca del barco");
        modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del barco"));
        accion = JOptionPane.showInputDialog("Ingrese la accion que hace el barco");
        tipo = JOptionPane.showInputDialog("Ingrese el tipo de  barco");
    }

    // Constructor de parametros
    public Mascotas1(String nombre, String marca, int modelo, String accion, String tipo) {
        this.nombre = nombre;
        this.accion = accion;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    

    //Metodo que muestra la informacion de la mascota
    public void InfoMascota() {
    	System.out.println("Nombre: " + nombre);
    	System.out.println("Marca: " + marca);
    	System.out.println("Modelo: " + modelo);
    	System.out.println("Accion: " + accion);
    	System.out.println("Tipo: " + tipo);
    }
    
  

}
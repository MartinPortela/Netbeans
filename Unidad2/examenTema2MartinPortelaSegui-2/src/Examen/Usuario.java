package Examen;


public class Usuario 
{
    //atributos
    private String  usuario;
    private String  password;
    private int     diaCaduca;
    private int     mesCaduca;
/*****************************************************************************/
    //Constructores
    public Usuario(String usuario, String password, int diaCaduca, int mesCaduca) {
        this.usuario = usuario;
        this.password = password;
        this.diaCaduca = diaCaduca;
        this.mesCaduca = mesCaduca;
    }

    
    public Usuario(String usuario, int diaCaduca, int mesCaduca) {
        this.usuario = usuario;
        this.diaCaduca = diaCaduca;
        this.mesCaduca = mesCaduca;
    }
/*****************************************************************************/
    //Getters
    public int getDiaCaduca() {
        return diaCaduca;
    }

    public int getMesCaduca() {
        return mesCaduca;
    }
/*****************************************************************************/
    //Setter
    public void setPassword(String password) {
        this.password = password;
    }
    
/*****************************************************************************/
    //M�todos
    public void comprobar(int a, int b)
    {
        if ((a>=diaCaduca) && (b>=mesCaduca))
            System.out.println("La contrase�a ha caducado");
        else
            System.out.println("La contrase�a es v�lida");
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", password=" + password + ", diaCaduca=" + diaCaduca + ", mesCaduca=" + mesCaduca + '}';
    }
    
    
    
}

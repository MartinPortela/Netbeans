package ex3evMartin;


class Hecho
{
    protected String tipo;
    protected String descripcion;
    protected int dia;
    protected int mes;
    protected int anno;
    
    public Hecho(String tipo, String descripcion, int dia, int mes, int anno) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.dia = dia;
        this.mes = (mes >= 1 && mes <= 12) ? mes : 1;
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Hecho{" + "tipo=" + tipo + ", descripcion=" + descripcion + ", dia=" + dia + ", mes=" + mes + ", anno=" + anno + '}';
    }
}
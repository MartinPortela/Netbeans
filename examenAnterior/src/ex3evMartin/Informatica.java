
package ex3evMartin;

class Informatica extends Hecho {
    public Informatica(String tipo, String descripcion, int dia, int mes, int anno) {
        super(tipo, descripcion, dia, mes, anno);
    }
    
    // Nota: no estoy seguro si esto debe aplicar también para Medicina, pero en ese caso es tomar estos métodos y pasarlo a la clase Hecho
    public void formatearInformacion() {
        System.out.println(descripcion + " el dia " + dia + " de " + obtenerMes() + " del anno " + anno);
    }
    
    private String obtenerMes() {
        String resultado = null;
        switch (mes) {
            case 1:
                resultado = "enero";
                break;
            case 2: 
                resultado = "febrero";
                break;
            case 3:
                resultado = "marzo";
                break;
            case 4:
                resultado = "abril";
                break;
            case 5:
                resultado = "mayo";
                break;
            case 6:
                resultado = "junio";
                break;
            case 7:
                resultado = "julio";
                break;
            case 8:
                resultado = "agosto";
                break;
            case 9:
                resultado = "septiembre";
                break;
            case 10:
                resultado = "octubre";
                break;
            case 11:
                resultado = "noviembre";
                break;
            case 12:
                resultado = "diciembre";
                break;
        }
        return resultado;
    }
}
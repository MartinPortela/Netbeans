
package Practica1;


public class DireccionIP 
{
    String  cadena;
    int byte1,byte2,byte3,byte4;
    char    clase;
    String atributo;
/******************************************************************************************************************************************/
        public DireccionIP(String cadena) {
        this.cadena = cadena;
     }
 /******************************************************************************************************************************************/   
    public void extraerBytes()
    {
       String[] octetos = cadena.split("\\."); 
       byte1 = Integer.parseInt(octetos[0]); 
        byte2 = Integer.parseInt(octetos[1]); 
        byte3 = Integer.parseInt(octetos[2]); 
        byte4 = Integer.parseInt(octetos[3]); 
    }
 /******************************************************************************************************************************************/   
   public void comprobarClase()
   {
       if (byte1>=0 && byte1<=127) 
       {
           clase='A';
       }
       else if(byte1>=128 && byte1<=191)
       {
           clase='B';
       }
       else if(byte1>=192 && byte1<=223)
       {
           clase='C';
       }
       else if(byte1>=224 && byte1<=239)
       {
           clase='D';
       }
       else
       {
           clase='E';
       }
   }
 /******************************************************************************************************************************************/  
   public void comprobarAtributo()
   {
       switch (clase) 
       {
           case 'A':
               if (byte1==10) 
               {
                   atributo="Privada";
               }
               else
                   atributo="Pública";
               
               break;
           case 'B':
               if (byte1==172 && (byte2>=16 && byte2<=31)) 
               {
                   atributo="Privada";
               }
               else
                   atributo="Pública";
               
               break;
           case 'C':
               if (byte1==192 && byte2==168) 
               {
                   atributo="Privada";
               }
               else
                   atributo="Pública";
               
               break;
           default:
               atributo="Pública";
       }
   }
/******************************************************************************************************************************************/
    @Override
    public String toString() {
        return "DireccionIP{" + "cadena=" + cadena + ", byte1=" + byte1 + ", byte2=" + byte2 + ", byte3=" + byte3 + ", byte4=" + byte4 + ", clase=" + clase + ", atributo=" + atributo + '}';
    }

    
   
}

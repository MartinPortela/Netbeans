package ex3evMartin;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex3evMartin {
    
    //Sirve para extraer
    public static String extraer(String cadena) {
        String resultado = null;
        boolean comienzo = false;
        int c = 0;
        for (int i = 0; ; i++) {
            
            //Aquí hago que termine la extracción cuando encuentra un <
            if (comienzo && cadena.charAt(i) == '<') {
                resultado = cadena.substring(c, i);
                //System.out.println();
                break;
            }
            //Aquí hago que el cortar la cadena empiece después del primer >
            if (cadena.charAt(i) == '>') {
                comienzo = true;
                c = i + 1;
            }
        }
        
        return resultado.trim();
    }
    public static void main(String[] args) {
        ArrayList<Hecho> listaHechos = new ArrayList<>();
        
        boolean salir = false;
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\Users\\prog\\Downloads\\hechos.xml");
            BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine();
            
            int posibleError = 0;
            int contarLineas = 1;
            while (cadena != null) {
                if (cadena.trim().equalsIgnoreCase("<hecho>")) {
                    // System.out.println(cadena);
                    
                    String tipo = null;
                    String descripcion = null;
                    String dia = null;
                    String mes = null;
                    String anno = null;
                    do {
                        cadena = entrada.readLine().trim();
                        contarLineas++;
                        
                        if (cadena.contains("<tipo>")) {
                            tipo = extraer(cadena);
                            posibleError = contarLineas;
                        }
                        if (cadena.contains("<descripcion>")) descripcion = extraer(cadena);
                        if (cadena.contains("<dia>")) dia = extraer(cadena);
                        if (cadena.contains("<mes>")) mes = extraer(cadena);
                        if (cadena.contains("<anno>")) anno = extraer(cadena);
                        
                    } while (!cadena.equalsIgnoreCase("</hecho>")); //acaba do while
                    
                    if (tipo.equalsIgnoreCase("informatica")) {
                        listaHechos.add(new Informatica(tipo, descripcion, Integer.parseInt(dia),  Integer.parseInt(mes),  Integer.parseInt(anno)));
                    } else if (tipo.equalsIgnoreCase("medicina")){
                        listaHechos.add(new Medicina(tipo, descripcion, Integer.parseInt(dia),  Integer.parseInt(mes),  Integer.parseInt(anno)));
                    } else {
                        System.out.println("DOCUMENTO INCORRECTO. ERROR EN LA LINEA " + posibleError);
                        salir = true;
                    }
                }
                
                cadena = entrada.readLine();
                contarLineas++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (fr != null) fr.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }//fin try
        
        if (!salir) { 
            ArrayList<Informatica> listaInformatica = new ArrayList<>();
            ArrayList<Medicina> listaMedicina = new ArrayList<>();

            System.out.println("TODOS LOS HECHOS -----------");
            for (int i = 0; i < listaHechos.size(); i++) {
                if (listaHechos.get(i) instanceof Informatica) listaInformatica.add((Informatica)listaHechos.get(i));
                if (listaHechos.get(i) instanceof Medicina) listaMedicina.add((Medicina)listaHechos.get(i));

                System.out.println(listaHechos.get(i).toString());
            }

            System.out.println("\nHECHOS DE INFORMATICA -----------");
            for (int i = 0; i < listaInformatica.size(); i++) {
                System.out.println(listaInformatica.get(i).toString());
            }

            System.out.println("\nHECHOS DE MEDICINA -----------");
            for (int i = 0; i < listaMedicina.size(); i++) {
                System.out.println(listaMedicina.get(i).toString());
            }

            System.out.println("");
            for (int i = 0; i < listaInformatica.size(); i++) {
                listaInformatica.get(i).formatearInformacion();
            }
        }
    }
}
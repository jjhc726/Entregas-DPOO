package uniandes.dpoo.taller2.procesamiento;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.List;

public class ReadFile {
    public static List<List<String>> main(String[] args) {
        String nombreArchivo = "data/combos.txt";
        List<List<String>> MatrizCombos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabrasEnLinea = linea.split(";");
                List<String> palabras = new ArrayList<>();
                for (String palabra : palabrasEnLinea) {
                    palabras.add(palabra);
                }
                MatrizCombos.add(palabras);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        	
        try {
            FileReader archivoReader = new FileReader(nombreArchivo);

            int caracter;
            System.out.print("\nCombos:\n");
            while ((caracter = archivoReader.read()) != -1) {
                System.out.print((char) caracter);
            }

            archivoReader.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        
        return MatrizCombos;
    }
    public static List<List<String>> ingredientes(String[] args) {
        String nombreArchivo = "data/ingredientes.txt";
        
        List<List<String>> MatrizIngredientes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabrasEnLinea = linea.split(";");
                List<String> palabras = new ArrayList<>();
                for (String palabra : palabrasEnLinea) {
                    palabras.add(palabra);
                }
                MatrizIngredientes.add(palabras);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            FileReader archivoReader = new FileReader(nombreArchivo);

            int caracter;
            System.out.print("\n\nIngredientes:\n");
            while ((caracter = archivoReader.read()) != -1) {
                System.out.print((char) caracter);
            	
            }

            archivoReader.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        
        return MatrizIngredientes;
    }
    public static List<List<String>> menu(String[] args) {
        String nombreArchivo = "data/menu.txt";
        
        List<List<String>> MatrizMenu = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabrasEnLinea = linea.split(";");
                List<String> palabras = new ArrayList<>();
                for (String palabra : palabrasEnLinea) {
                    palabras.add(palabra);
                }
                MatrizMenu.add(palabras);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            FileReader archivoReader = new FileReader(nombreArchivo);

            int caracter;
            System.out.print("\n\nMenu:\n");
            while ((caracter = archivoReader.read()) != -1) {
                System.out.print((char) caracter);
            	
            }

            archivoReader.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return MatrizMenu;
    }
    
    
}

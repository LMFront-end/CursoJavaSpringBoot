
import java.util.Scanner;


public class ClassScanner {
    
    public static void main(String args[]){
        
        //System.out.println("Escribe tu nombre: ");
        
        // Preguntar al usuario el nombre (leer datos de la consola)
        //Scanner consola = new Scanner(System.in);
        // metodo nextLine() para leer datos de la consola
        //var usuario = consola.nextLine();
       
        //System.out.println("usuario = " + usuario);
        //System.out.println("Escribe profesion:");
        //var titulo = consola.nextLine();
        //System.out.println("titulo = " + titulo);
        
        //  TIPO CHAR
        
//        char miCaracter = 'a';
//        System.out.println("miCaracter = " + miCaracter);
        
        // caracteres unicode
        //(signo de admiración)
//        char varChar = '\u0021';
//        System.out.println("varChar = " + varChar);
        
//        char varcharDecimal = 33;
//        System.out.println("varcharDecimal = " + varcharDecimal);
//        
//        char varSimbolo = '!';
//        System.out.println("varSimbolo = " + varSimbolo);
        
        // INFERENCIA CON VAR
        
//        var varChar1 = '\u0021';
//        System.out.println("varChar1 = " + varChar1);
        
        // No pondemos asociar directamente un decimal
//        var varcharDecimal1 = 33;
//        System.out.println("varcharDecimal1 = " + varcharDecimal1);
        
        /*
        * conversion de char a entero
        */
//        int variableCharSimbolo = '!';
//        System.out.println("variableCharSimbolo = " + variableCharSimbolo);
//        
//        
//        var varSimbolo1 = '!';
//        System.out.println("varSimbolo1 = " + varSimbolo1);


        // BOOLEAN
        
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean){
            System.out.println("La bandera es verdadera");
        }else{
            System.out.println("La bandera es falsa");
        }
        
        var edad = 30;
        var esAdulto = edad >= 18;
        
        if(esAdulto){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menot de edad");
        }
           
       
    }
}

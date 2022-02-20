// Comentario simple 
// Mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        //System.out.println("Hola Mundo desde Java");

        // Variables en Java
        // Tipo entero
        // Definimos la variable
        //int miVariableEntera = 10;
        //System.out.println(miVariableEntera);

        // reasignar valor de la variable
        //miVariableEntera = 20;
        //System.out.println(miVariableEntera);

        // Variable string
        //String miVariableCadena = "Saludos";
        //System.out.println(miVariableCadena);

        //miVariableCadena = "Adios";
        //System.out.println(miVariableCadena);

        // var - Inferencia de tipos en Java
        //var miNumero = 23;
        //System.out.println(miNumero);

        //var miVariableCadena2 = "Lina Maria";
        //sout --> atajo
        //System.out.println(miVariableCadena2);

        //soutv -->atajo
        //System.out.println("miVariableCadena2 = " + miVariableCadena2);
        // Reglas para definit variables en Java
        /*
            -> Usar camelCase
            -> El nombre de las variables no se pueden inicializar
               con un numero.
            -> Caracteres permitidos (_, $)
            Eje:
            var _miVariable = 1;
            var $miVariable = 2;
         */
        // CONCATENACIÓN DE CADENAS
        //var usuario = "Lina";
        //var titulo = "Desarrolladora";

        //var union = titulo + " " + usuario;
        //System.out.println("union = " + union);
        
        // No es recomendable usar nombres cortos para nombrar variables
        //var i = 3;
        //var j = 4;
        
        // Se realiza la suma de numeros
        //System.out.println(i + j);
        
        // La evaluacion de izquierda a derecha, realiza suma
        //System.out.println(i + j + usuario);
        // Conexto cadena --> Si primero se encuentra una cadena, todo se evalua
        // como una cadena
        
        //System.out.println(usuario + i + j);
        
        // para llevar a cabo la suma (modifica la prioridad en la evaluación)
        //System.out.println(usuario + (i + j));

        // CARACTERES ESPECIALES
        
        //var nombre = "Lina Maria";
        // Salto de linea \n
        //System.out.println("Nueva Linea: \n " + nombre);
        
        // tabulador \t
        //System.out.println("Tabulador: \t " + nombre);
        
        // retroceso \b (elimina los caracteres)
        //System.out.println("Retroceso: \b" + nombre);
        
        // comilla simple ('') y comilla doble ("")
        // en el caso de la comilla simple no es necesario poner \
        //System.out.println("Comilla simple \'" + nombre + "'");
        //System.out.println("Comilla simple \"" + nombre + "\"");
        
        /**
         * TIPOS PRIMITIVOS ENTEROS:
         * byte(16 bits)
         * short(16 bits)
         * char(16 bits)
         * int(32 bits)
         * long(64 bits)
         */
        
        // tipo byte
        //byte numeroByte = 10;
        /*
        System.out.println(numeroByte);
        // Valores max y min del byte
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);
        */
        
        // tipo short
        
        //short numeroShort = 10;
        /*
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo short:" + Short.MAX_VALUE);
        */
        
        // tipo int
        // pasar de int a long (L)
        //int numeroInt = (int)2147483648L;
        /*
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo short:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo short:" + Integer.MAX_VALUE);
       */
    
        /*
        *   TIPOS PRIMITIVOS DE TIPO FLOTANTE: float y double
        */
        
        // tipo float
        //float numeroFloat = (float)10.3;
        /*
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor min float: " + Float.MIN_VALUE);
        System.out.println("Valor max float: " + Float.MAX_VALUE);
        */
        
        // tipo double
        /*
        double numeroDouble = 10;
        System.out.println("Valor min double: " + Double.MIN_VALUE);
        System.out.println("Valor min double: " + Double.MAX_VALUE);
        */
        
        // INFERENCIA DE TIPOS CON VAT Y TIPOS PRIMITIVOS
        
         //var numeroEntero = 10;
        //System.out.println("numeroEntero = " + numeroEntero);
        
        //var numeroDouble = 10.6;
        //System.out.println("numeroDouble = " + numeroDouble);
        
        // inferencia de tipos
        //var numeroFloat = 10.0F;
        //System.out.println("numeroFloat = " + numeroFloat);

        
    }

}

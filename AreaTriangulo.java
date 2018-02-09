import java.util.Scanner;

/**
 * Esta clase nos permite hayar el area de un triangulo.
 *
 * @author (ronald)
 * @version (a version number or a date)
 */
public class AreaTriangulo
{
   public static void main(String[] args)
   {
       //Datos de entrada: informacion que necesito del usuario
       //base y altura
       double base, altura;
       //datos Salida: donde estara almacenado el resultado del probleam(area)
       double area;
       
       // primera tarea: preguntar al usuario datos de entrada
       Scanner teclado = new Scanner(System.in);
       
       System.out.print("Ingrese el valor de la base: ");
       base = teclado.nextDouble();
       
       System.out.print("Ingrese el valor de la altura: ");
       altura = teclado.nextDouble();
       
       //calcular el dato de salida
       area = base * altura / 2;
       
       //Por ultimo mostrar al usuario el dato de salida
       System.out.println("El area es: " + area);
      
}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornos4;

/**
 *
 * @author adria
 */
public class Main { 

    public static void main(String[] args) {

        eCesta cesta = NuevoMetodo();

        double bonoactual = cesta.bonificacion();

        System.out.println("Su bono actual es  "+ bonoactual ); 

    }

    public static eCesta NuevoMetodo() {
        eCesta cesta;
        cesta = new eCesta("Apellidos del alumno",100, "dni del alumno", 10);
        try
            
        {
            
            cesta.comprar(50);

        } catch (Exception e)

        {

            System.out.println("No se puede pagar  ");

        }
        try

        {

            System.out.println("Solicitar actualización de bono");

            cesta.ActualizarBono(100);

        } catch (Exception e)

        {

            System.out.println("Error al recargar");

        }
        return cesta;
    }

}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Cuenta> cuentas;
    public static void main(String[] args) {
        int numeroFactura;
        double montoACancelar;
        Cuenta modificarCuenta;
        cuentas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("---------------------");
            System.out.println("Sistema de banco");
            System.out.println("1. Crear una cuenta de tipo Corriente");
            System.out.println("2. Crear una cuenta de tipo Ahorro");
            System.out.println("3. Depositar");
            System.out.println("4. Retirar");
            System.out.println("5. Generar intereses mensuales");
            System.out.println("6. Pagar una factura");
            System.out.println("7. Mostrar el estado de cuenta");
            System.out.println("8. Mostrar lista de cuentas");
            System.out.println("9. Salir");
            System.out.println("Ingrese una opcion:");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    /* YOUR CODE HERE */
                    break;
                }
                case 2: {
                    /* YOUR CODE HERE */
                    break;
                }
                case 3: {
                    /* YOUR CODE HERE */
                    break;
                }
                case 4:
                    /* YOUR CODE HERE */
                    break;
                case 5:
                    /* YOUR CODE HERE */
                    break;
                case 6:
                    /* YOUR CODE HERE */
                    break;
                case 7:
                    /* YOUR CODE HERE */
                    break;
                case 8:
                    mostrarLista(cuentas);
                    break;
                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (option != 9);



    }

    //Al proporcionarle una lista de cuentas puede Mostrar una lista de tipo cuenta
    public static void mostrarLista(List<Cuenta> cuentas){
        System.out.println("-------Lista------");
        for(Cuenta cuenta : cuentas){
            System.out.println("-------Cuenta: "+cuenta.getNumeroDeCuenta()+" ------");
            System.out.println("Balance: "+cuenta.getBalance());
            System.out.println("Transacciones: "+cuenta.getContadorTransacciones());
        }

    }

    // Al proporcionarle un numero de cuenta y una lista de tipo cuenta puede devolver un objeto de tipo Cuenta
    public static Cuenta buscarCuenta(long numeroCuenta, List<Cuenta> cuentas) {

        for (Cuenta cuenta : cuentas) {
            if ( cuenta.getNumeroDeCuenta() == numeroCuenta ) {
                return cuenta;
            }
        }
        return null;
    }
}
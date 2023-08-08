public class Main {
    public static void main(String[] args) {

    }
}

public static void main(String[] args) {
        // a) Informar por consola si un número escogido por usted es primo o no.
        int numero = 23;
        boolean esPrimo = Calculo.esPrimo(numero);
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        // b) Mostrar por consola el valor absoluto del valor -90;
        int valor = -90;
        int valorAbsoluto = Calculo.valorAbsoluto(valor);
        System.out.println("El valor absoluto de " + valor + " es " + valorAbsoluto);

        // c) Mostrar las raíces de la ecuación de segundo grado con los coeficientes: 1, 0 y 9.
        int a = 1;
        int b = 0;
        int c = 9;
        Calculo.calcularRaices(a, b, c);
    }
}
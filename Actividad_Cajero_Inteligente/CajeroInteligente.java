public class CajeroInteligente {
    public static void main(String[] args) {
        int[] compras = {12000, 25000, 8000, 35000, 15000};

        int cantidadCompras = 0;
        int totalVentas = 0;
        int comprasGrandes = 0;

        for (int i = 0; i < compras.length; i++) {

            totalVentas += compras[i];
            cantidadCompras++;

            if (compras[i] > 20000) {
                comprasGrandes++;
            }
        }
        double promedio = (double) totalVentas/cantidadCompras;

        System.out.println("====RESUMEN DE VENTAS====");
        System.out.println("Cantidad de compras: " + cantidadCompras);
        System.out.println("Dinero recaudado: $" + totalVentas);
        System.out.printf("Promedio por compra: $%.2f%n", promedio);
        System.out.println("Compras superiores a $20.000: " + comprasGrandes);
        if (totalVentas < 100000) {
            System.out.println("Mensaje: Podemos mejorar las ventas.");
        }
    }
}

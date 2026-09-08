public class CajeroInteligenteParte2 {
    public static void main(String[] args) {
        int[] compras = {12000, 25000, 8000, 35000, 15000, 30000, 15000, 22000};

        int cantidadCompras = 0;
        int totalVentas = 0;
        int comprasGrandes = 0;
        int comprasPequenas = 0;

        for (int i = 0; i < compras.length; i++) {

            totalVentas += compras[i];
            cantidadCompras++;

            if (compras[i] > 30000) {
                comprasGrandes++;
            } else if (compras[i] <= 20000) {
                comprasPequenas++;
            }
        }
        double promedio = (double) totalVentas/cantidadCompras;
        System.out.println("====RESUMEN DE VENTAS====");
        System.out.println("Cantidad de compras: " + cantidadCompras);
        System.out.println("Dinero recaudado: $" + totalVentas);
        System.out.printf("Promedio por compra: $%.2f%n", promedio);
        System.out.println("Compras superiores a $30.000: " + comprasGrandes);
        System.out.println("Compras inferiores o iguales a $20.000: " + comprasPequenas);
        if (promedio > 25000) {
            System.out.println("Dia excelente.");
        } else {
            System.out.println("Dia normal.");
        }
    }
}
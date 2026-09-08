public class EjemploAcumuladorContador {
    public static void main(String[] args) {

        int[] notas = {4, 2, 5, 3, 1};

        int aprobados = 0;
        int suma = 0;

        for (int i=0; i<notas.length; i++) {
            suma += notas[i];

            if (notas[i] >= 3) {
                aprobados++;
            }
        }
        double promedio = (double) suma/notas.length;
        
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Promedio: " + promedio);

    }
}
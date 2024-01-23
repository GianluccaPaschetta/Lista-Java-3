public class Conversao {
    public static void main(String[] args) {
        String texto = "19.09";  
        double numero = Double.parseDouble(texto);
        
        System.out.printf("%.2f%n", numero);
        System.out.println(numero);
    }
}


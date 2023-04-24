public class ConversorDeGraus {

    public static void main(String[] args) {

        double temperaturaEmCelcius = 31.4;
        double temperaturaEmFarenheit = (temperaturaEmCelcius * 1.8)+32;

        int temperaturaEmFarenheitInteiro = (int)temperaturaEmFarenheit;

        System.out.println("Fazendo casting do valor de double  para int a temperatura em farenheit fica "+temperaturaEmFarenheitInteiro);
        String mensagem = String.format("A temperatura original em Farenheit usando double fica em %f",temperaturaEmFarenheit);

        System.out.println(mensagem);
    }
}

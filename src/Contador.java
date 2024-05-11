import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Informe o valor do primeiro parâmetro: ");
        int primeiroParametro = teclado.nextInt();
        System.out.println(" Informe o valor do primeiro parâmetro: ");
        int segundoParametro = teclado.nextInt();

        try {
            contador(primeiroParametro, segundoParametro);
        } catch( ParametrosInvalidosException exception){
            System.out.println("O primeiro parametro é maior que o segundo");
        }
    }
    public static void contador( int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm>parametroDois)
            throw new ParametrosInvalidosException();
        else{
            int contagem = parametroDois - parametroUm;
            for(int i=0; i <= contagem; i++){
                System.out.println("Imprimindo o número "+i);
            }
        }

    }
}

import java.util.Scanner;
public class contador{
     public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro Parametro: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo Parametro: ");
        int parametroDois = scanner.nextInt();

        try{
            int resultado = contar(parametroDois, parametroUm);
            System.out.println("resultado: " + resultado);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O Segundo parametro deve ser MAIOR que o Primeiro parametro");
        }
        scanner.close();
    }
        static int contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            if(parametroUm > parametroDois){
                throw new ParametrosInvalidosException("O Segundo parametro deve ser maior que o Primeiro. ");
            }
            else{
                int contagem = parametroDois - parametroUm;
                for(int i = parametroUm; i <= parametroDois; i++){
                    System.out.println("Os numeros do resultado das variaveis sao: " + contagem);
                }
                return contagem;
            }
        }
    }

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
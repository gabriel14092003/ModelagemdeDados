import java.util.Scanner;

public class HelloWord {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero:");
        int numero2 = scanner.nextInt();
        int soma =  numero1 + numero2;


        if(soma <= 2) {
            System.out.println(" A soma dos numeros e igual a " + soma);
        }else if (soma != 12 ) {
            System.out.println(" Entrou no else-if");
        }else{
        System.out.println(" tudo errado");
    }


        System.out.println(" A soma dos numeros e igual a " + soma);



    }
}

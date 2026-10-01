import java.util.Scanner;

public class Fatorial{
    static long fatorial(int n){
    int i;
    long fat = 1;

    for(i = n; i > 0; i--){
        fat = fat * i;
    } 
    return fat;
}

public static void main(String[] args) {
    Scanner n = new Scanner(System.in);

    int num;
    System.out.print("Digite um número: ");
    num = n.nextInt();
    System.out.printf("O fatorial de %d é igual a: %d", num, fatorial(num));
    n.close();
    }
}

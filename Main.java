import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {

    int usuarioinput = -1, computadorinput; 
    Scanner sc1 = new Scanner(System.in);
    Random random = new Random();
    computadorinput = random.nextInt(1000) + 1;
      do {
      System.out.println("Digite um número de 01 a 1000 para participar do sorteio: ");
    usuarioinput = sc1.nextInt();
        if (usuarioinput==computadorinput){
        System.out.println("Parabéns, você ganhou um curso JAVA no Senai Anchieta!!!");
        }
        if (usuarioinput < computadorinput) {
        System.out.println("O número sorteado é maior.");
          System.out.println("");
        }
          if  (usuarioinput > computadorinput){
          System.out.println("O número sorteado é menor.");
            System.out.println("");
          }
      } while (usuarioinput != computadorinput);
      
    }  
}
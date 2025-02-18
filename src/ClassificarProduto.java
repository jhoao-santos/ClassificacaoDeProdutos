
import java.util.Scanner;

public class ClassificarProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String produto1 = "Teclado";
        String produto2 = "Mouse";
        String produto3 = "Monitor";

        double preco = 0;

        System.out.println("Digite o nome do Produto:");

        String nomeProduto = scanner.nextLine();

        if (produto1.equalsIgnoreCase(nomeProduto) || 
        produto2.equalsIgnoreCase(nomeProduto)|| 
        produto3.equalsIgnoreCase(nomeProduto)) {
            System.out.println("O produto ja existir. Quer atualizar o preco? (Sim/Nao) ");

            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.println("Digite o novo preco: ");
                preco = scanner.nextDouble();
            } else {
                System.out.println("O preco nao foi atualizado. ");

                scanner.close();
                return;
            }

            
        } else {
            System.out.println("Digite o preco do produto: ");
                preco = scanner.nextDouble();   

        }
        
        if (preco < 50) {
            System.out.println("Classificacao: Barato! ");
            
        } else if (preco >= 50 && preco <= 100) {
            System.out.println("Classificacao: Moderado! ");
            
        } else {
            System.out.println("Classificacao: Caro! ");
        }

        System.out.println("Produto: " + nomeProduto + " Preco: " + preco);


       







        scanner.close();
    }
    
}

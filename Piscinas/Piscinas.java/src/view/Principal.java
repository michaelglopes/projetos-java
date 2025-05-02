package view;
import java.text.DecimalFormat;
import java.util.Scanner;
import model.Piscina;
import Service.ServicosPicina;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicosPicina servicos = new ServicosPicina();

        System.out.println("Digite o comprimento da piscina (em metros): ");
        double comprimento = scanner.nextDouble();
        
        System.out.println("Digite a largura da piscina (em metros): ");
        double largura = scanner.nextDouble();
        
        System.out.println("Digite a profundidade máxima da piscina (em metros): ");
        double profundidadeMaxima = scanner.nextDouble();
        
        Piscina piscina = new Piscina(comprimento, largura, 0, profundidadeMaxima);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Encher a piscina");
            System.out.println("2. Esvaziar a piscina");
            System.out.println("3. Encher parcialmente a piscina");
            System.out.println("4. Calcular quantidade de água");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    servicos.encherPiscida(piscina);
                    System.out.println("A piscina foi cheia até a profundidade máxima de " + piscina.getProfundidadeMaxima() + " metros.");
                    break;
                case 2:
                    piscina.esvaziar();
                    System.out.println("A piscina foi esvaziada.");
                    break;
                case 3:
                    System.out.print("Digite a profundidade desejada para encher (em metros): ");
                    double profundidade = scanner.nextDouble();
                    servicos.encherParcialmentePiscina(piscina, profundidade);
                    System.out.println("A piscina foi preenchida parcialmente até " + piscina.getProfundidadeAtual() + " metros.");
                    break;
                case 4:
                    double quantidadeAgua = servicos.quantidadeAgua(piscina);
                    DecimalFormat df = new DecimalFormat("#,##0.00");
                    System.out.println("A quantidade de água na piscina é: " + df.format(quantidadeAgua) + " litros.");
                    break;
                case 5:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
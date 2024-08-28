import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();

        Scanner s = new Scanner(System.in);
        int valor = 0;

        boolean somatorio = false;
        boolean media = false;

        while(true){
            System.out.println("\nDigite -1 para ativar o visualizador de somatorio ");
            System.out.println("e -2 para ativar o visualizador de media");
            System.out.println("\nEntre um valor positivo maior que zero (0=fim):");
            valor = Integer.parseInt(s.nextLine());

            if (valor == 0)
                break;

            dados.add(valor);
        }
        System.out.println("Fim");
    }
}

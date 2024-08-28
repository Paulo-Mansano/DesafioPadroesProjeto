public class App {
    public static void main(String[] args) throws Exception {
        EstrategiaCodificacao EstrategiaSimples = new EstrategiaSimples();
        Codificador cod = new Codificador(EstrategiaSimples);

        String aux = "Desafio Padrões de Projeto";

        System.out.println(aux);
        System.out.println("Estratégia simples: ");

        aux = cod.codifica(aux);
        System.out.println(aux);

        aux = cod.decodifica(aux);
        System.out.println(aux);

        System.out.println("Estratégia desloca: ");
        EstrategiaCodificacao EstrategiaDesloca= new EstrategiaDesloca();
        cod.setEstrategia(EstrategiaDesloca);

        aux = cod.codifica(aux);
        System.out.println(aux);
        aux = cod.decodifica(aux);
        System.out.println(aux);
    }
}

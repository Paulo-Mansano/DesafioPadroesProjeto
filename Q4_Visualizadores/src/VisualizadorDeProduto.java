import java.util.List;

public class VisualizadorDeProduto implements Visualizador {
    private List<Integer> valores;

    public VisualizadorDeProduto(List<Integer> valores){
        this.valores = valores;
    }

    public void defineValores(List<Integer> valores){
        this.valores = valores;
    }

    public void acrescentaValor(Integer valor){
        this.valores.add(valor);
    }

    public void exibeProduto(){
        int produto = 0;

        System.out.println("Produto: "+produto+", quantidade de elementos analisados: "+valores.size());
    }

}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;

    public LinkedList<Visualizador> visualizadores;

    public FonteDeDados(){
        lst = new LinkedList<>();
        var cm = new VisualizadorDeMedia(getValores());
        var cs = new VisualizadorDeSomatorio(getValores());
        visualizadores = new LinkedList<>();
        visualizadores.add(cm);
        visualizadores.add(cs);
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notify(value);
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }


    public void notify (int numero) {
        for (Visualizador visualizador : visualizadores) {
            visualizador.update(numero);
        }
    }

}
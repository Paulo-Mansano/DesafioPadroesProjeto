import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Venda implements VendaComponent {
    private LocalDateTime data;
    private List<VendaComponent> itens;

    public Venda(LocalDateTime data) {
        this.data = data;
        this.itens = new ArrayList<>();
    }

    public List<VendaComponent> getItens() {
        return itens;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void adicionarItem(VendaComponent item) {
        itens.add(item);
    }

    @Override
    public double getPreco() {
        double total = 0.0;
        for (VendaComponent item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public String emitirComprovante() {
        StringBuilder nota = new StringBuilder();
        nota.append("COMPROVANTE DE VENDA\n");
        nota.append(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        nota.append("\n");
        for (VendaComponent item : itens) {
            nota.append(item.emitirComprovante()).append("\n");
        }
        nota.append(String.format("Total: %.2f", getPreco()));
        return nota.toString();
    }
}

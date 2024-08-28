public class ValidaEmail extends Validador{
    String valor;
    Validador.Tipo tipo;

    ValidaEmail(String valor){
        this.valor = valor;
        this.tipo = Validador.Tipo.EMAIL;
    }

    public boolean valida(){
        return super.valida(this.tipo, this.valor);
    }
}

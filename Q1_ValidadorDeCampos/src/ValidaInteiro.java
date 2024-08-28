public class ValidaInteiro extends Validador{
    String valor;
    Validador.Tipo tipo;

    ValidaInteiro(String valor){
        this.valor = valor;
        this.tipo = Validador.Tipo.INTEIRO;
    }

    public boolean valida(){
        return super.valida(this.tipo, this.valor);
    }
}

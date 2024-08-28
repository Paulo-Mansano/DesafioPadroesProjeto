public class ValidaMatricula extends Validador{
    String valor;
    Validador.Tipo tipo;

    ValidaMatricula(String valor){
        this.valor = valor;
        this.tipo = Validador.Tipo.MATRICULA;
    }

    public boolean valida(){
        return super.valida(this.tipo, this.valor);
    }
}

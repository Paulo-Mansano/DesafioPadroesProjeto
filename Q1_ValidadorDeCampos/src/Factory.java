public class Factory {
    public static Validador criaValidacao(Validador.Tipo tipo, String valor){

        switch (tipo) {
            case INTEIRO:
                return new ValidaInteiro(valor);
                break;
            case EMAIL:
                return new ValidaEmail(valor);
                break;
            case MATRICULA:
                return new ValidaMatricula(valor);
                break;

            default:
                break;
        }


    }   
}

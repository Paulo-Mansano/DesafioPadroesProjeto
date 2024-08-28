public class Codificador{

    private EstrategiaCodificacao estrategia;

    public Codificador(EstrategiaCodificacao estrategia){
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaCodificacao estrategia){
        this.estrategia = estrategia;
    }

    public String codifica(String mensagem){
        return estrategia.codifica(mensagem);
    }

    public String decodifica(String mensagem){
        return estrategia.decodifica(mensagem);
    }

}

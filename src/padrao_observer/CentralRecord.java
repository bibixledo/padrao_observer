package padrao_observer;

public class CentralRecord implements Observador {
    
    private DadosDaAudiencia dados;
    private final Sujeito centralDeAudiencia;
    
    public CentralRecord(Sujeito centralDeAudiencia){
        this.centralDeAudiencia = centralDeAudiencia;
        this.centralDeAudiencia.incluirObservador(this);
    }
    
    @Override
    public void atualizar(DadosDaAudiencia dados){
        this.dados = dados;
        mostrarElementos();
    }
      public void mostrarElementos(){
        System.out.println("--- CENTRAL RECORD ---");
        System.out.println("GLOBO: " + dados.getGlobo());
        System.out.println("SBT:    " + dados.getSbt());
        System.out.println("RECORD: " + dados.getRecord());
    }
    
}

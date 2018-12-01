package padrao_observer;

public class CentralSbt implements Observador {
    
    private DadosDaAudiencia dados;
    private Sujeito centralDeAudiencia;
    
    public CentralSbt(Sujeito centralDeAudiencia){
        this.centralDeAudiencia = centralDeAudiencia;
        this.centralDeAudiencia.incluirObservador(this);
    }
    
    @Override
    public void atualizar(DadosDaAudiencia dados){
        this.dados = dados;
        mostrarElementos();
    }
    
     public void mostrarElementos(){
        System.out.println("--- CENTRAL SBT --- ");
        System.out.println("GLOBO: " + dados.getGlobo());
        System.out.println("SBT:    " + dados.getSbt());
        System.out.println("RECORD: " + dados.getRecord());
    }
 
    
}

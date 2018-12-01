package padrao_observer;
import java.util.*;

public class CentralAudiencia implements Sujeito {
    private ArrayList observers;
    private DadosDaAudiencia dados;
    
    public CentralAudiencia(){
        observers = new ArrayList();
    }

    @Override
    public void incluirObservador(Observador o) {
         observers.add(o);
    }

    @Override
    public void removerObservador(Observador o) {
       int i = observers.indexOf(o);   
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notificarObservador() {
       for (int i = 0; i < observers.size(); i++) {
            Observador observer = (Observador)observers.get(i);
            observer.atualizar(dados);
        }
    }
    
    public void setDados(DadosDaAudiencia dados){
        this.dados = dados;
        notificarObservador();
    }    
    
}

package padrao_observer;

/*
 *  Fornece uma interface para acrescentar e remover objetos
 *  permitindo incluir e retirar objetos observer.
 */
public interface Sujeito {
    public void incluirObservador(Observador o);
    public void removerObservador(Observador o);
    public void notificarObservador();
}

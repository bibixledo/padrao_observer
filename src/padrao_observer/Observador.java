package padrao_observer;

/**
 *  Define uma interface de atualizacao para objetos que 
 *  deveriam ser notificados sobre as mudancas ocorrida
 *  em um subject.
 */
public interface Observador {
    public void atualizar(DadosDaAudiencia dados);

}

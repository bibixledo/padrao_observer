package padrao_observer;

public class DadosDaAudiencia {
    
    private int Globo = 0;
    private int Sbt = 0;
    private int Record = 0;
    
    public DadosDaAudiencia(int Globo, int Sbt, int Record){
        this.Globo = Globo;
        this.Sbt = Sbt;
        this.Record = Record;
    }

    public int getGlobo() { return Globo;}
    public int getSbt() { return Sbt; }
    public int getRecord() { return Record; }
    
}

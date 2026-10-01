import java.util.List;
import java.util.Locale;

public abstract class Frete {

    private final String nomeCliente;
    private final double valorCarga;
        
    protected Frete(String nomeCliente, double valorCarga){
        this.nomeCliente = nomeCliente;
        this.valorCarga = valorCarga;
    }
    public abstract Double getPorcCarga();
    public abstract String getModalidade();
    public abstract List<String> getDocumentosExigidos();

    //Fórmula: Valor do Frete = Valor da Carga x 0,02 (ou 2%)
    public double calcularValorFrete(){
        return valorCarga * getPorcCarga();
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public String resumo(){
        return String.format(Locale.forLanguageTag("pt-BR"),
        "Modalidade: %s | Cliente: %s | Valor Frete: R$: %.2f | Documentos: %s",
        getModalidade(), nomeCliente, calcularValorFrete(), String.join(",", getDocumentosExigidos()));
    }

}

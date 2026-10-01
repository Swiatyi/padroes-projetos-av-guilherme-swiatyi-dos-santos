
import java.util.List;

public class FreteMar extends Frete{

    public FreteMar(String nomeCliente, double valorCarga) {
        super(nomeCliente, valorCarga);
    }

    @Override
    public Double getPorcCarga() {
        return 0.01;
    }

    @Override
    public String getModalidade() {
        return "Maritimo";
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return List.of("Bill of Landing", "Fatura Comercial");
    }

}
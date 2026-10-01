import java.util.List;

public class FreteRodo extends Frete {

    public FreteRodo(String nomeCliente, double valorCarga) {
        super(nomeCliente, valorCarga);
    }

    @Override
    public Double getPorcCarga() {
        return 0.02;
    }

    @Override
    public String getModalidade() {
        return "Rodoviário";
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return List.of("CT-e", "MDF-e");
    }
    
}

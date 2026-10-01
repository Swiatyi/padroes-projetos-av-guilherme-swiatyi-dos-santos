
import java.util.List;

public class FreteAereo extends Frete{

    public FreteAereo(String nomeCliente, double valorCarga) {
        super(nomeCliente, valorCarga);
    }

    @Override
    public Double getPorcCarga() {
       return 0.06; //6%
    }

    @Override
    public String getModalidade() {
        return "Aereo";
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return List.of("Air Waybill");
    }

}
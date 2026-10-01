public class EmissorAereo extends EmissorFrete{

    @Override
    protected Frete criarFrete(String nomeCliente, double valorCarga) {
       return new FreteAereo(nomeCliente, valorCarga);
    }
    
}

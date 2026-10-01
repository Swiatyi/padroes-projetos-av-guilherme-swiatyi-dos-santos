public class EmissorMar extends EmissorFrete {

    @Override
    protected Frete criarFrete(String nomeCliente, double valorCarga) {
        return new FreteMar(nomeCliente, valorCarga);
    }
    
}

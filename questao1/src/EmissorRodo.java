public class EmissorRodo extends EmissorFrete {

    @Override
    protected Frete criarFrete(String nomeCliente, double valorCarga) {
        return new FreteRodo(nomeCliente, valorCarga);
    }
    
}

public abstract class EmissorFrete {

protected abstract Frete criarFrete(String nomeCliente, double valorCarga);

public Frete emitir(String nomeCliente, double valorCarga){
    Frete frete = criarFrete(nomeCliente, valorCarga);
    double taxa = frete.calcularValorFrete();
    System.out.println("Frete Calculado: " + taxa);
    System.out.println(frete.resumo());
    return frete;
}

}
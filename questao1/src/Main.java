public class Main {
    public static void main(String[] args) {
        EmissorFrete rodo = new EmissorRodo();
        EmissorFrete ar = new EmissorAereo();
        EmissorFrete mar = new EmissorMar();

        rodo.emitir("Rodrigao", 20000);
        ar.emitir("Robertao", 4000);
        mar.emitir("Gabriela", 90000);
    }
}
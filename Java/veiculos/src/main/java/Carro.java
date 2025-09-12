public class Carro extends Veiculo {
    private int nPortas;

    public Carro(String Marca, String Placa, int nPortas) {
        super(Marca, Placa);
        this.nPortas = nPortas;
    }

    public int getnPortas() {
        return nPortas;
    }
    
    public String toString() {
        return super.toString() + ", nPortas=" + nPortas;
    }

}

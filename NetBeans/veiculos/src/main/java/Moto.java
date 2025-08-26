public class Moto extends Veiculo {
    private boolean PartidaEletrica;

    public Moto(String Marca, String Placa, boolean PartidaEletrica) {
        super(Marca, Placa);
        this.PartidaEletrica = PartidaEletrica;
    }

    public String toString() {
        return super.toString() + ", Partida Elétrica=" + PartidaEletrica;
    }
    
    
}

public class Veiculo {
    protected String Marca;
    protected String Placa;
    private int qtdComb; //quantidade de combustível
    private int Km;

    public Veiculo(String Marca, String Placa) {
        this.Marca = Marca;
        this.Placa = Placa;
        this.qtdComb = 0;
        this.Km = 0;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    public String getPlaca() {
        return Placa;
    }
    
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    
    public int getQtdComb() {
        return qtdComb;
    }

    public void setQtdComb(int qtdComb) {
        this.qtdComb = qtdComb;
    }

    public int getKm() {
        return Km;
    }

    public void setKm(int Km) {
        this.Km = Km;
    }

    private float calculaDesempenho(){
        if(qtdComb == 0) return -1.0f;
        return ((float)Km / (float)qtdComb);
    }
    
    public String toString() {
        return "Marca=" + Marca + ", Placa=" + Placa + ", Desempenho=" + calculaDesempenho();
    }
    
    public boolean fazViagem(int iKm, int iComb){
        if(iKm>=200) {
            System.out.println("Autonomia Ultrapassada");
            return false;
        }
        else if (iComb >20) {
            System.out.println("Tanque Ultrapassado");
            return false;
        }
        qtdComb += iComb;
        Km += iKm;
        return true;
    }
}

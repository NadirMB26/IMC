
package Clases;

public class IMC {
private String Peso;
private String Altura;
private String Imc;
private String FechaHora;
private String nombreu;

    public IMC() {
    }

    public IMC(String Peso, String Altura, String Imc, String FechaHora, String nombreu) {
        this.Peso = Peso;
        this.Altura = Altura;
        this.Imc = Imc;
        this.FechaHora = FechaHora;
        this.nombreu = nombreu;
    }

    public String getNombreu() {
        return nombreu;
    }

    public void setNombreu(String nombreu) {
        this.nombreu = nombreu;
    }

    public String getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(String FechaHora) {
        this.FechaHora = FechaHora;
    }

    public String getImc() {
        return Imc;
    }

    public void setImc(String Imc) {
        this.Imc = Imc;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

  

}

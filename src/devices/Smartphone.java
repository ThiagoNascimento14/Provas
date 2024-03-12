package devices;

public class Smartphone extends Device implements DeviceInterface {

    private String botaoLigar;
    private String botaoDesligar;
    private String entradaCarregador;

    public String getBotaoLigar() {
        return botaoLigar;
    }

    public void setBotaoLigar(String botaoLigar) {
        this.botaoLigar = botaoLigar;
    }

    public String getBotaoDesligar() {
        return botaoDesligar;
    }

    public void setBotaoDesligar(String botaoDesligar) {
        this.botaoDesligar = botaoDesligar;
    }

    public String getEntradaCarregador() {
        return entradaCarregador;
    }

    public void setEntradaCarregador(String entradaCarregador) {
        this.entradaCarregador = entradaCarregador;
    }

    public void performAction() {
        System.out.println("Realizando uma ligação");

    }

}

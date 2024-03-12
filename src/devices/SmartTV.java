package devices;

public class SmartTV extends Device implements DeviceInterface {

    private String tela;
    private String autoFalante;
    private String botaoAumentaVolume;
    private String botaoAbaixaVolume;

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getAutoFalante() {
        return autoFalante;
    }

    public void setAutoFalante(String autoFalante) {
        this.autoFalante = autoFalante;
    }

    public String getBotaoAumentaVolume() {
        return botaoAumentaVolume;
    }

    public void setBotaoAumentaVolume(String botaoAumentaVolume) {
        this.botaoAumentaVolume = botaoAumentaVolume;
    }

    public String getBotaoAbaixaVolume() {
        return botaoAbaixaVolume;
    }

    public void setBotaoAbaixaVolume(String botaoAbaixaVolume) {
        this.botaoAbaixaVolume = botaoAbaixaVolume;
    }

    public void performAction() {
        System.out.println("Acessando Netflix");
    }

}
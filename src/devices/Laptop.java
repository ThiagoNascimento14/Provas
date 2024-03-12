package devices;

public class Laptop extends Device implements DeviceInterface {

    private String teclado;
    private String tela;
    private String mouse;

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void performAction() {
        System.out.println("Inicializando Windows");
    }
}

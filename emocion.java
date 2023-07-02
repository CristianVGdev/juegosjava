public class EmocionPorEntrevista {
    private String estadoEmocional;

    public EmocionPorEntrevista(String estadoEmocional) {
        this.estadoEmocional = estadoEmocional;
    }

    public void mostrarEmocion() {
        if (estadoEmocional.equals("emocionado")) {
            System.out.println("Estoy emocionado por la entrevista o las pruebas de programacion!");
        } else {
            System.out.println("No estoy emocionado por la entrevista o las pruebas de programacion.");
        }
    }

    public static void main(String[] args) {
        EmocionPorEntrevista emocion = new EmocionPorEntrevista("emocionado");
        emocion.mostrarEmocion();
    }
}

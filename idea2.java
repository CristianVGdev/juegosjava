public class EsperandoLlamada {
    private boolean llamadaRecibida;

    public EsperandoLlamada() {
        this.llamadaRecibida = false;
    }

    public void recibirLlamada() {
        this.llamadaRecibida = true;
        System.out.println("Recibi la llamada! Estoy emocionado por la oportunidad.");
    }

    public void mostrarEstadoEspera() {
        if (llamadaRecibida) {
            System.out.println("Quedo al pendiente de lso coemntarios :D");
        } else {
            System.out.println("Aun no he recibido la llamada. Estoy emocionado y esperando con ansias.");
        }
    }

    public static void main(String[] args) {
        EsperandoLlamada espera = new EsperandoLlamada();
        espera.mostrarEstadoEspera();

        
        try {
            Thread.sleep(5000); 
            espera.recibirLlamada();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        espera.mostrarEstadoEspera();
    }
}

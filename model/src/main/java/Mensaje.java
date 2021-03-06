package main.java;

public class Mensaje {
    public String action;
    public boolean turno;
    public Mano mano;
    public Carta carta;
    public int[] vidas;
    public String gato, gato2; //


    public static Mensaje ready(String gato){
        Mensaje mensaje = new Mensaje();
        mensaje.action = "ready";
        mensaje.gato = gato;
        return mensaje;
    }

    public static Mensaje readyOk(){
        Mensaje mensaje = new Mensaje();
        mensaje.action = "ready";
        return mensaje;
    }

    public static Mensaje starts(){
        Mensaje mensaje = new Mensaje();
        mensaje.action = "ready";
        return mensaje;
    }

    public static Mensaje start(String gato, String gato2, Mano mano, boolean turnoBool) {
        Mensaje mensaje = new Mensaje();
        mensaje.action = "start";
        mensaje.gato = gato;
        mensaje.gato2 = gato2;
        mensaje.turno = turnoBool;
        return mensaje;
    }


    public Mensaje(){}



    public Mensaje(String action) {
        this.action = action;
    }


    public Mensaje(String action, Carta carta) {
        this.action = action;
        this.carta = carta;
    }

    public Mensaje(String action, Mano mano) {
        this.action = action;
        this.mano = mano;
    }

    public Mensaje(String action, int[] vidas){
        this.action = action;
        this.vidas = vidas;
    }



    public static class Carta {
        public String nombre;
        public int valor;

        public Carta(){}

        public Carta(String nombre, int valor) {
            this.nombre = nombre;
            this.valor = valor;
        }
    }

    public static class Mano {
        public Carta[] cartaList;

        public Mano(){}

        public Mano(Carta[] cartaList) {
            this.cartaList = cartaList;
        }
    }
}

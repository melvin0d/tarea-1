package cuartel;

public class Criminal extends Policia {
    private String nomb;
    private String ced;
    private String del;
    private String pol;



    public void setNombre(String n) {
        this.nomb = n;
    }

    public String getNombre() {
        return this.nomb;
    }

    public void setCedula(String c) {
        this.ced = c;
    }

    public String getCedula() {
        return this.ced;
    }

    public void setDelito(int idDelito) {
        if (idDelito == 1)
            this.del = "Robo";
        else if (idDelito == 2)
            this.del = "Violacion";
        else if (idDelito == 3)
            this.del = "Homicidio";
        else
            this.del = "Desconocido";
    }

    public String getDelito() {
        return this.del;
    }

    public void setPolicia(String policia ) {
        this.pol = policia;
    }
    public String getPolicia() {
        return this.pol;
    }

}



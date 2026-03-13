public class Lamparita {
    

    // Implementación de la Clase Lamparita que sirva...

    private boolean estado;

    public Lamparita()
    {
        estado = false;
    }

    public void encender()
    {
        this.estado = true;
    }

    public void apagar()
    {
        this.estado = false;
    }

    public boolean estadoLampara()
    {
        return this.estado;
    }
}

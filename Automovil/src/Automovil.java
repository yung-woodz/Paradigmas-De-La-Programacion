public class Automovil {

    String marca, modelo;
    float motor;
    int combustible[] = new int[5];
    int tipoAuto[] = new int[6];
    int puertas;
    int nro_asientos;
    double velocidadMax;
    int color[] = new int[8];
    double valocidadAct;


    public Automovil() {

    }

    public Automovil(String marca, String modelo, float motor, int[] combustible, int[] tipoAuto, int puertas,
            int nro_asientos, double velocidadMax, int[] color, double valocidadAct) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.combustible = combustible;
        this.tipoAuto = tipoAuto;
        this.puertas = puertas;
        this.nro_asientos = nro_asientos;
        this.velocidadMax = velocidadMax;
        this.color = color;
        this.valocidadAct = valocidadAct;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public int[] getCombustible() {
        return combustible;
    }

    public void setCombustible(int[] combustible) {
        this.combustible = combustible;
    }

    public int[] getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(int[] tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getNro_asientos() {
        return nro_asientos;
    }

    public void setNro_asientos(int nro_asientos) {
        this.nro_asientos = nro_asientos;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int[] getColor() {
        return color;
    }

    public void setColor(int[] color) {
        this.color = color;
    }

    public double getValocidadAct() {
        return valocidadAct;
    }

    public void setValocidadAct(double valocidadAct) {
        this.valocidadAct = valocidadAct;
    } 

    
    



}




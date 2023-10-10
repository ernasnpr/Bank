import java.lang.Math;
class Titik {
    private int x;
    private int y;
    public Titik() {
        this.x = 0;
        this.y = 0;
    }
    public void inisialisasiTitik(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void tampilTitik() {
        System.out.println("Titik: (" + x + ", " + y + ")");
    }
    public void perkalihanSkalar(int skalar) {
        x *= skalar;
        y *= skalar;
    }
    public void pencerminanSumbuX() {
        y = -y;
    }
    public void pencerminanSumbuY() {
        x = -x;
    }
    public double jarak(Titik t2) {
        int dx = t2.x - x;
        int dy = t2.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
class Bank {
    private double saldo;
    public Bank(double saldo) {
        this.saldo = saldo;
    }
    public void simpanUang(double jumlah) {
        saldo += jumlah;
    }
    public void ambilUang(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }
    public double getSaldo() {
        return saldo;
    }
}
class BankBeraksi {
    public static void main(String[] args) {
        Bank bank = new Bank(100000);
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());
        bank.simpanUang(500000);
        System.out.println("Simpan uang: Rp. 500000");
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());
        bank.ambilUang(150000);
        System.out.println("Ambil uang: Rp. 150000");
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());
    }
}
package entities;

public class Account {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;
    public Account(){
    }
    public Account(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Double getLimiteSaque() {
        return limiteSaque;
    }
    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
    public void deposito(Double quantia){
    saldo = saldo + quantia;
    }
    public void saque (Double quantia){
        saldo = saldo - quantia;
    }
}

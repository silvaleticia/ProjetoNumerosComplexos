package Classe;

public class NComplexo {

    //atributos
    private int parteReal = 0;
    private int parteImaginaria = 0;

    //metodos
    public NComplexo() {
    }

    public NComplexo(int parteReal, int parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public NComplexo(NComplexo objeto) {
        this.parteReal = objeto.parteReal;
        this.parteImaginaria = objeto.parteImaginaria;
    }

    public void set(int parteReal, int parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public void set(NComplexo objeto) {
        this.parteReal = objeto.parteReal;
        this.parteImaginaria = objeto.parteImaginaria;
    }

    public String get() {
        return (parteReal + "+" + parteImaginaria + "i");
    }

    public NComplexo adicionar(NComplexo objeto) {
        int pr = this.parteReal + objeto.parteReal;
        int pi = this.parteImaginaria + objeto.parteImaginaria;
        NComplexo aux = new NComplexo(pr, pi);
        return aux;
    }

    public NComplexo subtrair(NComplexo objeto) {
        int pr = this.parteReal - objeto.parteReal;
        int pi = this.parteImaginaria - objeto.parteImaginaria;
        NComplexo aux = new NComplexo(pr, pi);
        return aux;
    }

    public NComplexo multiplicar(NComplexo objeto) {
        int pr = this.parteReal * objeto.parteReal - this.parteImaginaria * objeto.parteImaginaria;
        int pi = this.parteReal * objeto.parteImaginaria + this.parteImaginaria * objeto.parteReal;
        NComplexo aux = new NComplexo(pr, pi);
        return aux;
    }

    public NComplexo dividir(NComplexo objeto) {
        int pr = (this.parteReal * objeto.parteReal + this.parteImaginaria * objeto.parteImaginaria) / (objeto.parteReal * objeto.parteReal + objeto.parteImaginaria * objeto.parteImaginaria);
        int pi = ((this.parteImaginaria * objeto.parteReal - this.parteReal * objeto.parteImaginaria) / (objeto.parteReal * objeto.parteReal + objeto.parteImaginaria * objeto.parteImaginaria));

        NComplexo aux = new NComplexo(pr, pi);
        return aux;
    }

    public Boolean eIgual(NComplexo objeto) {
        Boolean igual= true;
        if(this.parteReal==objeto.parteReal && this.parteImaginaria==objeto.parteImaginaria){
            igual=true;
        }else{
            igual = false;
        }
        return igual;
    }
     
    public Boolean eDiferente(NComplexo objeto){
        Boolean diferente=false;
        if(this.parteReal!= objeto.parteReal && this.parteImaginaria !=objeto.parteImaginaria){
            diferente = true;
        }else{
            diferente = false;
        }
        return diferente;
    }

}

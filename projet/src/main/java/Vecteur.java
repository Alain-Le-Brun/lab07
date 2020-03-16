public class Vecteur{
    public int nb_a = 0;
    public int nb_b = 0;
    public Vecteur(){
        this.nb_a = 0;
        this.nb_b = 0;
    }
    public Vecteur(int nb_1, int nb_2){
        this.nb_a = nb_1;
        this.nb_b = nb_2;
    }
    public int getComp_1(){
        return this.nb_a;
    }
    public int getComp_2(){
        return this.nb_b;
    }

    public void add(Vecteur vecEntree){
        this.nb_a = this.nb_a + vecEntree.getComp_1();
        this.nb_b = this.nb_b + vecEntree.getComp_2();
    }
    public void diff(Vecteur vecEntree){
        this.nb_a = this.nb_a - vecEntree.getComp_1();
        this.nb_b = this.nb_b - vecEntree.getComp_2();
    }
    public String enChaine(){
        String sortie = "(" + nb_a + ", aaa" + nb_b + ")"  + "\n";
        return sortie;
    }
    public void affVecteur(){
        System.out.print(this.enChaine());
    }
}
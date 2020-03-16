public class Vecteur{
    public double nb_a = 0;
    public double nb_b = 0;
    public Vecteur(){
        this.nb_a = 0;
        this.nb_b = 0;
    }
    public Vecteur(int nb_1, int nb_2){
        this.nb_a = nb_1;
        this.nb_b = nb_2;
    }
    public double getComp_1(){
        return this.nb_a;
    }
    public double getComp_2(){
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
<<<<<<< HEAD
    public double prodEuclid(){
        double sortie = 0;
        sortie = Math.sqrt(this.nb_a * this.nb_a + this.nb_b * this.nb_b);
        return sortie;
=======
    public void prodComplexe(Vecteur vecEntree){
        int comp_1 = this.getComp_1() * vecEntree.getComp_1() - this.getComp_2() * vecEntree.getComp_2();
        int comp_2 = this.getComp_1() * vecEntree.getComp_2() + this.getComp_2() * vecEntree.getComp_1();
        this.nb_a = comp_1;
        this.nb_b = comp_2;
>>>>>>> complexe
    }
    public String enChaine(){
        String sortie = "(" + nb_a + ", " + nb_b + ")"  + "\n";
        return sortie;
    }
    public void affVecteur(){
        System.out.print(this.enChaine());
    }
}
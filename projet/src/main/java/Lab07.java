public class Lab07 {
    public static void main(String args[]){
        Vecteur vect_1 = new Vecteur();
        Vecteur vect_2 = new Vecteur(3, 4);
        vect_1.affVecteur();
        vect_1.add(vect_2);
        Vecteur vect_3 = new Vecteur(2, -2);
        vect_1.affVecteur();
        vect_1.diff(vect_3);
        vect_1.affVecteur();
        Vecteur vect_a = new Vecteur(1, 1);
        double euc = vect_a.prodEuclid();
        System.out.println("euc: " + euc);
        vect_a = new Vecteur(2, 3);
        Vecteur vect_b = new Vecteur(1, 2);
        vect_a.prodComplexe(vect_b);
        vect_a.affVecteur();
        vect_a = new Vecteur(1, 1);
        vect_b = new Vecteur(0, 1);
        vect_a.prodComplexe(vect_b);
        vect_a.affVecteur();
    }
}

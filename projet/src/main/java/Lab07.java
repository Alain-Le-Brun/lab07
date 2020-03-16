public class Lab07 {
    public static void main(String args[]){
        Vecteur vect_1 = new Vecteur();
        Vecteur vect_2 = new Vecteur(3, 4);
        vect_1.affVecteur();
        vect_1.add(vect_2);
        Vecteur vect_3 = new Vecteur(2, -2);
        vect_1.affVecteur();
        vect_1.add(vect_3);
        vect_1.affVecteur();
    }
}

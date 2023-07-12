package edunova;

import javax.swing.JOptionPane;

public class E04Ulaz {

    public static void main(String[] args) {

        boolean dev = false;

        int redova = dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
        int stupci = dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));

        int[][] matrica = new int[redova][stupci];

        int brojac = 1;
        int maxBroj = redova * stupci; 

        int gornjaGranicaRedova = redova - 1;
        int gornjaGranicaStupaca = stupci - 1;
        int donjaGranicaRedova = 0;
        int donjaGranicaStupaca = 0;

        while (brojac <= maxBroj) {
           
            for (int i = gornjaGranicaStupaca; i >= donjaGranicaStupaca; i--) {
                matrica[gornjaGranicaRedova][i] = brojac++;
            }
            gornjaGranicaRedova--;

           
            for (int i = gornjaGranicaRedova; i >= donjaGranicaRedova; i--) {
                matrica[i][donjaGranicaStupaca] = brojac++;
            }
            donjaGranicaStupaca++;

            
            for (int i = donjaGranicaStupaca; i <= gornjaGranicaStupaca; i++) {
                matrica[donjaGranicaRedova][i] = brojac++;
            }
            donjaGranicaRedova++;

            
            for (int i = donjaGranicaRedova; i <= gornjaGranicaRedova; i++) {
                matrica[i][gornjaGranicaStupaca] = brojac++;
            }
            gornjaGranicaStupaca--;
        }

        
        for (int i = 0; i < redova; i++) {
            for (int j = 0; j < stupci; j++) {
                System.out.print(matrica[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

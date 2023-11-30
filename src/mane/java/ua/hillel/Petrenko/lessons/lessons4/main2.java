package ua.hillel.Petrenko.lessons.lessons4;

public class main2 {
    public static void main(String[] args) {
//   Сила династии Ли
              int liVoin = 13;
              int liArcher = 24;
              int liRider= 46;
//  Сила династии Минь
              int miVoin = 9;
              int miArcher = 35;
              int miRider = 12;
//  Сумма династии Ли
              int liArmy = 860 * (liVoin + liArcher + liRider);
//  Сумма династии Минь


              double miArmy = (860 * 1.5) * (miRider + miArcher + miVoin);
        System.out.println("Сила армии династии Ли =" + liArmy);
        System.out.println("Сила армии династии Минь =" + miArmy);
        System.out.println(" Победит династия Минь");
    }
}

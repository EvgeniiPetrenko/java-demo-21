package ua.hillel.Petrenko.lessons.lessons4;

public class main2 {
    public static void main(String[] args) {
//   ���� �������� ��
              int liVoin = 13;
              int liArcher = 24;
              int liRider= 46;
//  ���� �������� ����
              int miVoin = 9;
              int miArcher = 35;
              int miRider = 12;
//  ����� �������� ��
              int liArmy = 860 * (liVoin + liArcher + liRider);
//  ����� �������� ����


              double miArmy = (860 * 1.5) * (miRider + miArcher + miVoin);
        System.out.println("���� ����� �������� �� =" + liArmy);
        System.out.println("���� ����� �������� ���� =" + miArmy);
        System.out.println(" ������� �������� ����");
    }
}

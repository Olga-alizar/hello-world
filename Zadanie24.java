//������� ����� � ������� ����������� ���������� �������. ��� ����������
//� ������ ������ ���������� ����� ����������: ���������, ��������, ������.
//������� ������ ��� ��������� ������� ���������� ������ � �������, ���������
//���� �������� (����� ������ �������� ���������� compareTo � �������). �������
//��� ������������: ���������� ����� ���������� ������, � ����, ������ � �������.
//�� �����������. ������� ����� ��� ������ ������.
import package1.AnyTime;

public class Zadanie24 {
    public static void main(String[] args){
     AnyTime ltime1 = new AnyTime();
     AnyTime ltime2 = new AnyTime();
     ltime1.getTime(4512);
     ltime1.printAnyTime();
     ltime2.getTime(4, 5, 12);
     ltime2.printAnyTime();
     System.out.println("��������� ��������� (11-1� ������, 0- �����, -11 1-� ������): " + ltime1.CompareTime(ltime2));
 }
}

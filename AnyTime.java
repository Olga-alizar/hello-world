//������� ����� � ������� ����������� ���������� �������. ��� ����������
//� ������ ������ ���������� ����� ����������: ���������, ��������, ������.
//������� ������ ��� ��������� ������� ���������� ������ � �������, ���������
//���� �������� (����� ������ �������� ���������� compareTo � �������). �������
//��� ������������: ���������� ����� ���������� ������, � ����, ������ � �������.
//�� �����������. ������� ����� ��� ������ ������.
package package1;
public class AnyTime {
    private int time_interval;
    private int hours;
    private int min;
    private int sec;
    public void printAnyTime() {
      System.out.println("���������� �������: " + this.hours + ":"  + this.min + ":" + this.sec + ", ����� ������: " + this.time_interval);
    }
    public void getTime(int s) {
      this.time_interval = s;
      this.hours = s/3600;
      this.min = s % 3600 / 60;
      this.sec = s % 3600 % 60;
    }
    public void getTime(int h, int m, int s) {
      this.hours = h;
      this.min =m;
      this.sec = s;
      this.time_interval = s;
      this.CalcSec();
    }
    public void CalcSec() {
      this.time_interval = this.hours * 3600 + this.min * 60 + this.sec;
    }
    public int CompareTime(AnyTime second) {
       if (this.time_interval > second.time_interval){
           return 11;
          } else if (this.time_interval == second.time_interval) {
            return 0;
          } else {
           return -11;
          }
    }
}

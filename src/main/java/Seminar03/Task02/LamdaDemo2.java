package Seminar03.Task02;

public class LamdaDemo2 {
    public static void main(String[] args) {
        NumereTest isFactor = (n,d)->(n%d)==0;
        if (isFactor.test(10,2)){
            System.out.println("Два является делителем десяти");
        }
        if (!isFactor.test(10,3)){
            System.out.println("Три не является делителем десяти");
        }


        NumereTest lesZen = (n,m)->(n<m);
        if (lesZen.test(2,10)){
            System.out.println("Два меньше десяти");
        }
        if (!lesZen.test(10,3)){
            System.out.println("Десять не меньше 3");
        }


        NumereTest absqual = (n,m)->(n<0 ? -n:n)==(m<0 ? -m:m);
        if (absqual.test(4,-4)){
            System.out.println("Абсолютные величины 4 и -4 равны");
        }
        if (!absqual.test(4,-5)){
            System.out.println("Абсолютные величины 4 и -5 не равны");
        }
    }
}

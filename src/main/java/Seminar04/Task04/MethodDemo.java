package Seminar04.Task04;
//определить, совпадает ли содержимое двух массивов
public class MethodDemo {
    static <T extends Comparable<T>, V extends T> boolean array(T[] x, V[] y){//comparable это пакет, кот.проверяет упорядоченные объекты
        //т.е. это автоматическая проверка типов, если типы совпадают, то будет сравнивать, если нет, то не будет
        if (x.length!=y.length){
            return false;
        }
        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])){
                return false;
            }

        }return true;

    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {4, 2, 2, 4, 5};
        Integer nums4[] = {1, 2, 3, 4, 5, 6};

        if (array(nums, nums2)) {
            System.out.println("nums и nums2 равны");
        }
        if (array(nums, nums3)) {
            System.out.println("nums и nums3 равны");
        }
        if (array(nums, nums4)) {
            System.out.println("nums и nums4 равны");
        }
        Double nums5[] = {1.1, 2.2, 3.3, 4.4, 5.5};

        if (array(nums5, nums5)) {
            System.out.println("nums и nums5 равны");
        }

    }}

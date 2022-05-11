package lesson2;

/**
 * Написать программу кторая возвращает минимум из четырех чисел
 * Функция min(a,b,c,d) должна вызывать функцию min(a,b)
 */
public class Task7 {
    public static int min(int a, int b, int c, int d){
        //Твой код тут
        return 0;
    }
    public static int min(int a, int b){
        //Твой код тут
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(min(-20,-10));
        System.out.println(min(-40,-10,-30,40));
        System.out.println(min(-20,-40,-30,40));
        System.out.println(min(-20,-10,-40,40));
        System.out.println(min(-20,-10,-30,-40));
    }
}

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        //Задание 1
        //
        //Написать Predicate, который проверяет, является ли число положительным.
        //
        //То есть, если число положительное, то предикат должен возвращать true, в противном случае false.
        //
        //Реализовать Predicate в двух вариантах:
        //
        //    через анонимный класс
        //    через лямбду


        //Через анонимный класс


        Predicate<Integer> objectAnon = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {

                if (integer > 0) {
                    System.out.println("True");
                    return true;
                } else {
                    System.out.println("False");
                    return false;
                }
            }
        };

        objectAnon.test(-2);


        //Через лямбду


        Predicate<Integer> objectLambda = (Integer x) -> {

            if (x > 0) {
                System.out.println("True");
                return true;
            } else {
                System.out.println("False");
                return false;
            }

        };

        objectLambda.test(16);



        //Задание 2
        //
        //Создать Consumer, который будет принимать на вход имя человека и выводить в консоль его приветствие.
        //
        //Реализовать Consumer в двух вариантах:
        //
        //    через анонимный класс
        //    через лямбду




        Consumer<String> object2Anon = new Consumer<String>() {
            @Override
            public void accept (String string) {

                System.out.println("Привет, " + string + " !");

            }
        };

        object2Anon.accept("Антон");



        Consumer<String> object2Lambda = (String string) -> System.out.println("Привет, " + string + " !");


        object2Lambda.accept("Дмитрий");



        //Задание 3
        //
        //Реализовать функциональный интерфейс Function, который принимает на вход вещественное число типа Double, а возвращает его округленный вариант типа Long.
        //
        //Реализовать Function в двух вариантах:
        //
        //    через анонимный класс
        //    через лямбду


        Function<Double, Long> object3Anon = new Function<Double, Long>() {
            @Override
            public Long apply (Double numDouble){
                System.out.println(Math.round(numDouble));
                return (Math.round(numDouble));
            }
        };

        object3Anon.apply(3.499);


        Function<Double, Long> object3Lambda = (Double numDouble) ->

        {System.out.println(Math.round(numDouble));
            return (Math.round(numDouble));

        };


        object3Lambda.apply(4.66);


        //Задание 4
        //
        //Написать Supplier, который будет возвращать случайное число от 0 до 100.
        //
        //Реализовать Supplier в двух вариантах:
        //
        //    через анонимный класс
        //    через лямбду


        //Supplier<T>
        //Supplier<T> в метод get не принимает никаких аргументов, но должен возвращать объект типа T:
        //public interface Supplier<T> {
        //    T get();
        //}


        Supplier<Integer> object4Anon = new Supplier<Integer>() {
            @Override
            public Integer get (){

                int integer = 1 + (int) (Math.random() * ((100 - 1) + 1));
                System.out.println(integer);
                return (integer);
            }
        };

        object4Anon.get();

        Supplier<Integer> object4Lambda = () ->

        {int integer = 1 + (int) (Math.random() * ((100 - 1) + 1));
            System.out.println(integer);
            return (integer);

        };

        object4Lambda.get();






    }
}
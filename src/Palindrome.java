import java.util.Scanner;                       //подключаем консоль

public class Palindrome {
    public static void main(String[] args) {    //код программы определения является ли слово палиндромом
        Scanner in = new Scanner(System.in);    //создание объекта "Сканнер"
        System.out.print("Input a word: ");     //вывод в консоль с просьбой ввода
        String word = in.nextLine();            //ввод из консоли в переменную
        String reversed = reverseString(word);  //использование функции обратного слова
        System.out.println("Reversed word: " + reversed);           //вывод результата функции обратного слова
        if (isPalindrome(word))
            System.out.println("This word is a palindrome.");       //если обратное и стартовое слова одинаковы
        else System.out.println("This word isn`t a palindrome.");   //если разные
    }
    public static String reverseString(String s){       //функция преобразования слова в обратное
        int length = s.length();                        //помещаем в переменную значение длинны слова
        String r = "";                                  //пустое слово для конкантинации
        while(length > 0){
            r = r + s.charAt(length - 1);               //конкантинация
            length--;                                   //переход к следующему символу с конца
        }
        return r;
    }
    public static boolean isPalindrome(String s){       //функция определения является ли слово палиндромом
        return reverseString(s).equals(s);              //вывод результата сравнения
    }
    }

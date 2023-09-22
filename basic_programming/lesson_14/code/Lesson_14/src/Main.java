/**
 * @author Andrej Reutow
 * created on 21.09.2023
 */
public class Main {
    public static void main(String[] args) {
        int [] arr = {10, 3, 15, 7, 8, 5, 11, 2};
        // Первый цикл: проходим по всем элементам массива
        System.out.println("Еще не сортиварованный массив ");
        printArray(arr);

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Второй цикл: сравниваем и меняем местами пары элементов
            for (int j = 0; j < n - 1 - i; j++) {
                // Сравниваем текущий и следующий элементы
                if (arr[j] > arr[j + 1]) {
                    // Если текущий элемент больше следующего, меняем их местами
                    int temp = arr[j];  // Временная переменная для хранения текущего элемента
                    arr[j] = arr[j + 1];  // Присваиваем текущему элементу значение следующего
                    arr[j + 1] = temp;  // Присваиваем следующему элементу сохраненное значение текущего
                }
            }
        }
        System.out.println("Отсортированный по возрастанию массив ");
        printArray(arr);

        sortArray(arr);
        System.out.println("Отсортированный по убыванию массив ");
        printArray(arr);
    }

    public static void sortArray (int[ ] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Второй цикл: сравниваем и меняем местами пары элементов
            for (int j = 0; j < n - 1 - i; j++) {
                // Сравниваем текущий и следующий элементы
                if (arr[j] < arr[j + 1]) {
                    // Если текущий элемент больше следующего, меняем их местами
                    int temp = arr[j];  // Временная переменная для хранения текущего элемента
                    arr[j] = arr[j + 1];  // Присваиваем текущему элементу значение следующего
                    arr[j + 1] = temp;  // Присваиваем следующему элементу сохраненное значение текущего
                }
            }
        }
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }}

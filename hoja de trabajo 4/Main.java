import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la implementación de la pila (1. ArrayList, 2. no los hice xd: ");
        int stackType = scanner.nextInt();

        Stack<Integer> stack;
        if (stackType == 1) {
            stack = new ArrayListStack<>();
        } else if (stackType == 2) {
   
            System.out.println("Opción no implementada");
            return;
        } else {
            System.out.println("Opción inválida");
            return;
        }

        System.out.println("Ingrese los elementos de la pila (ingrese -1 para detenerse): ");
        int element = scanner.nextInt();
        while (element != -1) {
            stack.push(element);
            element = scanner.nextInt();
        }

        System.out.println("Elementos de la pila:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}

public class Stack {
    private int[] stackArray;
    private int top;
    private int maxSize;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[size];
        this.top = -1; // Başlangıçta yığın boş
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Yığın dolu! Eleman eklenemiyor: " + data);
            return;
        }
        stackArray[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Yığın boş! Eleman çıkarılamıyor.");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Yığın boş! Eleman yok.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Yığın boş!");
            return;
        }
        System.out.print("Yığın: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
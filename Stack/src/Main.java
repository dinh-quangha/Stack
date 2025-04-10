class Stack {
    private int top;
    private int maxSize;
    private int[] stack;

    public Stack(int size) {
        this.maxSize = size;
        this.stack = new int[maxSize];
        this.top = -1; // Stack is initially empty
    }

    // Push operation
    public void push(int value) {
        if (top < maxSize - 1) {
            stack[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Pop operation
    public int pop() {
        if (top >= 0) {
            int value = stack[top--];
            System.out.println("Popped: " + value);
            return value;
        } else {
            System.out.println("Stack Underflow");
            return -1; // Error code for underflow
        }
    }

    // Peek operation
    public int peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            System.out.println("Stack is empty");
            return -1; // Error code for empty stack
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get stack size
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5); // Tạo ngăn xếp với kích thước 5
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // Xem phần tử trên cùng
        System.out.println("Stack size: " + stack.size()); // Kích thước ngăn xếp

        stack.pop(); // Xóa phần tử trên cùng
        stack.pop(); // Xóa phần tử trên cùng
        stack.pop(); // Xóa phần tử trên cùng
        stack.pop(); // Gọi để kiểm tra tình trạng underflow
    }
}
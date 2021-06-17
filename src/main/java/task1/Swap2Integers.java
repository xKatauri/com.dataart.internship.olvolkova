package task1;

class Swap2Integers {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int temp = first;
        first = second;
        second = temp;
        System.out.println("First number is " + first);
        System.out.println("Second number is " + second);
    }
}
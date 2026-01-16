class ReverseArray {
    public static void main(String[] args) {

        char[] name = {'T', 'u', 'v', 'i', 'j', 'i', 't', 'h'};
        int n = name.length;

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(name[i]);
        }
    }
}

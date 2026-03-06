public class countOdd {
    public static void main(String[] args) {

        int count = 0; // will store num of odd integers
        int[] arr = {0, 1, 3, 5, 6, 8};

            for(int i = 0; i < arr.length; i++) //i = index, goes through the loop then increment i by one
        {
            if (arr [i] % 2 != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
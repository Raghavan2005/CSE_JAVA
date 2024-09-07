import java.util.Scanner;

class SortZeroArray {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int len = sn.nextInt();
        int[] orarray = new int[len];
        for (int i = 0; i < len; i++) {
            orarray[i] = sn.nextInt();
        }
        int count0 = 0, count1 = 0, count2 = 0;
        for (int j = 0; j < len; j++) {
            if (orarray[j] == 0) {
                count0++;
            } else if (orarray[j] == 1) {
                count1++;
            } else if (orarray[j] == 2) {
                count2++;
            }
        }

        int[] zeros = new int[count0];
        int[] ones = new int[count1];
        int[] twos = new int[count2];

        for (int i = 0; i < count0; i++) {
            zeros[i] = 0;
        }
        for (int i = 0; i < count1; i++) {
            ones[i] = 1;
        }
        for (int i = 0; i < count2; i++) {
            twos[i] = 2;
        }

        int index = 0;
        
        for (int i = 0; i < zeros.length; i++) {
            orarray[index++] = zeros[i];
        }
    
        for (int i = 0; i < ones.length; i++) {
            orarray[index++] = ones[i];
        }

        for (int i = 0; i < twos.length; i++) {
            orarray[index++] = twos[i];
        }

        for (int i = 0; i < len; i++) {
            System.out.print(orarray[i] + " ");
        }
    }
}

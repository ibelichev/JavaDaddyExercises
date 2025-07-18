package mentorship.roadmap.Java_Core.step2_Base.topic5_Arrays.task1_CountOccurrences;

public class MyCountOccurrances {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5};
        int count = 0;
        for (int i : arr) {
            if (i == 5) count++;
        }

        System.out.println(count);
    }

}
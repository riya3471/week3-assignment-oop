package week3;

public class qn2 {
	public static void main(String[] args) {
        float[] arr = {10.0f, 20.5f, 60.0f, 80.0f};

        float sum = 0;
        for (float num : arr) {
            sum += num;
        }

        float avg = sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }

}

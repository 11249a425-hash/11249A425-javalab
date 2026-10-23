

public class TrainCodes {

    public static void main(String args[]) {

        int trainCode[] = {101, 102, 103};

        try {

            System.out.println(trainCode[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception Caught: Array Index Out of Bounds.");

        }
    }
}

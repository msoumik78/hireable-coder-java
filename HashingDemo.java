import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingDemo {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String times = args[0];
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < Integer.parseInt(times); i++) {
            String input = "my name is soumik"+i;
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
        }
        System.out.println("Time taken in mili seconds: "+(System.currentTimeMillis() - startTime));
    }
}

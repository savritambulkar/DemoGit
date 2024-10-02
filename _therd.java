import java.io.FileInputStream;

class therd {
    public static void main(String[] args) {
    FileInputStream input = null;
try {
    input = new FileInputStream("file.txt");
    // Use the input stream
} catch (Exception e) {
    // Handle exception
} finally {
    if (input != null) {
        try {
            input.close();
        } catch (Exception e) {
            // Handle close exception
        }
    }
}

    }
}

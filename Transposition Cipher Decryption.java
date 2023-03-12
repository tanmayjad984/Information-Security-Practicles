import java.util.Scanner;

public class b2_transpositionCipher {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                String message = scanner.nextLine(); 
                
                int numRows = 4; 
                int numCols = (int) Math.ceil((double) message.length() / numRows); // the number of columns to use
                char[][] transposed = new char[numRows][numCols];
                int index = 0;
                for (int j = 0; j < numCols; j++) {
                    for (int i = 0; i < numRows; i++) {
                        if (index < message.length()) {
                            transposed[i][j] = message.charAt(index++);
                        } else {
                            transposed[i][j] = ' ';
                        }
                    }
                }
   
      
                StringBuilder encrypted = new StringBuilder();
                for (int i = 0; i < numRows; i++) {
                    for (int j = 0; j < numCols; j++) {
                        encrypted.append(transposed[i][j]);
                    }
                }
                System.out.println("Encrypted message: " + encrypted.toString());
            }
        }
    }
    


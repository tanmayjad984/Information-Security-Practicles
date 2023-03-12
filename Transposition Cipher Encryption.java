import java.util.Scanner;

public class b3_transpositionCipher {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                String encrypted = scanner.nextLine(); 
                
                int numRows = 2; 
                int numCols = (int) Math.ceil((double) encrypted.length() / numRows);
                char[][] transposed = new char[numRows][numCols];
                int index = 0;
                for (int i = 0; i < numRows; i++) {
                    for (int j = 0; j < numCols; j++) {
                        transposed[i][j] = encrypted.charAt(index++);
                    }
                }
      
                StringBuilder decrypted = new StringBuilder();
                for (int j = 0; j < numCols; j++) {
                    for (int i = 0; i < numRows; i++) {
                        if (transposed[i][j] != ' ') {
                            decrypted.append(transposed[i][j]);
                        }
                    }
                }
                System.out.println("Decrypted message: " + decrypted.toString());
            }
        }
        
        }
    
    


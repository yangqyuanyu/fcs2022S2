import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;

public class Main {
	public static void main(String[] args) throws Exception{       //throw Exception
		int [][] matrix = getMatrix();
        MyGraph graph = new MyGraph();
        graph.matrixToList(matrix);
        graph.displayAdjListArray();
	}





	public static int[][] getMatrix() {

		int m = 0, i, j;
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));          //IO Stream

        while(true) {
            try {
                rd=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows and number of columns: ");
                m = Integer.parseInt(rd.readLine());

                int[][] m2 = new int[m][m];

                // Read the matrix values
                System.out.println(" Individual element of the defined matrix: ");

                for (i = 0; i < m; i++) {
                    for (j = 0; j < m; j++) {
                        while(true) {
                        	if (i==j) {
                        		m2[i][j] = 0;
                        	}
                        	else {
                        		System.out.println("Please enter a number in position of [" + i + "] and [" + j + "]");
                        		m2[i][j] = Integer.parseInt(rd.readLine());
                        	}
                            if (m2[i][j] ==0 || m2[i][j] ==1) {
                                break;
                            }
                            else {
                                System.out.println("The input is wrong! Please consider to enter a number either 0 and 1");
                                System.out.println("A element 1 indicates that there is an edge from node i to node j and 0 indicates that there is no edge from node i to j.");
                            }
                        }
                    }
                }
                return m2;
            } catch (Exception e) {
                System.out.println("Try again!");
            }
        }
	}
}
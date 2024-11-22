import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //Lee texto de tipo input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int acumulador = 0;
        if (n<1){
            System.out.println("Error");
            return;
        }
        for(int i=0; i < n; i++){
            acumulador += Integer.parseInt(br.readLine());
        }
        System.out.println(acumulador);
    }
}

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int acumulador = 0;

        for(int i=0; i < n; i++){
            acumulador += Integer.parseInt(br.readLine());
        }
        System.out.println(acumulador);
    }
}*/
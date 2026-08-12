import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int consumers_count;
    private static int client_id;
    private static int flag;
    private static int low_income;
    private static float client_usage;

    public Main(int consumers_count,int client_id, int flag, int low_income, float client_usage){
        this.consumers_count = consumers_count;
        this.client_id = client_id;
        this.flag = flag;
        this.low_income = low_income;
        this.client_usage = client_usage;
    }

    public static void main(String args[]) throws IOException{
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        Prize_Table calculator = new Prize_Table(0);

        System.out.print("Number of consumers: ");
        consumers_count = Integer.parseInt(keyboard.readLine());
        
        float total_price = 0;
        float total_usage = 0;
        int usage_higher_Than200kWh = 0;
        float higher = 0;
        int highest_id = 0;

        for(int i = 0; i < consumers_count; i++){
            
            System.out.print("Client ID: ");
            client_id = Integer.parseInt(keyboard.readLine());

            System.out.print("Client Usage: ");
            client_usage = Float.parseFloat(keyboard.readLine());
            total_usage += client_usage;
            if(client_usage > 200){
                usage_higher_Than200kWh++;
            }
            System.out.print("Client Flag (type 1 for Green Flag, 2 Yellow flag and 3 for Red Flag):  ");
            flag = Integer.parseInt(keyboard.readLine());

            System.out.print("Low Income? type 1 for Yes and 0 for No: ");
            low_income = Integer.parseInt(keyboard.readLine());

            float final_price = calculator.AccountCalculate(client_usage, flag, low_income);
            if(final_price > higher){
                higher = final_price;
                highest_id = client_id;
            }
            total_price += final_price;
        }
        System.out.println("---- FINAL RESUME ----");
        System.out.printf("Total Usage: %.2fkWh\n",total_usage);
        System.out.printf("Average Usage: %.2fkWh\n", total_usage / consumers_count);
        System.out.printf("Total Price: %.2fR$\n",total_price);
        System.out.println("Consumers higher than 200kWh: " + usage_higher_Than200kWh);
        System.out.println("Higher usage ID: " + highest_id);
        System.out.printf("Highest account: %.2fR$\n",higher);
    }
}

public class Prize-Table{
    public static float AccountCalculate(double usagePerkWh, int flag, int low_income){ //usarei float para economizar memoria
    static float energy_price;
        while(usagePerKwh != 0){

            if(flag == 2){
                energy_price == usagePerKwh * 0.05
            }
            
            if(flag == 3){
                energy_price == usagePerKwh * 0.10
            }

            if(usagePerKwh > 200){
                energy_price = 100 * 0.90;
                usagePerKwh -= 100;
            }
            if(usagePerKwh > 100 && usagePerKwh <= 200){
                energy_price = 100 * 0.75;
                usagePerKwh -= 100;
            }
            else(usagePerKwh <= 100){
                energy_price = usagePerKwh * 0.60;
                energy_price == 0;
            }
        }
        return energy_price;
    }
}

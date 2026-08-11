public class Prize_Table{
    public static float AccountCalculate(double usagePerkWh, int flag, int low_income){ //usarei float para economizar memoria
    float energy_price = 0;
        if(usagePerkWh > 200){
            energy_price += (usagePerkWh - 200) * 0.90;
            energy_price += 100 * 0.75;
            energy_price += 100 * 0.60;
        }
        else if(usagePerkWh > 100 && usagePerkWh <= 200){
            energy_price += (usagePerkWh - 100) * 0.75;
            energy_price += 100 * 0.60;
        }
        else{
            energy_price += usagePerkWh * 0.60;
        }
        if(flag == 2){
        energy_price += usagePerkWh * 0.05;
        }
        else if(flag == 3){
            energy_price += usagePerkWh * 0.10;
        }
        if(low_income == 1 && usagePerkWh <= 150){
            energy_price -= energy_price * 0.10
        }
    return energy_price;
    }
}
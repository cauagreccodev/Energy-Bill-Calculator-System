public class Prize_Table{
    private float energy_price;
    public Prize_Table(float energy_price){
        this.energy_price = energy_price;
    }
    public float AccountCalculate(double usagePerkWh, int flag, int low_income){ //usarei float para economizar memoria
        this.energy_price = 0;
        if(usagePerkWh > 200){
            this.energy_price += (usagePerkWh - 200) * 0.90;
            this.energy_price += 100 * 0.75;
            this.energy_price += 100 * 0.60;
        }
        else if(usagePerkWh > 100 && usagePerkWh <= 200){
            this.energy_price += (usagePerkWh - 100) * 0.75;
            this.energy_price += 100 * 0.60;
        }
        else{
            this.energy_price += usagePerkWh * 0.60;
        }
        if(flag == 2){
        this.energy_price += usagePerkWh * 0.05;
        }
        else if(flag == 3){
            this.energy_price += usagePerkWh * 0.10;
        }
        if(low_income == 1 && usagePerkWh <= 150){
            this.energy_price -= this.energy_price * 0.10;
        }
    return this.energy_price;
    }
}

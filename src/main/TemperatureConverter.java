

public class TemperatureConverter {

    double Fahrenheit;
    double Kelvin;
    double Celsius;


    public double celToFah(double celsius){
        double fahTemp = celsius*(9/5) + 32;
        return fahTemp;
    }
    public double celToKel(double celsius){
        double kelvinTemp = celsius + 273.15;
        return kelvinTemp;
    }

    public double kelToCel(double kelvin){
        double celsiusTemp = kelvin - 273.15;
        return celsiusTemp;
    }
    public double fahToCel(double fahrenheit){
        double celsiusTemp = (5/9) * (fahrenheit -32);
        return celsiusTemp;

    }
    public getTemp(double ){
        Scanner givenTemp = new Scanner(System.in);
        Scanner givenScale = new Scanner(System.in);
        Scanner desiredScale = new Scanner(System.in);


        System.out.println("What temperature scale are you converting from?\nF for Fahrenheit, C for Celsius, K for Kelvin.");
        char tempScale = givenScale.nextLine();
        double newTemp;

        if (tempScale == 'f'){
            System.out.println("What is the temperature you wish to convert?");
            double oldTemp = givenTemp.nextLine();

            System.out.println("What is the desired temperature scale you want to convert to?\nC for Celsius, K for Kelvin.");
            char newScale = desiredScale.nextLine();

            if (newScale = 'c'){
                fahToCel(oldTemp) = newTemp;
                System.out.println("%.2f Fahrenheit is approximately %.2f Celsius.", oldTemp, newTemp);
            }

        }
        else if (tempScale == 'c'){

        }
        else if (tempScale == 'k'){

        }





    }

    public static void main(String [] args){







    }

}

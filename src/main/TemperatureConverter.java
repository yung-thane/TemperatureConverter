

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
    public getTemp(double oldTemp){
        Scanner givenTemp = new Scanner(System.in);
        Scanner givenScale = new Scanner(System.in);
        Scanner desiredScale = new Scanner(System.in);


        System.out.println("What temperature scale are you converting from?\nF for Fahrenheit, C for Celsius, K for Kelvin.");
        char tempScale = givenScale.nextLine();
        double newTemp;
        char newScale;

        if (tempScale == 'f'){
            System.out.println("What is the temperature you wish to convert?");
            oldTemp = givenTemp.nextLine();

            System.out.println("What is the desired temperature scale you want to convert to?\nC for Celsius, K for Kelvin.");
            newScale = desiredScale.nextLine();

            if (newScale = 'c'){
                newTemp = fahToCel(oldTemp);
                System.out.println("%.2f Fahrenheit is approximately %.2f Celsius.", oldTemp, newTemp);
            }
            else if (newScale = 'k'){
                newTemp = fahToCel(oldTemp);
                newTemp = celToKel(newTemp);
                System.out.println("%.2f Fahrenheit is approximately %.2f Kelvin.", oldTemp, newTemp);
            }
            else{
                System.out.println("Invalid input entered.");
            }

        }
        else if (tempScale == 'c'){
            System.out.println("What is the temperature you wish to convert?");
            oldTemp = givenTemp.nextLine();

            System.out.println("What is the desired temperature scale you want to convert to?\nF for Fahrenheit, K for Kelvin.");
            newScale = desiredScale.nextLine();

            if (newScale = 'f'){
                newTemp = celToFah(oldTemp);
                System.out.println("%.2f Celsius is approximately %.2f Fahrenheit.", oldTemp, newTemp);

            }

        }
        else if (tempScale == 'k'){

        }





    }

    public static void main(String [] args){


        getTemp();




    }

}

package populationOfCountry;

public class main {

    public static void nufusBul() {
        String str = "Canada";
        int countryPopulations[] = {100000, 120000, 130000};
        String countryNames[] = {"USA", "Mexico", "Canada"};
        for (int i = 0; i < countryNames.length; i++) {
            if (str.equals(countryNames[i])) {
                System.out.println(countryPopulations[i]);
            }
        }
    }
    public static void main(String[] args) {
        nufusBul();
    }
}

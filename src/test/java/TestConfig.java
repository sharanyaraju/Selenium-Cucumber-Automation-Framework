import utilities.ConfigReader;

public class TestConfig {

    public static void main(String[] args) {

        ConfigReader.initializeProperties();

        System.out.println(
                ConfigReader.getProperty("url"));

    }

}
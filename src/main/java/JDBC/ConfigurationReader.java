package JDBC;

public class ConfigurationReader {
    private static Properties configFile;
    static {
        try {

            FileInputStream fileInputStream = new FileInputStream("configuration.properties");

            configFile = new Properties();

            configFile.load(fileInputStream);

            fileInputStream.close();
        } catch (IOException e) {

        }
    }

    public static String getProperty(String key) {
        return configFile.getProperty(key);
    }

    public static void main(String[] args) {
        String URL=getProperty("JDBC_URL");
        String username=getProperty("JDBC_UserName");
        String password=getProperty("JDBC_PassWord");
        System.out.println(URL);
        System.out.println(username);
        System.out.println(password);

    }
}


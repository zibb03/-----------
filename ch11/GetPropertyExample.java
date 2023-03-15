import java.util.Properties;

public class GetPropertyExample {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println("운양체제 이름: " + osName);
        System.out.println("사용자 이름: " + userName);
        System.out.println("사용자 홈디렉토리: " + userHome);

        System.out.println("____________________");
        System.out.println("[ key ] value");

        // Properties props = System.getProperty();
        // Set Keys = props.keySet();
        // for(Object objKey : keys) {
        //     String key = (String) objKey;
        //     String value = System.getProperty(key);
        //     System.out.println("[ " + key + " ] " + value);
        // }
    }
}

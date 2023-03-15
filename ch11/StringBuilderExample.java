public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Java ");
        sb.append("Program Study");
        //System.out.println(sb.toString());
        System.out.println(sb); //자동으로 toString 함

        sb.insert(4, "2");
        System.out.println(sb);

        sb.setCharAt(4, '6');
        System.out.println(sb);

        sb.replace(6, 13, "Book");
        System.out.println(sb);

        sb.delete(4, 5);
        System.out.println(sb);

        int length = sb.length();
        System.out.println("총문자수: " + length);

        String result = sb.toString();
        System.out.println(result);
    }
}

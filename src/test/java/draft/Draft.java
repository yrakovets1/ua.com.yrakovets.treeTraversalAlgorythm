package draft;

public class Draft {
    public static void main(String[] args){
        Double d = 5.245;
        System.out.println(d.equals(5.2451));
        System.out.println(d.equals(5.24501));
        System.out.println(d.equals(5.24500000));
        System.out.println(d.equals(5.245000000000001));
        //System.out.println(d == 5.2450000000000001);

    }
}

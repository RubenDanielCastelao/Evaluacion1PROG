
package extra2;

public class App {

    public static void main(String[] args) {
        cuenta c1 = new cuenta("Juan","37",67.8,1245);
        cuenta c2 = new cuenta("Manuel","38",66.9,1378);
        c2.transferencia(c1, 220);
        System.out.println(c1.getSaldo() + "\n" + c2.getSaldo());
    }
}

public class OOPSBannerApp {

    public static void main(String[] args) {

        printLine(" ***** ", "  ", " ***** ", "  ", " ***** ", "  ", " ***** ");
        printLine("*     *", " ", "*     *", " ", "*     *", " ", "*     *");
        printLine("*     *", " ", "*     *", " ", "*     *", " ", "*     *");
        printLine("*     *", " ", "*     *", " ", " ***** ", "  ", " ***** ");
        printLine("*     *", " ", "*     *", " ", "*      ", " ", "*     *");
        printLine("*     *", " ", "*     *", " ", "*      ", " ", "*     *");
        printLine(" ***** ", "  ", " ***** ", " ", "*      ", "  ", " ***** ");
    }

    public static void printLine(String... parts) {
        System.out.println(String.join("", parts));
    }
}
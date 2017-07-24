package HeadorTail;





public class controller {

    static ViewH_T h_T = new ViewH_T();
    static HeadTails headTails = new HeadTails();
  

    public static void main(String[] args) {
        h_T.showMenu();
    }

    static void handlerMenu(String str) {

        switch (str) {
            case "1": {
                int res[] = headTails.dropCoin(h_T.numberOfShots());
                h_T.showResultDropCoins(res);
                break;
            }
            case "2": {
                System.out.println("See you later");
                return;
            }
            default: {
                System.out.println("Please select number 1-2!!!");
                System.out.println("Or enter number '2' and exit...");
                break;
            }
            
        }
        h_T.showMenu();
    }
}

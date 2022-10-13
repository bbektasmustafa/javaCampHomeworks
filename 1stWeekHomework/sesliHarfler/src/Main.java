public class Main {

    public static void main(String[] args) {
        char harf = 'L';

        switch (harf){
            case 'A':
            case 'E':
            case 'I':
            case 'İ':
            case 'U':
            case 'Ü':
            case 'O':
            case 'Ö':
                System.out.println("Harfiniz ünlü harftir");
                break;
            default:
                System.out.println("Harfiniz ünsüz bir harftir");
        }
    }
}

public class forBreak {
    public static void main(String[] args) {
        for (int i = 0; i<=5; i++){
            // if (i ==3) {
            //     System.out.println("Parei");
            //     break;
            // }
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}

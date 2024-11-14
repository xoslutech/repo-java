public class Main {
    public static void main(String[] args) {
        int nb = (int) (Math.random()*100+200);
        System.out.println(isPremier(nb));
    }

    public static boolean isPremier(int n){
        int cpt = 0;
        for (int i = 1; i <= n; i++) {
            if(cpt % i == 0)
                cpt++;
        }
        return cpt == 2;
    }
}
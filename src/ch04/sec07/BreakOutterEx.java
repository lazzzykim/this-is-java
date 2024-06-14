package ch04.sec07;

public class BreakOutterEx {
    public static void main(String[] args) throws Exception {
        Outter:
        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + " - " + lower);
                if (lower == 'f') {
                    break Outter;
                }
            }
        }
    }
}

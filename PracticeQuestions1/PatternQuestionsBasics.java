package PracticeQuestions1;

public class PatternQuestionsBasics {
    public static void Hollow_Rectangle(int n, int m) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(i==1 || i==n || j==1 || j==m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void Half_Pyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void Half_Pyramid1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void Half_Pyramid2(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=i; j>=1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void Num_Pyramid(int n) {
        int number = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void Num_Pyramid1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(j%2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }

    public static void Inverted_HalfPyramid(int n) {
        int i, j;
        for(i=1; i<=n; i++) {
            for(j=1; j<=(n-i); j++) {
                System.out.print("  ");
            }
            for(j=1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        System.out.print("Enter m: ");
//        int m = sc.nextInt();
        Hollow_Rectangle(4, 5);
        System.out.println();
        Half_Pyramid(4);
        System.out.println();
        Inverted_HalfPyramid(4);
        System.out.println();
        Half_Pyramid1(4);
        System.out.println();
        Half_Pyramid2(4);
        System.out.println();
        Num_Pyramid(4);
        System.out.println();
        Num_Pyramid1(5);
    }
}

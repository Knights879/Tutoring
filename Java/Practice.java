// import java.util.ArrayList;
// import java.util.Arrays;

/**
 * @author Knights879
 */
public class Practice {
    public static void main(String[] args) {
        // // 1.
        // System.out.println("\\* This is not\\n a comment *\\");

        // // 2.
        // if (x / n > 100 && n != 0)

        // int[][] vals = { { 3, 2, 1},
        //                  { 4, 7, 5},
        //                  { 8, 6, 9} };
        // int[] s = new int[9];
        // for (int i = 0; i < vals.length; i++)
        //     for (int j = 0; j < vals[i].length; j++)
        //         s[i * vals[i].length + j] = vals[i][j];

        // Arrays.sort(s);

        // for (int i = 0; i < vals.length; i++)
        //     for (int j = 0; j < vals[i].length; j++)
        //         vals[i][j] = s[i * vals.length + j];

        // for (int i = 0; i < vals.length; i++)
        //     for (int j = 0; j < vals[i].length; j++)
        //         System.out.print(vals[i][j]);

        int x = 1;
        while (x <= 10) {
            x *= 2;
        }
        System.out.println(x);

        // ArrayList<Integer> al = new ArrayList<Integer>();
        // al.add(1); // add(new Integer(1))
        // int n2 = al.get(0).intValue();
        // Integer i = new Integer(0);
        // int n = i.intValue();

        // String s = "that"; // new String("that")
        // int num = 2574;
        // int res = 0;
        // while (num > 0) {
        //     res = res * 10 + num % 10;
        //     num /= 10;
        // }
        // System.out.println(res);

        // // 3.
        // int n = 5 / 0;
        // System.out.println(n);

        // // 4.
        // Dog d;
        // d.getName();  // assume getName() is public and implemented

        // // 5.
        // int powersOf2 = 1;
        // while (powersOf2 != 20) {
        //     System.out.println(powersOf2);
        //     powersOf2 *= 2;
        // }

        // // 6.
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j <= i; j++)
        //         System.out.print("+");
        //     for (int j = 1; j <= 5 - i; j++)
        //         System.out.print("*");
        //     System.out.println();
        // }

        // // 7.
        // int n = 7;
        // if (n > 0)
        //     if (n % 2 == 0)
        //         System.out.println(n);
        // else
        //     System.out.println(n + " is not positive");
    }
    
    // public static void miscMath(int num1, int num2) {
    //     if (num1 % 2 == 0 && num2 % 2 == 0)
    //         System.out.println(num1 + num2);
    //     else if ((num1 > 10 && num2 <= 10) || (num1 <= 10 && num2 > 10))
    //         System.out.println(num1 * num2);
    //     else
    //         System.out.println(Math.pow(num1, num2));
    // }
}




// public class Test {
//     public static void main(String[] args) {
//         Student s = new College();
//         double x = (double) 4;
//         ((College) s).tuition = 4;
//         double g = s.calcGPA(x);
//     }
// }


// public class Person {
//     public String name;

//     public Person() {
//         name = "";
//     }
//     public Person(String nameP) {
//         this.name = nameP;
//     }

//     public String getName() {
//         return name;
//     }
// }

// public class Student extends Person {
//     public String schoolName;
//     public double gpa;

//     public Student() {
//         super();
//         schoolName = "";
//         gpa = -1.0;
//     }
//     public Student(String schoolNameP, double gpaP, String name) {
//         super(name);
//         this.schoolName = schoolNameP;
//         this.gpa = gpaP;
//     }

//     public double calcGPA(double grade) {
//         return 5 * grade;
//     }
// }

// public class HighSchool extends Student {
//     private int stateTestGrade;
//     private double unweightedGPA;

//     public HighSchool(int stateTestGradeP, double unweightedGPAP) {
//         super();
//         this.stateTestGrade = stateTestGradeP;
//         this.unweightedGPA = unweightedGPAP;
//     }

//     public double calcUnWGPA(double gpa) {
//         return this.gpa / 4;
//     }
// }

// public class College extends Student {
//     public double tuition;

//     public double calcGPA(double grade) {
//         double g = super.calcGPA(grade);
//         return g * 3;
//     }
// }

// public class Employee extends Person {
//     private int employeeID;
//     private double salary;

//     //
// }


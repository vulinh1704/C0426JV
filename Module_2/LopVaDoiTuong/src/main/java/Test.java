public class Test {
    public static void main(String[] args) {
//        HinhChuNhat hcn = new HinhChuNhat(5, 3);
//        int S = hcn.layDienTich();
//        int C = hcn.layChuVi();
//        System.out.println("S = " + S + ", C = " + C);


        Student s = new Student("Ning", 20, new double[]{4.4, 5, 6});
        Student s2 = new Student("Đạt", 20, new double[]{10, 10, 10});
        if(s.calculateScoreAvg() > s2.calculateScoreAvg()) {
            System.out.println(s);
        } else {
            System.out.println(s2);
        }
    }
}

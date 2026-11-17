package b3_2;

import java.util.ArrayList;
import java.util.Scanner;

public class B3_2 {

    public static void nhapDiem(Scanner sc, ArrayList<Double> ds) {

        while (true) {

            System.out.print("Nhập điểm (-1 để kết thúc): ");
            double diem = sc.nextDouble();

            if (diem == -1) {
                break;
            }

            if (diem < 0 || diem > 10) {
                System.out.println("Điểm không hợp lệ! Vui lòng nhập lại.");
                continue;
            }

            ds.add(diem);

            if (diem < 5) {
                System.out.println("Học lực: Yếu");
            } else if (diem < 7) {
                System.out.println("Học lực: Trung bình");
            } else if (diem < 8) {
                System.out.println("Học lực: Khá");
            } else if (diem < 9) {
                System.out.println("Học lực: Giỏi");
            } else {
                System.out.println("Học lực: Xuất sắc");
            }
        }
    }

    public static void thongKe(ArrayList<Double> ds) {


        if (ds.isEmpty()) {
            System.out.println("Chưa có dữ liệu");
            return;
        }

        int soHocVien = ds.size();
        double tongDiem = 0;

        double diemCaoNhat = ds.get(0);
        double diemThapNhat = ds.get(0);

        for (double diem : ds) {
            tongDiem += diem;
        }

        for (int i = 0; i < ds.size(); i++) {

            if (ds.get(i) > diemCaoNhat) {
                diemCaoNhat = ds.get(i);
            }

            if (ds.get(i) < diemThapNhat) {
                diemThapNhat = ds.get(i);
            }
        }

        double diemTrungBinh = tongDiem / soHocVien;

        System.out.println("\n========== THỐNG KÊ ĐIỂM ==========");
        System.out.println("Số học viên: " + soHocVien);
        System.out.printf("Tổng điểm: %.2f\n", tongDiem);
        System.out.printf("Điểm trung bình: %.2f\n", diemTrungBinh);
        System.out.println("Điểm cao nhất: " + diemCaoNhat);
        System.out.println("Điểm thấp nhất: " + diemThapNhat);
        System.out.println("===================================");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> danhSachDiem = new ArrayList<>();

        int luaChon;

        do {

            System.out.println("\n******** MENU NHẬP ĐIỂM ********");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            luaChon = sc.nextInt();

            switch (luaChon) {

                case 1:
                    nhapDiem(sc, danhSachDiem);
                    break;

                case 2:
                    thongKe(danhSachDiem);
                    break;

                case 3:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }

        } while (luaChon != 3);

        sc.close();
    }
}

package b3_3;

import java.util.ArrayList;
import java.util.Scanner;

public class B3_3 {
        public static void nhapLuong(Scanner sc, ArrayList<Double> ds) {

            while (true) {

                System.out.print("Nhập lương nhân viên (triệu đồng, -1 để kết thúc): ");
                double luong = sc.nextDouble();


                if (luong == -1) {
                    break;
                }

                if (luong < 0 || luong > 500) {
                    System.out.println("Lương không hợp lệ! Vui lòng nhập từ 0 đến 500 triệu.");
                    continue;
                }

                ds.add(luong);

                if (luong < 5) {
                    System.out.println("Thu nhập thấp");
                } else if (luong < 15) {
                    System.out.println("Thu nhập trung bình");
                } else if (luong <= 50) {
                    System.out.println("Thu nhập khá");
                } else {
                    System.out.println("Thu nhập cao");
                }
            }
        }

        public static void thongKe(ArrayList<Double> ds) {

            if (ds.isEmpty()) {
                System.out.println("Chưa có dữ liệu");
                return;
            }

            int soNhanVien = ds.size();

            double tongLuong = 0;
            double luongCaoNhat = ds.get(0);
            double luongThapNhat = ds.get(0);

            for (double luong : ds) {
                tongLuong += luong;
            }

            for (Double d : ds) {

                if (d > luongCaoNhat) {
                    luongCaoNhat = d;
                }

                if (d < luongThapNhat) {
                    luongThapNhat = d;
                }
            }

            double luongTrungBinh = tongLuong / soNhanVien;

            System.out.println("\n========== THỐNG KÊ LƯƠNG ==========");
            System.out.println("Số nhân viên: " + soNhanVien);
            System.out.printf("Tổng tiền lương: %.2f triệu đồng\n", tongLuong);
            System.out.printf("Lương trung bình: %.2f triệu đồng\n", luongTrungBinh);
            System.out.printf("Lương cao nhất: %.2f triệu đồng\n", luongCaoNhat);
            System.out.printf("Lương thấp nhất: %.2f triệu đồng\n", luongThapNhat);
            System.out.println("====================================");
        }

        public static void tinhThuong(ArrayList<Double> ds) {

            if (ds.isEmpty()) {
                System.out.println("Chưa có dữ liệu");
                return;
            }

            double tongThuong = 0;

            for (double luong : ds) {

                double tyLeThuong;

                if (luong <= 5) {
                    tyLeThuong = 0.05;
                } else if (luong <= 15) {
                    tyLeThuong = 0.10;
                } else if (luong <= 50) {
                    tyLeThuong = 0.15;
                } else if (luong <= 100) {
                    tyLeThuong = 0.20;
                } else {
                    tyLeThuong = 0.25;
                }

                double tienThuong = luong * tyLeThuong;

                tongThuong += tienThuong;
            }

            System.out.printf("Tổng tiền thưởng cho nhân viên: %.2f triệu đồng\n", tongThuong);
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            ArrayList<Double> danhSachLuong = new ArrayList<>();

            int luaChon;

            do {

                System.out.println("\n******** MENU NHẬP LƯƠNG ********");
                System.out.println("1. Nhập lương nhân viên");
                System.out.println("2. Hiển thị thống kê");
                System.out.println("3. Tính tổng số tiền thưởng cho nhân viên");
                System.out.println("4. Thoát");
                System.out.print("Lựa chọn của bạn: ");

                luaChon = sc.nextInt();

                switch (luaChon) {

                    case 1:
                        nhapLuong(sc, danhSachLuong);
                        break;

                    case 2:
                        thongKe(danhSachLuong);
                        break;

                    case 3:
                        tinhThuong(danhSachLuong);
                        break;

                    case 4:
                        System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                        sc.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
                }

            } while (luaChon != 4);

            sc.close();
        }
    }


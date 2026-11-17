package b3_1;

import java.util.Scanner;

public class B3_1 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập tên khách hàng: ");
            String tenKhachHang = sc.nextLine();

            System.out.print("Nhập tên sản phẩm: ");
            String tenSanPham = sc.nextLine();

            System.out.print("Nhập giá sản phẩm: ");
            double donGia = sc.nextDouble();

            System.out.print("Nhập số lượng mua: ");
            int soLuong = sc.nextInt();

            System.out.print("Khách hàng có thẻ thành viên không (true/false): ");
            boolean thanhVien = sc.nextBoolean();

            double thanhTien = donGia * soLuong;

            double giamGia = 0;

            if (thanhVien == true) {
                giamGia = thanhTien * 0.1;
            }

            double tienVAT = (thanhTien - giamGia) * 0.08;

            double tongThanhToan = thanhTien - giamGia + tienVAT;

            System.out.println("\n========== HOÁ ĐƠN ==========");
            System.out.println("Khách hàng: " + tenKhachHang);
            System.out.println("Sản phẩm: " + tenSanPham);
            System.out.println("Số lượng: " + soLuong);
            System.out.printf("Đơn giá: %.2f VND\n", donGia);
            System.out.printf("Thành tiền: %.2f VND\n", thanhTien);
            System.out.printf("Giảm giá: %.2f VND\n", giamGia);
            System.out.printf("Tiền VAT (8%%): %.2f VND\n", tienVAT);
            System.out.printf("Tổng thanh toán: %.2f VND\n", tongThanhToan);

            System.out.println("======================================");

            sc.close();
        }
    }


import com.company.HinhChuNhat;
import com.company.HinhTron;
import com.company.HinhVuong;

public class Main {

    public static void main(String[] args) {
        //tinh chu vi va dien tich hinh chu nhat
        int chieuDai = 10;
        int chieuRong = 20;

        int chuViHinhCN = HinhChuNhat.chuVi(chieuDai, chieuRong);
        int dienTichHCN = HinhChuNhat.dienTich(chieuDai,chieuRong);
        System.out.println("Chu vi va dien tich hinh Chu Nhat");
        System.out.println("Chu vi hinh chu nhat la: " + chuViHinhCN);
        System.out.println("Dien tich hinh chu nhat la: " + dienTichHCN);

        //tinh chu vi va dien tich hinh vuong
        int canhHinhVuong = 50;
        int chuViHV = HinhVuong.chuVi(canhHinhVuong);
        int dientichHV = HinhVuong.dienTich(canhHinhVuong);
        System.out.println("Chu vi va dien tich Hinh Tron ");
        System.out.println("Chu vi hinh vuong la:" + chuViHV);
        System.out.println("Dien tich hinh vuong la:" + dientichHV);

        //tinh chu vi va dien tich Hinh Tron
        float bankinh = 2.6f;
        float chuViHC = HinhTron.chuViHinhTron(bankinh);
        float dienTichHC = HinhTron.dienTichHinhTron(bankinh);
        System.out.println("Chu vi va dien tich hinh tron");
        System.out.println("Chu vi hinh tron: " + chuViHC);
        System.out.println("Dien tich hinh tron: " + dienTichHC);
    }
}

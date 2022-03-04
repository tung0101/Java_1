/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.asm2;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachNhanVien {

    ArrayList<NhanVien> list = new ArrayList<>();

    public void nhap() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap ma nhan vien: ");
            String ID = scanner.nextLine();
            if (ID.equals("") || ID == null) {
                break;
            }
            System.out.print("Nhap ho ten nhan vien: ");
            String name = scanner.nextLine();
            System.out.print("Nhap luong co ban: ");
            double luongCoBan = Double.parseDouble(scanner.nextLine());
            System.out.print("Ban thuoc phong ban nao (Hanh chinh/Tiep thi/Truong Phong): ");
            String phongBan = scanner.nextLine();
            if (phongBan.equalsIgnoreCase("Hanh chinh")) {
                System.out.print("Nhap ngay cong: ");
                double ngayCong = scanner.nextDouble();
                NhanVien newNV = new NhanVienHanhChinh(ID, name, luongCoBan, phongBan, ngayCong);
                list.add(newNV);
                scanner.nextLine();
                System.out.print("ban co muon nhap them khong(Y/N): ");
                String check = scanner.nextLine();
                if (check.equals("n") || check.equals("N")) {
                    break;
                }
            } else if (phongBan.equalsIgnoreCase("Tiep thi")) {
                System.out.print("Nhap doanh so: ");
                double doanhso = scanner.nextDouble();
                System.out.print("Nhap hue hong: ");
                double huehong = scanner.nextDouble();
                NhanVien newNV = new TiepThi(ID, name, luongCoBan, phongBan, doanhso, huehong);
                list.add(newNV);
                scanner.nextLine();
                System.out.print("ban co muon nhap them khong(Y/N): ");
                String check = scanner.nextLine();
                if (check.equals("n") || check.equals("N")) {
                    break;
                }
            } else if (phongBan.equalsIgnoreCase("Truong Phong")) {
                System.out.print("Nhap Luong Trach nhiem: ");
                double Trachnhiem = scanner.nextDouble();
                NhanVien newNV = new TruongPhong(ID, name, luongCoBan, phongBan, Trachnhiem);
                list.add(newNV);
                scanner.nextLine();
                System.out.print("ban co muon nhap them khong(Y/N): ");
                String check = scanner.nextLine();
                if (check.equals("n") || check.equals("N")) {
                    break;
                }
            } else {
                System.out.println("Vui long nhap lai phong ban va cac thong tin khac !");
            }
        } while (true);
    }

    public void xuat() {
        for (NhanVien nv : list) {
            System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | Luong: %.2f\n", nv.getID(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
        }
    }

    public void timNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can tim: ");
        String ID = sc.nextLine();
        Boolean check = false;
        for (NhanVien nv : list) {
            if (ID.equalsIgnoreCase(nv.getID())) {
                System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | Luong: %.2f\n", nv.getID(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Nhan vien khong ton tai !");
        }
    }

    public void xoaNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can xoa: ");
        String ID = sc.nextLine();
        Boolean check = false;
        for (NhanVien nv : list) {
            if (ID.equalsIgnoreCase(nv.getID())) {
                list.remove(nv);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Nhan vien khong ton tai !");
        } else {
            System.out.println("Nhan vien da bi xoa !");
        }
    }

    public void capNhatNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can cap nhat: ");
        String IDFind = sc.nextLine();
        NhanVien found = null;
        int index = 0;
        for (NhanVien nv : list) {
            if (IDFind.equalsIgnoreCase(nv.getID())) {
                found = nv;
                index = list.indexOf(nv);
                break;//khong co truong hop trung id
            }
        }
        if (found != null) {
            System.out.print("Nhap ma nhan vien: ");
            String ID = sc.nextLine();
            if (ID.equals("") || ID == null) {
                ID = found.getID();
            }
            System.out.print("Nhap ho ten nhan vien: ");
            String name = sc.nextLine();
            if (name.equals("") || name == null) {
                name = found.getHoTen();
            }
            System.out.print("Nhap luong co ban: ");
            String luongCoBan = sc.nextLine();
            if (luongCoBan.equals("") || luongCoBan == null) {
                luongCoBan = String.valueOf(found.getLuongCoBan());
            }
            if (found instanceof NhanVienHanhChinh) {
                System.out.print("Nhap ngay cong: ");
                String ngayCong = sc.nextLine();
                if (ngayCong.equals("") || ngayCong == null) {
                    ngayCong = String.valueOf(((NhanVienHanhChinh) found).getNgayCong());
                }
                NhanVien nv = new NhanVienHanhChinh(ID, name, Double.parseDouble(luongCoBan), "Hanh Chinh", Double.parseDouble(ngayCong));
                list.set(index, nv);
            }
            if (found instanceof TiepThi) {
                System.out.print("Nhap doanh so: ");
                String doanhso = sc.nextLine();
                System.out.print("Nhap doanh so: ");
                String huehong = sc.nextLine();
                if (doanhso.equals("") || doanhso == null) {
                    doanhso = String.valueOf(((TiepThi) found).getDoanhso());
                }
                if (huehong.equals("") || huehong == null) {
                    huehong = String.valueOf(((TiepThi) found).getHuehong());
                }
                NhanVien nv = new TiepThi(ID, name, Double.parseDouble(luongCoBan), "Tiep Thi", Double.parseDouble(doanhso), Double.parseDouble(huehong));
                list.set(index, nv);
            }
            if (found instanceof TruongPhong) {
                System.out.print("Nhap Luong trach nhiem: ");
                String Trachnhiem = sc.nextLine();
                if (Trachnhiem.equals("") || Trachnhiem == null) {
                    Trachnhiem = String.valueOf(((TruongPhong) found).getTrachnhiem());
                }
                NhanVien nv = new NhanVienHanhChinh(ID, name, Double.parseDouble(luongCoBan), "Truong Phong", Double.parseDouble(Trachnhiem));
                list.set(index, nv);
            }
        } else {
            System.out.println("Nhan vien khong ton tai !");
        }
    }

    public void timTheoKhoangLuong() {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        System.out.println("tim nhan vien theo khoang luong");
        System.out.print("nhap khoang thap nhat:");
        float min = sc.nextFloat();
        System.out.print("nhap khoang cao nhat:");
        float max = sc.nextFloat();
        for (NhanVien NV : list) {
            if (NV.getLuong() >= min && NV.getLuong() <= max) {
                NV.xuat();
                System.out.println();
                found = true;
            }
        }
        if (found == false) {
            System.out.println(" khong co nhan vien nao co luong trong khoang can tim");
        }
    }

    public void sortName() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv1.getHoTen().compareTo(nv2.getHoTen());
            }
        };
        Collections.sort(list, comp);
        xuat();
    }

    public void sortLuong() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv1.getLuong().compareTo(nv2.getLuong());
            }
        };
        Collections.sort(list, comp);
        xuat();
    }

    public void xuatTop5() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv2.getLuong().compareTo(nv1.getLuong());
            }
        };
        Collections.sort(list, comp);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | Luong: %.2f\n", list.get(i).getID(), list.get(i).getHoTen(), list.get(i).getPhongBan(), list.get(i).getLuong());
        }
    }
}

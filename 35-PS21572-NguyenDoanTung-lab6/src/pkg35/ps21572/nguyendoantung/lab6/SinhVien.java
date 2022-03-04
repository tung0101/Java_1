package pkg35.ps21572.nguyendoantung.lab6;

import java.util.Scanner;
import java.util.ArrayList;

public class SinhVien {

    public static Scanner sc = new Scanner(System.in);
    String name, email, sdt, cmnd, toan, ly, hoa;
    Double dtb;
    String reemail = "\\w+@\\w+(\\.\\w+){1,2}";
    String resdt = "0\\d{9,10}";
    static String recmnd = "\\d{9,10}";
    String rediem = "10|\\d{1}|\\d{1}+\\.{1}+\\d{0,1}";

    SinhVien() {
    }

    SinhVien(String name, String email, String sdt, String cmnd, String toan, String ly, String hoa) {
        this.name = name;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public Boolean reemail(String str) {
        return str.matches(reemail);
    }

    public Boolean resdt(String str) {
        return str.matches(resdt);
    }

    public Boolean recmnd(String str) {
        return str.matches(recmnd);
    }

    public Boolean rediem(String str) {
        return str.matches(rediem);
    }

    public Double getDTB(String toan, String ly, String hoa) {
        return dtb = (Double.parseDouble(toan) + Double.parseDouble(ly) + Double.parseDouble(hoa)) / 3;
    }

    public String getXepLoai(Double dtb) {
        if (dtb < 3.5) {
            return "Kém";
        } else if (dtb < 5) {
            return "Yếu";
        } else if (dtb < 6.5) {
            return "Trung Bình";
        } else if (dtb < 8.5) {
            return "Khá";
        } else {
            return "Giỏi";
        }
    }

    public void setDS() {
        do {
            System.out.print("Mời nhập họ và tên: ");
            name = sc.nextLine();
            if (name == null || name.equals("")) {
                System.out.println("Tên không hợp lệ!");
            } else {
                break;
            }
        } while (true);
        do {
            System.out.print("Mời Nhập Email: ");
            email = sc.nextLine();
            if (reemail(email)) {
                break;
            } else {
                System.out.println("Email không hợp lệ!");
            }
        } while (true);
        do {
            System.out.print("Mời nhập SDT: ");
            sdt = sc.nextLine();
            if (resdt(sdt)) {
                break;
            } else {
                System.out.println("SDT không hợp lệ!");
            }
        } while (true);
        do {
            System.out.print("Mời nhập CMND: ");
            cmnd = sc.nextLine();
            if (recmnd(cmnd)) {
                break;
            } else {
                System.out.println("CMND không hợp lệ!");
            }
        } while (true);
        do {
            System.out.print("Mời nhập điểm Toán: ");
            toan = sc.nextLine();
            if (rediem(toan)) {
                break;
            } else {
                System.out.println("Điểm toán không hợp lệ!");
            }
        } while (true);
        do {
            System.out.print("Mời nhập điểm Lý: ");
            ly = sc.nextLine();
            if (rediem(ly)) {
                break;
            } else {
                System.out.println("Điểm Lý không hợp lệ!");
            }
        } while (true);
        do {
            System.out.print("Mời nhập điểm Hóa: ");
            hoa = sc.nextLine();
            if (rediem(hoa)) {
                break;
            } else {
                System.out.println("Điểm Hóa không hợp lệ!");
            }
        } while (true);
    }

    public void getDS() {
        System.out.printf("\t     %-23s   %-28s  %-13s    %-20s       %-21.1f    %-17s   %-12s\n", name, email, sdt, cmnd,
                getDTB(toan, ly, hoa),
                getXepLoai(getDTB(toan, ly, hoa)),
                xetHocBong());
    }

    public static void findTen(String str, ArrayList<SinhVien> list) {
        int temp = 0, temp1 = 0;
        for (SinhVien item : list) {
            if (item.name.toLowerCase().contains(str.toLowerCase())) {
                if (temp1 == 0) {
                    System.out.println(
                            "\t|                                                                          DANH SACH SINH VIEN                                                                       |");
                    System.out.printf(
                            "\t|      Ho Ten    \t|\t      Email       \t|\t    SDT    \t|\t    CMND    \t|\t    DTB   \t|\t   Hoc Luc   \t|\t Hoc bong \t|\n");
                    temp1++;
                }
                item.getDS();
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println(" " + str + " KHông tồn tại!");
        }
    }

    public static void findCMND(String str, ArrayList<SinhVien> list) {
        int temp = 0, temp1 = 0;
        for (SinhVien item : list) {
            if (item.cmnd.equals(str)) {
                if (temp1 == 0) {
                    System.out.println(
                            "\t|                                                                          DANH SACH SINH VIEN                                                                       |");
                    System.out.printf(
                            "\t|      Ho Ten    \t|\t      Email       \t|\t    SDT    \t|\t    CMND    \t|\t    DTB   \t|\t   Hoc Luc   \t|\t Hoc bong \t|\n");
                    temp1++;
                }
                item.getDS();
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println(" " + str + " KHông tồn tại!");
        }
    }

    public String xetHocBong() {
        if (getXepLoai(getDTB(toan, ly, hoa)).equalsIgnoreCase("GIỎI")) {
            return "2.000.000VNĐ";
        } else if (getXepLoai(getDTB(toan, ly, hoa)).equalsIgnoreCase("KHÁ")) {
            return "1.500.000VNĐ";
        } else {
            return " ";
        }

    }

}

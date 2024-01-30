import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Laptop HP_255 = new Laptop("HP 255 G8 45R27ES", 16, "4k",
                true, 500, "16", "Windows", "black");
        Brand brandHp = new Brand("HP", "USA.", "AmericaLanguage");
        HP_255.addBrand(brandHp);
        Laptop HP_ZBook_Power_G7 = new Laptop("HP ZBook Power G7 10J85AV", 14, "FullHD",
                true, 500, "8", "Windows", "grey");
        HP_ZBook_Power_G7.addBrand(brandHp);
        Laptop Samsung_Galaxy_Book2 = new Laptop("Samsung Galaxy Book2 NP750XED-KB3IT", 18, "FullHD",
                true, 300, "8", "Windows", "black");
        Brand brandSamsung = new Brand("Samsung", "Korea", "KoreaLanguage");
        Samsung_Galaxy_Book2.addBrand(brandSamsung);
        Laptop Samsung_Galaxy_Book3 = new Laptop("Samsung Galaxy Book3 15.6 NP754XFG-KB3IT", 16, "4k",
                false, 1000, "16", "Linux", "black");
        Samsung_Galaxy_Book3.addBrand(brandSamsung);
        Laptop Lenovo_IdeaPad_3 = new Laptop("Lenovo IdeaPad 3 15ABA7 82RN00C3", 16, "FullHD",
                true, 700, "8", "Windows", "grey");
        Brand brandLenovo = new Brand("Lenovo", "China", "ChinaLanguage");
        Lenovo_IdeaPad_3.addBrand(brandLenovo);
        Laptop Apple_Macbook_Pro_14 = new Laptop("Apple Macbook Pro 14\" M1 Pro 2021 MKGP3", 17, "4k",
                false, 1000, "8", "ios", "grey");
        Brand brandMacbook = new Brand("Apple", "USA.", "AmericaLanguage");
        Apple_Macbook_Pro_14.addBrand(brandMacbook);
        Laptop ASUS_TUF_Gaming_F15 = new Laptop("ASUS TUF Gaming F15 FX506HC-HN004", 17, "FullHD",
                true, 300, "4", "Windows", "black");
        Brand brandAsus = new Brand("Asus", "Taiwan", "ChinaLanguage");
        ASUS_TUF_Gaming_F15.addBrand(brandAsus);
        Laptop Acer_Aspire_3 = new Laptop("Acer Aspire 3 A315-58 NX.ADDER.01Y", 19, "FullHD",
                true, 600, "8", "Windows", "black");
        Brand brandAcer = new Brand("Acer", "Taiwan", "ChinaLanguage");
        Acer_Aspire_3.addBrand(brandAcer);
        Laptop Acer_Nitro_5 = new Laptop("Acer Nitro 5 AN515-46-R7XU NH.QGXER.005", 18, "4k",
                false, 500, "16", "Windows", "black");
        Acer_Nitro_5.addBrand(brandAcer);
        Laptop Acer_Swift_1 = new Laptop("Acer Swift 1 SF114-34-P8NR NX.A77ER.009", 16, "FullHD",
                true, 500, "8", "Linux", "black");
        Acer_Swift_1.addBrand(brandAcer);
        // создание множества
        Set<Laptop> laptop = new HashSet<>();
        laptop.add(HP_255);
        laptop.add(HP_ZBook_Power_G7);
        laptop.add(Samsung_Galaxy_Book2);
        laptop.add(Samsung_Galaxy_Book3);
        laptop.add(Lenovo_IdeaPad_3);
        laptop.add(Apple_Macbook_Pro_14);
        laptop.add(ASUS_TUF_Gaming_F15);
        laptop.add(Acer_Aspire_3);
        laptop.add(Acer_Nitro_5);
        laptop.add(Acer_Swift_1);
        Laptop FilterLaptop = new Laptop(); // создание нового объекта
        System.out.println(FilterLaptop.newFilter(laptop)); // вызов метода фильтрации
    }

}
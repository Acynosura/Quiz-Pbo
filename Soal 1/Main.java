public class Main {
    public static void main(String[] args) {
        Circle circ = new Circle();
        circ.setColor("Blue");
        System.out.println(circ);
        Cylinder Tabung1 = new Cylinder(7);
        Cylinder Tabung2 = new Cylinder(7, 10);
        Cylinder Tabung3 = new Cylinder(7,10, "Grey");
        Cylinder[] listTabung = { Tabung1, Tabung2, Tabung3 };

        for(int i = 0; i<3; i++){
            System.out.println("Tabung ke " + (i+1));
            listTabung[i].setColor("Green");
            System.out.println("Warna tabung = " + listTabung[i].getColor());
            listTabung[i].setHeight(30);
            System.out.println("Tinggi tabung = " + listTabung[i].getHeight());
            listTabung[i].setRadius(14);
            System.out.println("Keliling tabung = " + listTabung[i].getRadius());
            System.out.println("Volume tabung = " + listTabung[i].getVolume());
            System.out.println(listTabung[i]+ "\n");
        }
    }
}
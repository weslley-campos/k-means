
public class Main {


    public static void main(String[] args) {
        KMeans kMeans = new KMeans();
        kMeans.add(new Order("1", new Coordinators(-10.667933, -37.453114)));
        kMeans.add(new Order("12", new Coordinators(-10.671343, -37.432598)));
        kMeans.add(new Order("123", new Coordinators(-10.687155, -37.429647)));
        kMeans.add(new Order("1234", new Coordinators(-10.715771, -37.419976)));
        kMeans.add(new Order("12345", new Coordinators(-10.710381, -37.423224)));
        kMeans.add(new Order("123456", new Coordinators(-10.743475, -37.492840)));
        kMeans.getClustering().forEach(orderCluster -> System.out.println("orderCluster.toString() = " + orderCluster.toString()));
    }


}

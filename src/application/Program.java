package application;

import entities.Product;
import model.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));


        list.forEach(System.out::println);
        System.out.println("----------------------------------");

        ProductService ps = new ProductService();
        double sumT = ps.filteredSum(list, p -> p.getName().toUpperCase().charAt(0) == 'T');

        System.out.printf("A soma de todos os produtos que começam com a letra T é = R$%.2f", sumT);
    }
}

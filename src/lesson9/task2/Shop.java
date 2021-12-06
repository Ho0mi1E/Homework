package lesson9.task2;

import java.util.*;

public class Shop {
    Map<Integer, Product> shop;

    public Shop(HashMap<Integer, Product> shop) {
        this.shop = shop;
    }
    public void addProduct(Product a){
        shop.put(a.getId(),a);

    }
    public void deleteProduct(int key){
        if (shop.containsKey(key)){
            shop.remove(key);
        }

    }
    public void changePrice(int newPrice, int key){
        if (shop.get(key) != null){
            shop.get(key).setPrice(newPrice);
        }
    }
    public Product getProduct(int id){
        return shop.get(id);

    }

    public void info(){
        Set<Map.Entry<Integer, Product>> info = shop.entrySet();
        for (Map.Entry<Integer, Product> s: info){
            System.out.println(s);

        }

            
    }

    public void sortInfo(){


    }

    }


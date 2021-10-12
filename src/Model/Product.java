package Model;

import java.io.Serializable;

public class Product implements  Serializable {
    private int id;
    private String name;
    private String company;
    private int price;
    private String description;

    public Product() {
    }

    public Product(int id, String name, String madeFrom, int price, String description) {
        this.id = id;
        this.name = name;
        this.company = madeFrom;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", madeFrom='" + company + '\'' +
                ", price=" + price +
                ", description='" + description + '\''
                ;
    }
}

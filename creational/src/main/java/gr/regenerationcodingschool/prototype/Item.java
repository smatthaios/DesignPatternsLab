package gr.regenerationcodingschool.prototype;

public abstract class Item implements Cloneable {
    private String title;
    private double price;
    private String url;
    private Case itemCase;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Case getItemCase() {
        return itemCase;
    }

    public void setItemCase(Case itemCase) {
        this.itemCase = itemCase;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        this.itemCase = (Case)this.itemCase.clone();
        return super.clone();
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", url='" + url + '\'' +
                ", itemCase=" + itemCase +
                '}';
    }
}

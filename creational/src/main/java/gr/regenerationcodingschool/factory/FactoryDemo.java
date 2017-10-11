package gr.regenerationcodingschool.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(/*WebsiteType.BLOG*/"BLOG");

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite("SHOP");

        System.out.println(site.getPages());
    }

}

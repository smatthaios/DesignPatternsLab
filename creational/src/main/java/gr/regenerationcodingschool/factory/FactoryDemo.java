package gr.regenerationcodingschool.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(/*WebsiteType.BLOG*/"BLOG");

        if(!site.isNull())
            System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite("SHOP");

        if(!site.isNull())
            System.out.println(site.getPages());
    }

}

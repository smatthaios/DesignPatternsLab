package gr.regenerationcodingschool.patterns.factory;

public class MessyFactoryDemo {
    public static void main(String args[]) {
        String websiteType = "BLOG";
        Website website = null;

        //Needs refactoring
        if (websiteType == "BLOG") {
            website = new Blog();
        } else if(websiteType == "SHOP") {
            website = new Shop();
        } else {
            website = new NullWebsite();
        }

        System.out.println(website.getPages());

        //Needs refactoring
        websiteType = "BLOG";
        Website newWebsite = null;

        if (websiteType == "BLOG") {
            newWebsite = new Blog();
        } else if(websiteType == "SHOP") {
            newWebsite = new Shop();
        } else {
            newWebsite = new NullWebsite();
        }

        System.out.println(newWebsite.getPages());

    }
}

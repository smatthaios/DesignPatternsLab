package gr.regenerationcodingschool.factory;

public class WebsiteFactory {

    public static Website getWebsite(/*WebsiteType*/String siteType) {
        switch (siteType) {
            case "BLOG": {
                return new Blog();
            }

            case "SHOP": {
                return new Shop();
            }

            //add case for site

            default: {
                return null;
            }
        }
    }

}

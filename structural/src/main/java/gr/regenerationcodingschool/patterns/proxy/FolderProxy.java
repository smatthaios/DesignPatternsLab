package gr.regenerationcodingschool.patterns.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FolderProxy implements Folder {
    private static final Logger LOGGER = LoggerFactory.getLogger(FolderProxy.class);

    Folder folder;
    User user;

    public FolderProxy(User user) {
        this.user = user;
    }


    public void performOperations() {

        if (user.getUserName().equalsIgnoreCase("user") && user.getPassword().equalsIgnoreCase("secret")) {
            folder = new FolderImpl();
            folder.performOperations();
        } else {
            LOGGER.info("You don't have access to this folder");
        }
    }
}
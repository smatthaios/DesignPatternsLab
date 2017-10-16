package gr.regenerationcodingschool.patterns.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProxyDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProxyDemo.class);

    public static void main(String[] args) {

        //When you click on folder,Lets say a GUI form will ask for userName and password.
        //and this GUI will create this user object

        // If we give correct userName and password
        User user = new User("user", "secret");
        FolderProxy folderProxy = new FolderProxy(user);
        LOGGER.info("When userName and password are correct:");
        folderProxy.performOperations();

        // if we give wrong userName and Password
        User userWrong = new User("invalidUser", "invalidPass");
        folderProxy = new FolderProxy(userWrong);
        LOGGER.info("When userName and password are incorrect:");
        folderProxy.performOperations();
    }
}

package gr.regenerationcodingschool.factory;

public class NullWebsite extends Website {

    @Override
    public void createWebsite() {
    }

    @Override
    public boolean isNull(){
        return true;
    }

}

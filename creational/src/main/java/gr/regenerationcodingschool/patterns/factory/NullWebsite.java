package gr.regenerationcodingschool.patterns.factory;

public class NullWebsite extends Website {

    @Override
    public void createWebsite() {
    }

    @Override
    public boolean isNull(){
        return true;
    }

}

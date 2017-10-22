package gr.regenerationcodingschool.patterns.chainOfResponsibility.withoutChain;

public class WithoutChainOfResponsibilityDemo {
    public static void main(String args[]) {
        Request request = new Request(RequestType.CONFERENCE, 2000);


        if(request.getRequestType() == RequestType.CONFERENCE) {
            Director director = new Director();
            director.handleRequest(request);
        }
        else if(request.getRequestType() == RequestType.PURCHASE) {
            if(request.getAmount() < 1500) {
                VP vp = new VP();
                vp.handleRequest(request);
            }
        } else {
            CEO ceo = new CEO();
            ceo.handleRequest(request);
        }
    }
}

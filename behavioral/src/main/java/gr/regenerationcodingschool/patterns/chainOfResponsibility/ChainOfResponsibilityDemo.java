package gr.regenerationcodingschool.patterns.chainOfResponsibility;


public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        //Keep in mind that in other examples of Chain a request may be handled by more than one handlers
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        crystal.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);
    }
}

public class ConcreteHandler2 implements Handler {

    private Handler successor = null;

    public void handleRequest( String request, Operation operation ) {
        System.out.println( "R2 got the request...");
        if ( request.equalsIgnoreCase("R2") )
        {
            operation.operation(this.getClass().getName());
//            System.out.println( this.getClass().getName() + " => This one is mine!");
        }
        else
        {
            if ( successor != null )
                successor.handleRequest(request, operation);
        }

    }

    public void setSuccessor(Handler next) {
        this.successor = next ;
    }


}

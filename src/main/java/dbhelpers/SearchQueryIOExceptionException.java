
/**
 * SearchQueryIOExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package dbhelpers;

public class SearchQueryIOExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1640417462569L;
    
    private dbhelpers.SearchQueryStub.SearchQueryIOException faultMessage;

    
        public SearchQueryIOExceptionException() {
            super("SearchQueryIOExceptionException");
        }

        public SearchQueryIOExceptionException(java.lang.String s) {
           super(s);
        }

        public SearchQueryIOExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SearchQueryIOExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(dbhelpers.SearchQueryStub.SearchQueryIOException msg){
       faultMessage = msg;
    }
    
    public dbhelpers.SearchQueryStub.SearchQueryIOException getFaultMessage(){
       return faultMessage;
    }
}
    
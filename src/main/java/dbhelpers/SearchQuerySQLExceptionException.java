
/**
 * SearchQuerySQLExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package dbhelpers;

public class SearchQuerySQLExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1640417462547L;
    
    private dbhelpers.SearchQueryStub.SearchQuerySQLException faultMessage;

    
        public SearchQuerySQLExceptionException() {
            super("SearchQuerySQLExceptionException");
        }

        public SearchQuerySQLExceptionException(java.lang.String s) {
           super(s);
        }

        public SearchQuerySQLExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SearchQuerySQLExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(dbhelpers.SearchQueryStub.SearchQuerySQLException msg){
       faultMessage = msg;
    }
    
    public dbhelpers.SearchQueryStub.SearchQuerySQLException getFaultMessage(){
       return faultMessage;
    }
}
    
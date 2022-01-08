
/**
 * SearchQueryCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package dbhelpers;

    /**
     *  SearchQueryCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SearchQueryCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SearchQueryCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SearchQueryCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for isNumeric method
            * override this method for handling normal response from isNumeric operation
            */
           public void receiveResultisNumeric(
                    dbhelpers.SearchQueryStub.IsNumericResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from isNumeric operation
           */
            public void receiveErrorisNumeric(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPhoto method
            * override this method for handling normal response from getPhoto operation
            */
           public void receiveResultgetPhoto(
                    dbhelpers.SearchQueryStub.GetPhotoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPhoto operation
           */
            public void receiveErrorgetPhoto(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for doSearch method
            * override this method for handling normal response from doSearch operation
            */
           public void receiveResultdoSearch(
                    dbhelpers.SearchQueryStub.DoSearchResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from doSearch operation
           */
            public void receiveErrordoSearch(java.lang.Exception e) {
            }
                


    }
    
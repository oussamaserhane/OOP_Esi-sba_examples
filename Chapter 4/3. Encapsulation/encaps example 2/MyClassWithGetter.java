class MyClass { 
    public int myPublicVar = 20;
    protected int myProtectedVar = 10;
    private int myPrivateVar = 30; 
    
// added (public) getter function to access private variable
    public int getMyPrivateVar (){ 
        return this.myPrivateVar;
    } 
}



public class person {
    private String FullName = "Jhon Doe";
    private String email = "Jhon@SuperSecure.com";
    public int age = 44;

    //Getter, this will get private info, and make it public. Watch
    public String GetName() {
        return FullName;

        //Since the getname() is public, i can call it in other class. But I cant call FullName directly from other classes
        
    }

    //Value Setter
    public void setName(String NewName){
        this.FullName = NewName; 

        //this keyword is used to refer the stuff inside current class/construstor in case we have duplicate variable names, outside and inside constructor/Class
//‘this’ keyword is used to refer the current object inside a constructor or method​

    }
    

}



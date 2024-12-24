package Encapsulation;

public class Login {
    private String UserName;
    private String PassWord;

  //  public String getUserName(){
//        return UserName;
//    }
//    public String getPassWord(){
//        return PassWord;
//    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
//

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }
//    public void setUserName(String userName) {
//        UserName = userName;
//    }
//
//    public void setPassWord(String passWord) {
//        PassWord = passWord;
//    }

    public static void main(String[] args) {
        Login lg = new Login();
        lg.setUserName("Ragul");
        lg.setPassWord("Qwa");
        System.out.println("UserName :" + lg.getUserName());
        System.out.println("PassWord :" + lg.getPassWord());
    }
}

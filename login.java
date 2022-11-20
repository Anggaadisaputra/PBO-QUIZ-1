public class login {
    public boolean doLogin(){
        boolean isLogin=true;
        String ID="admin123";
        String idInput="";

        System.out.println("Silahkan Masukan ID Anda");
        System.out.println("=========================");
        System.out.print("ID : ");

        if(!idInput.equalsIgnoreCase(ID)){
            System.out.println("ID Anda Salah -> "+idInput);
            isLogin=false;
        }

        return isLogin;
    }
}
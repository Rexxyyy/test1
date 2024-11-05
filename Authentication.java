public class Authentication {
  public static void main(String[] args) {
    System.out.println("Hello World");

    Authentication authObj = new Authentication();
    authObj.login();
    authObj.resetPassword();
    authObj.createAccount();
  }

  public void login() {
    System.out.println("Login success");
  }

  public void createAccount() {
    System.out.println("Account created Successfully");
  }

  public void resetPassword() {
    System.out.println("Reset password successfully");
  }
}

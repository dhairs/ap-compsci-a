public interface InterfacesTwo {

    public void setPassword(String password);

    public boolean checkPassword(String enteredPassword);

    public void resetPassword(String newPassword);

    public void lockDocument();

    public void unlockDocument(String enteredPassword);

}

public abstract class IComboLock {
    public boolean locked;
    public int[] combo = new int[3];

    // method will set the combination of a lock
    abstract public void setcombo(int num1, int num2, int num3);

    public boolean isLocked() {
        return locked;
    }

    // method will check to see if the combination matches. If yes it will
    // unlock the lock, if no it will leave it locked.
    abstract public void unlock(int num1, int num2, int num3);

    public void lock() {
        locked = true;
    }
}

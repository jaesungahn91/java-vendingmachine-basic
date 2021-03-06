package vendingMachine;

public class ChangesModule {

    private int changes;

    public ChangesModule() {
        this(0);
    }

    public ChangesModule(int changes) {
        this.changes = changes;
    }

    public void put(int changes) {
        this.changes += changes;
    }

    public void withdraw(int changes) {
        final int result = this.changes - changes;
        if (result < 0) {
            throw  new IllegalStateException();
        }
        this.changes = result;
    }

    public int getChanges() {
        return changes;
    }
}

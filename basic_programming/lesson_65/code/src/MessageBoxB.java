package ait.messages.model;

public class MessageBoxB implements MessageBox {
    private String message;

    @Override
    public synchronized void post(String message) {
        while (this.message != null) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.message = message;
        this.notifyAll();
    }

    @Override
    public synchronized String get() {
        while (this.message == null) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String res = message;
        message = null;
        this.notifyAll();
        return res;
    }
}

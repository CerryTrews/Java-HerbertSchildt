public class CircularQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public CircularQueue( int size) {
        q = new char[size+1];
        putloc = getloc = 0;
    }

    public void put(char ch) throws QueueFullException {
        if(putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            throw new QueueFullException(q.length);
        }
        q[putloc++] = ch;
        if(putloc == q.length) {
            putloc = 0;
        }
    }

    public char get() throws QueueEmptyException {
        if(getloc == putloc) {
            throw new QueueEmptyException();
        }
        char ch = q[getloc++];
        if(getloc == q.length) {
            getloc = 0;
        }
        return ch;
    }
}

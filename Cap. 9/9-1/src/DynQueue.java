public class DynQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public DynQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) throws QueueFullException {
        if(putloc == q.length) {
            char t[] = new char[q.length * 2];
            for(int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
            q = t;
            throw new QueueFullException(q.length);
        }
        q[putloc++] = ch;
    }

    public char get() throws QueueEmptyException {
        if(getloc == putloc) {
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }
}

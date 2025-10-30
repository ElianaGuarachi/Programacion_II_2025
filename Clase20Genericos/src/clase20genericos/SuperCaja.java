package clase20genericos;

public class SuperCaja<L,R> {
    
    private L lef;
    private R right;

    public L getLef() {
        return lef;
    }

    public R getRight() {
        return right;
    }

    public void setLef(L lef) {
        this.lef = lef;
    }

    public void setRight(R right) {
        this.right = right;
    }

    
}

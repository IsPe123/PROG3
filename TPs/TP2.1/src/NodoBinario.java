public class NodoBinario {
    private int value;
    private NodoBinario nodoPadre;
    private NodoBinario left, right;
    
    public NodoBinario(int value) {
        this.value = value;
        this.nodoPadre = null;
        this.left = null;
        this.right = null;
    }

    public NodoBinario(int value, NodoBinario ll, NodoBinario rr) {
        this.value = value;
        this.nodoPadre = null;
        this.left = ll;
        this.right = rr;
    }

    public void setPadre(NodoBinario nn) {
        this.nodoPadre = nn;
    }

    public int getValue() {
        return this.value;
    }

    public void setNodoLeft(NodoBinario nn) {
        this.left = nn;
        nn.setPadre(this);
    }

    public void setNodoRight(NodoBinario nn) {
        this.right = nn;
        nn.setPadre(this);
    }

    public NodoBinario getLeft() {
        return this.left;
    }

    public NodoBinario getRight() {
        return this.right;
    }

    public int getRoot() {
        if (this.nodoPadre == null) {
            return value;   
        }
        return this.nodoPadre.getRoot();
    }
    
    public boolean hasElem(int nn) {
        boolean salida = (nn == this.value);
        if ((this.left != null) && (!salida)) {
            salida = this.left.hasElem(nn);
        }
        if ((this.right != null) && (!salida)) {
            salida = this.right.hasElem(nn);
        }
        return salida;
    }


    public boolean isEmpty() {
        return true; //Retornar valor o reotonar si tiene nodos hijos??
    }



    // PRÁCTICO ARBOLES
    //Integer getRoot()
    //boolean hasElem(Integer)
        //boolean isEmpty()             Valor o hijos?
        //void insert(Integer)          Insert un valor en un nodo nuevo?
        //boolean delete(Integer)       Borrar este nodo?
        //int getHeight()               Subo y de ahi empiezo a bajar?
        //void printPosOrder()          Imprimo de a uno o voy armando una lista?
        //void printPreOrder()          --Lo mismo
        //void printInOrder()           --Lo mismo
        //List getLongestBranch() 
        //List getFrontera()
        //Integer getMaxElem()
        //List getElemAtLevel(int)
} 

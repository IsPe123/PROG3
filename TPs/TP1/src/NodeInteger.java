public class NodeInteger<Integer> {

	private Integer info;
	private NodeInteger<Integer> next;

	public NodeInteger() {
		this.info = null;
		this.next = null;
	}
	
    //Agregue este constructor
    public NodeInteger(Integer info) {
		this.info = info;
		this.next = null;
	}
    /////////////////////////

	public NodeInteger(Integer info, NodeInteger<Integer> next) {
		this.setInfo(info);
		this.setNext(next);
	}
	
	public NodeInteger<Integer> getNext() {
		return next;
	}

	public void setNext(NodeInteger<Integer> next) {
		this.next = next;
	}

	public Integer getInfo() {
		return info;
	}

	public void setInfo(Integer info) {
		this.info = info;
	}

    @Override
    public String toString() {
        return "" + this.info;
    }

}
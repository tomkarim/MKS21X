
public class SuperArray{
    private String[] data;
    private int size;

    public SuperArray() {
	data = new String[10];
	size = 0;
    }

    public void clear() {
        data = new String[10];
    	size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(String element) {
        if (size == data.length) {
            resize();
	}
	data[size] = element;
	size++;
	return true;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
	    throw new IndexOutOfBoundsException("index given:" + index + "; current size:" + size);
	}
	return data[index];
    }

    public String set(int index, String element) {
        if (index < 0 || index >= size) {
	    throw new IndexOutOfBoundsException("index given:" + index + "; current size:" + size);
	}
	String old = data[index];
	data[index] = element;
	return old;
    }

    public String toString() {
	String arr = "[";
	for (int i = 0; i < this.size(); i++) {
	    arr += data[i] + ",";
	}
	if (arr.length() > 1) {
	    arr = arr.substring(0, arr.length() -1);
	    arr += "]";
	}
	    return arr;
    }

    public boolean contains(String element) {
	if (this.size() == 0) {
	    return false;
	}
	for (int i = 0; i < this.size(); i++) {
	    if (this.get(i) == element) {
		return true;
	    }
	}
	return false;
    }

    public void resize() {
	String[] temp;
	if (data.length == 0) {
	    temp = new String[10];
	} else {
	    temp = new String[data.length * 2 + 1];
	}
	for (int i = 0; i < size; i++) {
	    temp[i] = data[i];
	}
	data = temp;
    }

    public void add(int index, String element) {
	if (size == data.length){
	    resize();
	}
	if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index given:" + index + "; current size:" + size);
        }
	for (int i = size - 1; i >= index; i--) {
	    data[i+1] = data[i];
	}
	data[index] = element;
	size++;
    }

    public int indexOf(String element) {
	for (int i = 0; i < this.size(); i++) {
	    if (data[i] == element) {
		return i;
	    }
	}
	return -1;
    }

    public int lastIndexOf(String element) {
	for (int i = this.size(); i >= 0; i--) {
	    if (data[i].equals(element)) {
		return i;
	    }
	}
	return -1;
    }

    public String remove(int index) {
        if (index < 0 || index >= size) {
	    throw new IndexOutOfBoundsException("index given:" + index + "; current size:" + size);
	}
	String old = data[index];
	for (int i = index; i < size; i++) {
	    this.set(i, this.get(i+1));
	}
	size--;
	return old;
    }

    public boolean remove(String element) {
	if (this.contains(element)) {
	    this.remove(this.indexOf(element));
	    return true;
	}
	return false;
    }
}

	
					      
					     
	    

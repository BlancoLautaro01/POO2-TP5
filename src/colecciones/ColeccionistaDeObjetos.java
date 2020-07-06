package colecciones;

import java.util.List;

public class ColeccionistaDeObjetos {

	public Object getFirstFrom(List<Object> colection) {
		return colection.get(0);
	}
	
	public void addLast(List<Object> colection, Object e) {
		colection.add(e);
	}
	
	public List<Object> addLast(List<Object> colection, int from, int to) {
		return colection.subList(from, to);
	}
	
	public boolean containsElement(List<Object> colection, Object e) {
		return colection.contains(e);
	}
}

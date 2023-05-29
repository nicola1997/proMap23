package data;
import java.util.*;

abstract class Attribute {
	String name;
	int index;

private Attribute(String name,int index) {
	
}

public String getName() {
	return name;
}


public int getIndex() {
	return index;
}
public String toString(){
	return name;
}

}
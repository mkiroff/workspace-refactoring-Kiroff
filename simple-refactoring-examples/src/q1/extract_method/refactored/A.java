package q1.extract_method.refactored;

import java.util.List;


public class A {
	Node m1(List<Node> nodes, String p) {
		ex(nodes, p);
		// other implementation
		return null;
	}

	Node m2(List<Node> nodeList, String p) {
		ex(nodeList, p);
		// other implementation
		return null;
	}
	
	private void ex(List<Node> nodes, String p) {
		for (Node node : nodes) {
			if (node.contains(p))
				System.out.println(node);
		}
	}
	
	

}

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}
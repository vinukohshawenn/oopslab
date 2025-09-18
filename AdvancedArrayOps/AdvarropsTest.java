mport static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
public class AdvarropsTest {
private advarrops obj;
@Before
public void setUp() {
obj = new advarrops();
obj.list.add("apple");
obj.list.add("banana");
obj.list.add("grape");
obj.list.add("mango123");
obj.list.add("apple");
}
@Test
public void testRemoveDuplicates() {
obj.dpclt_rem();
assertEquals(4, obj.list.size());
assertTrue(obj.list.contains("apple"));
}
@Test
public void testAscSort() {
obj.asc_sort();
assertEquals("apple", obj.list.get(0));
assertEquals("mango123", obj.list.get(obj.list.size() - 1));
}
@Test
public void testDscSort() {
obj.dsc_sort();
assertEquals("mango123", obj.list.get(0));
}
@Test
public void testInsertAtIndex() {
obj.list.clear();
obj.list.add("apple");
obj.list.add("banana");
obj.list.add("grape");
obj.list.add(1, "cherry");
assertEquals("cherry", obj.list.get(1));
}
@Test
public void testPartialSearchLogic() {
ArrayList<String> partialResult = new ArrayList<>();
String searchTerm = "ap";
for (String s : obj.list) {
  if (s.toLowerCase().contains(searchTerm.toLowerCase())) {
  partialResult.add(s);
  }
}
  assertTrue(partialResult.contains("apple"));
  assertTrue(partialResult.contains("grape"));
  }
}

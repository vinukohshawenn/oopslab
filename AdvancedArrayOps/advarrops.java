import java.util.*;
import java.util.regex.*;
public class advarrops {
ArrayList<String> list = new ArrayList<>();
private Scanner prt = new Scanner(System.in);
public void inputaq() {
  System.out.print("Enter the number of strings: ");
  int num = prt.nextInt();
  prt.nextLine();
  for (int i = 0; i < num; i++) {
  System.out.print("String " + (i + 1) + ": ");
  list.add(prt.nextLine());
  }
}

public void dpclt_rem() {
LinkedHashSet<String> set = new LinkedHashSet<>(list);
list.clear();
list.addAll(set);
}
  
public void idx_insert() {
System.out.print("Index: ");
int index = prt.nextInt();
prt.nextLine(); c
System.out.print("String to insert: ");
String str = prt.nextLine();
if (index >= 0 && index <= list.size()) {
  list.add(index, str);
} else {
  System.out.println("Invalid Index! Element inserted at the end.");
  list.add(str);
  }
}
  
public void asc_sort() {
Collections.sort(list);
}
  
public void dsc_sort() {
list.sort(Collections.reverseOrder());
}
  
public void search() {
System.out.print("Enter a string to search: ");
String searchstr = prt.nextLine();
if (list.contains(searchstr)) {
  System.out.println(searchstr + " found in the list!");
} else {
  System.out.println(searchstr + " not found!");
  }
}

public void startingltr() {
System.out.print("Enter a starting letter: ");
char start = prt.nextLine().charAt(0);
ArrayList<String> strtlist = new ArrayList<>();
for (String s : list) {
  if (s.toLowerCase().startsWith(String.valueOf(start).toLowerCase())) {
  strtlist.add(s);
  }
}
Collections.sort(strtlist);
System.out.println("Strings starting with '" + start + "': " + strtlist);
}
  
public void partialsearch() {
System.out.print("Enter the SUBSTRING to search: ");
String part = prt.nextLine();
ArrayList<String> part_arr = new ArrayList<>();
for (String i : list) {
  if (i.toLowerCase().contains(part.toLowerCase())) {
  part_arr.add(i);
  }
}
System.out.println("Partial Matches: " + part_arr);
}
public void regex() {
System.out.print("Enter REGEX to match: ");
String regex = prt.nextLine();
Pattern prtn = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
ArrayList<String> regex_arr = new ArrayList<>();
for (String j : list) {
Matcher mtchr = prtn.matcher(j);
if (mtchr.find()) {
  regex_arr.add(j);
  }
}
System.out.println("REGEX matches: " + regex_arr);
}
public void display(String x) {
System.out.println(x + list);
}
public static void main(String[] args) {
advarrops obt = new advarrops();
obt.inputaq();
obt.dpclt_rem();
obt.display("\nList after removing duplicates: ");
obt.idx_insert();
obt.display("After insertion: ");
obt.asc_sort();
obt.display("\nSorted Ascending: ");
obt.dsc_sort();
obt.display("Sorted Descending: ");
obt.search();
obt.startingltr();
obt.partialsearch();
obt.regex();
}
}

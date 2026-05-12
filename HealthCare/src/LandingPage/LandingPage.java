package LandingPage;

import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LandingPage {
	
	int x;
	int y;
	int z;
	String name;
	
	public LandingPage(int x,int y,int z,String name) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.name=name;
	}

	public static void main(String[] args) {

		List<LandingPage> al = Arrays.asList(new LandingPage(10, 5, 4, "A"),
        new LandingPage(2, 5, 4, "A"),
        new LandingPage(7, 5, 4, "A"),
        new LandingPage(10, 5, 4, "A"),
        new LandingPage(6, 9, 4, "A"),
        new LandingPage(9, 5, 4, "A"),
        new LandingPage(10, 4, 4, "A"),
        new LandingPage(11, 5, 4, "B"),
        new LandingPage(10, 5, 4, "B"),
        new LandingPage(45, 88, 4, "B"),
        new LandingPage(3, 6, 4, "B"),
//        new LandingPage(9, 5, 4, "B"),
        new LandingPage(2, 6, 4, "C"),
//        new LandingPage(10, 5, 4, "C"),
        new LandingPage(4, 5, 4, "C"),
        new LandingPage(4, 5, 4, "E"));        
		
		
		Map<String, Integer> extract = al.stream()
                .collect(Collectors.groupingBy(
                        n -> n.name,
                        Collectors.summingInt(n -> n.x + n.y - n.z)
                ));
 
        extract.forEach((empname, Integer)
                -> System.out.println(empname + " = > " + Integer)
        );
        
        
	}

}

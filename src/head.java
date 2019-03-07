import java.util.*;

public class head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String s = kb.nextLine();
		
		String[] chars = s.split("");
		
		//int[] ints = new int[chars.length];
		//int l = 0;
		
		Map<Integer, Integer> ints = new TreeMap<Integer, Integer>();		
		
		for(int i = 0; i < chars.length; i++) {
			try {
				int n = Integer.parseInt(chars[i]);
				ints.put(i, n);
			} catch (NumberFormatException e) {
				
			}
		}
		
		int p;
		int c;
		boolean b = true;
		
		Iterator<Integer> iter1 = ints.keySet().iterator();
		
		while(iter1.hasNext()) {
			p = iter1.next();
			
			Iterator<Integer> iter2 = ints.keySet().iterator();
			while(iter2.hasNext()) {
				c = iter2.next();
				if(ints.get(c) + ints.get(p) == 10 && c > p) {
					int q = 0;
					for(int i = p; i < c; i++) {
						//System.out.print(chars[i]);
						if(chars[i].equals("?")) {
							q++;
						}
					}
					//System.out.printf("%d ", q);
					if (q != 3) {
						b = false;
					}
				}
			}
		}
		
		System.out.println(b);
		
		/*
		Iterator<Integer> iter = ints.keySet().iterator();
		
		int p = 0;
		int c;
		
		if(iter.hasNext()) {
			p = iter.next();
		}
		
		boolean b = true;
		
		while(iter.hasNext()) {
			c = iter.next();
			//System.out.printf("(%d, %d) ", p, ints.get(p));
			if(ints.get(c) + ints.get(p) == 10) {
				int q = 0;
				for(int i = p; i < c; i++) {
					//System.out.print(chars[i]);
					if(chars[i].equals("?")) {
						q++;
					}
				}
				//System.out.printf("%d ", q);
				if (q != 3) {
					b = false;
				}
			}
			p = c;
		}
		
		if(b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		*/
	}
}

/**
 * 
 */
package SectionOne;

import java.util.HashSet;

/**
 * @author Administrator
 * ��������һЩ��ĸ���ɵ�һ����ά�����Լ�һ�鵥����ɡ�Ŀ����Ҫ�ҳ������еĵ��ʣ� ��Щ���ʿ�����ˮƽ����ֱ�����ضԽ����κη�����õġ�
 */
public class WordPuzzles {

	static char [][] words = new char[][]{{'a', 'b', 'a', 't'},
							 			  {'n', 'a', 'g', 'h'},
							 			  {'e', 'r', 'j', 'w'},
							 			  {'t', 'e', 'a', 'l'}};
	
	String[] word = {"bat", "net", "tea"};
	static HashSet<String> findWords = new HashSet<String>();
	static void getWords(char[][] ww){
		//get all words by row
		for(int i=0; i<ww[0].length; i++){
			System.out.println(i);
			System.out.println(ww[i]);
			findWords.add(ww[i].toString());
			//for(int j = 0; j<)
			char[] col = new char[ww[0].length];
			
			for(int j = 0; j<ww.length; j++){
				col[j] = ww[j][i];
				
			}
			System.out.println(col);
			findWords.add(col.toString());
		}

		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getWords(words);
	}

}

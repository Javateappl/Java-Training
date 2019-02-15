/**
 * 
 */
package SectionOne;

import java.util.HashSet;

/**
 * @author Administrator
 * 输入是由一些字母构成的一个二维数组以及一组单词组成。目标是要找出字谜中的单词， 这些单词可能是水平、垂直或者沿对角线任何方向放置的。
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

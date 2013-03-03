import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.HasAttributeFilter;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;

public class ParserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String url = "http://book.360buy.com/10893884.html";
//		String url2="book.360buy.com/10893884.html";
//		Pattern p = Pattern.compile(".*book.360buy.com/\\d+.html");
//		Matcher m = p.matcher(url);
//		Matcher m2 = p.matcher(url2);
//		
//		if(m.matches()){
//			System.out.println("m true");
//		}
//		if(m2.matches()){
//			System.out.println("m2 true");
//		}
		try {
			//String html = "<html><head><title></title></head><body><ul id='summary'><li><span>作　　者：</span><a target='_blank' href='http://www.360buy.com/writer/（美）舒尔茨_1.html'>（美）舒尔茨</a> 著<a target='_blank' href='http://search.360buy.com/Search?book=y&keyword=时尚正嘉'>时尚正嘉</a> 编 </li><li ><span>出 版 社：</span>广西美术出版社</a></li></ul><div id='12'>div content</div></body></html>";
			String html="";
			
			
			
			
			
			
			
			
			Parser parser = new Parser(html);
			NodeFilter li = new HasAttributeFilter("id", "summary");
			// NodeFilter author = new StringFilter("作　　者：");
			// NodeFilter filter = new AndFilter(li,author);
			NodeList nodes = parser.extractAllNodesThatMatch(li);
			NodeList authors = nodes.elementAt(0).getChildren().elementAt(1).getChildren();
			for (int i = 0; i < authors.size(); i++) {
				System.out.println(authors.elementAt(i).toPlainTextString());
			}
			
			parser = new Parser(html);
			NodeFilter nf = new TagNameFilter("div");
			NodeList nl = parser.extractAllNodesThatMatch(nf);
			for(int i = 0; i<nl.size();i++){
				System.out.println(nl.elementAt(i).toPlainTextString());
			}
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

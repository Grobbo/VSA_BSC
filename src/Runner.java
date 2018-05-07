import java.io.IOException;


public class Runner {

	
	public static void main(String Args[]) throws IOException{
		AEM aem = new AEM(true);
		EM em = new EM(true);
		EB eb = new EB();
		PU pu = new PU(aem,em);
		
		Sign s1 = eb.createSignBasicEncoding(HDVECTOR.Cb, HDVECTOR.Sb, HDVECTOR.Tr, HDVECTOR.Cr);
		Sign s2 = eb.createSignBasicEncoding(HDVECTOR.Sb, HDVECTOR.Tb, HDVECTOR.Cr, HDVECTOR.Cb);
		
		pu.SaveEncodingAndDirectionToExp(s1, DIR.RIGHT);
		//em.savePersistent();
		//aem.savePersistent();
		
		System.out.println(pu.checkForBestMatch(s1, s2));
		System.out.println(pu.checkForBestMatch(s2, s1));
	}

}

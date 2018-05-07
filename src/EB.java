
public class EB {

	AEM aem;
	
	public EB(){
		
	}
	
	public Sign createSignBasicEncoding(HDVECTOR shape_top_left, HDVECTOR shape_top_right, HDVECTOR shape_bottom_left, HDVECTOR shape_bottom_right){
		Sign s = new Sign();
		s.setTopLeftShape(shape_top_left);
		s.setTopRightShape(shape_top_right);
		s.setBottomLeftShape(shape_bottom_left);
		s.setBottomRightShape(shape_bottom_right);
		return s;
	}
	
}

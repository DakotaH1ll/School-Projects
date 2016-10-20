package Dope;

public class Object {

	private Point2D position;
	
	public Point2D getPosition() {
		return this.position;
	}
	
	public float getDistanceTo(Object obj) {
		
		float dist = (float)MathUtils.getLinearDistance(this.getPosition().getX(), this.getPosition().getY(), obj.getPosition().getX(), obj.getPosition().getY());
		
		return dist;
		
	}
	
}

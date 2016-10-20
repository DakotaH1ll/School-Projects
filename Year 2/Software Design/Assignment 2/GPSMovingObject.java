package Dope;

public class GPSMovingObject extends Object {

	private Point2D position;
	private float velocity;
	private Vector2D orientation;

	public GPSMovingObject(Point2D pos1, float vel1, Vector2D ori1) {
		this.position = pos1;
		this.velocity = vel1;
		this.orientation = ori1;

	}

	public Vector2D getOrientation() {
		return this.orientation;
	}

	public float getVelocity() {
		return this.velocity;
	}

	public float getEstimatedTimeTo(GPSMovingObject obj2) {

		float vel = this.getVelocity();
		float dist = (float) MathUtils.getLinearDistance(this.position.getX(),
				this.position.getY(), obj2.position.getX(), obj2.position.getY());
		return dist / vel;
	}
}

package jp.co.axiz.entity;

public class Car {

	//フィールド名
	private String carName;
	private String bodyColor;
	private int maxSpeed;
	private int speed;
	
	//コンストラクタ
	//デフォルトコンストラクタ
	public Car () {
		
	}
	
	//引数ありコンストラクタ
	public Car (String carName, String bodyColor, int maxSpeed) {
		this.carName = carName;
		this.bodyColor = bodyColor;
		this.maxSpeed = maxSpeed;
		
	}
	
	//引数ありコンストラクタ
	public Car (String carName, String bodyColor, int maxSpeed, int speed) {
		this.carName = carName;
		this.bodyColor = bodyColor;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
	
	//フィールドそれぞれのゲッター、セッター

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed < 0) {
			System.out.println("この値(" + maxSpeed + ")をセットすることはできません");
		}
		this.maxSpeed = maxSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			System.out.println("この値(" + speed + ")をセットすることはできません");
		}else if (speed > this.maxSpeed) {
			this.maxSpeed = speed;
		}
		this.speed = speed;
	}
	
	
		
}

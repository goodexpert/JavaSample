enum Color {
	RED(0xff0000),
	GREEN(0x00ff00),
	BLUE(0x0000ff);

	private int value;

	private Color(int value) {
		this.value = value;
	}

	public int value() {
		return this.value;
	}
};

abstract class Shape {
	// 클래스(정적) 멤버 상수
	public static final int RED = 0;
	public static final int GREEN = 1;
	public static final int BLUE = 2;

	private int borderColor;
    private int borderWidth;
    private Color fillColor;

    public Shape() {
    	this.fillColor = Color.RED;

    	int value = Color.RED.value();
    }
    public void draw() {
        System.out.println("Draw shape");
    }

    public abstract void move(int x, int y);

    public abstract void rotate(int radian);

    public final int getFillColor() {
        return fillColor;
    }

    public final void setFillColor(int color) {
        this.fillColor = color;
    }

    public final int getBorderColor() {
        return borderColor;
    }

    public final void setBorderColor(int color) {
        this.borderColor = color;
    }

    // getter of borderWidth
    public final int getBorderWidth() {
        return borderWidth;
    }

    // setter of borderWidth
    public final void setBorderWidth(int width) {
        this.borderWidth = width;
    }
}


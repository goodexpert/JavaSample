class HelloWorld {
	// Instance method
	public void print() {
		System.out.println("Hello world!");
	}

	// Class method
	public static void printOut() {
		// this.print();
		System.out.println("Hello world!");
	}

	// Entry point
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.print();

		HelloWorld.printOut();
		helloWorld.printOut();
	}
}

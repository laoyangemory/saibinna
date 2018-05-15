public class TestDuck {

	public static void main(String[] args) {
		
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performEat();
		
		System.out.println("===================");
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performEat();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyWithRocket());
		modelDuck.performFly();
		
	}
}

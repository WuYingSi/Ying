package day_14.Concept.P4;

class Fu2 {
    final public void show1() {
        System.out.println("Fu2 show1");
    }
    public void show2() {
        System.out.println("Fu2 show2");
    }
}

class Zi2 extends Fu2 {
    //	@Override
//	public void show1() {
//		System.out.println("Zi2 show1");
//	}
    @Override
    public void show2() {
        System.out.println("Zi2 show2");
    }
}

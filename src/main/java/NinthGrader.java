public class NinthGrader extends Student {
    public NinthGrader(String a, String b, int c) {
        super(a, b, 2024);
    }
    
    public NinthGrader() {
        super();
    }

    @Override
    public void doSomething() {
        System.out.println(this.getFirstName() + " has no homework.");
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + ", " + this.getClassYear() + "(Ninth Grader).";
    }
}
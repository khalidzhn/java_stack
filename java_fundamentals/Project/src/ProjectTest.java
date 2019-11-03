public class ProjectTest {
    public static void main(String[] args) {
        Project test = new Project();
        Project test2 = new Project("project2 Name","project2 Description");
        test.setName("project Name");
        test.setDescription("project Description");
        System.out.println(test.elevatorPitch());
        System.out.println(test2.elevatorPitch());
    }
}

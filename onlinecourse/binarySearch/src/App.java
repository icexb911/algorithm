public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        testTempalte();
    }

    private static void testTempalte() {
        int[] nums = { 2, 4, 18, 20, 44, 149, 200, 210};
        int target = 44;
        Template template = new Template();
        int index = template.binarySearch(nums, target);
        System.out.println(index);
    }
}

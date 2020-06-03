public class TestClass {

    @AfterSuite
    public static void afterSuite() {
        System.out.println("After suite");
    }

    @Test(priority = 1)
    public static void method1() {
        System.out.println("Method 1");
    }

    @Test(priority = 8)
    public static void method2() {
        System.out.println("Method 2");
    }

    @Test(priority = 5)
    public static void method3() {
        System.out.println("Method 3");
    }

    @Test(priority = 5)
    public static void method4() {
        System.out.println("Method 4");
    }

    @BeforeSuite
    public static void beforeSuite() {
        System.out.println("Before suite");
    }

//    @AfterSuite
//    public static void AlterSuite1() {
//        System.out.println("Alter suite");
//    }
}

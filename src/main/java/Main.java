import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        start(TestClass.class);
    }

    private static void start(Class testClass) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = testClass.getDeclaredMethods();
        List<Method> methodList = new ArrayList<Method>();
        for (Method o : methods) {
            if (o.isAnnotationPresent(Test.class))
                methodList.add(o);
        }
        methodList.sort(new Comparator<Method>() {
            public int compare(Method t0, Method t1) {
                return t1.getAnnotation(Test.class).priority() - t0.getAnnotation(Test.class).priority();
            }
        });
        for (Method o : methods) {
            if (o.isAnnotationPresent(BeforeSuite.class)) {
                if (methodList.get(0).isAnnotationPresent(BeforeSuite.class))
                    throw new RuntimeException("only one '@BeforeSuite'");
                methodList.add(0, o);
            }
            if (o.isAnnotationPresent(AfterSuite.class)) {
                if (methodList.get(methodList.size() - 1).isAnnotationPresent(AfterSuite.class))
                    throw new RuntimeException("Only one '@AfterSuite'");
                methodList.add(methodList.size(), o);
            }
        }
        for (Method o : methodList)
            o.invoke(null);
    }
}

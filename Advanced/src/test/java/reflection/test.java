package reflection;

import com.advanced.reflection.Product;

import java.lang.reflect.Field;

public class test {
    static void main() throws NoSuchFieldException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class clazz=Class.forName("com.advanced.reflection.Product");
        Product product=(Product) clazz.newInstance();
        Field id=clazz.getDeclaredField("id");
        id.setAccessible(true);
        id.set(product,1000);
        System.out.println(id.getLong(product));
        Field name=clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(product,"王五");
        System.out.println(name.get(product));

    }
}

package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ChildClass extends ParentClass {
    public void test()  {
//        throws IOException {
//'test()' in 'exceptions.ChildClass' clashes with 'test()' in 'exceptions.ParentClass';
// overridden method does not throw 'java.io.IOException'
       // throw new IOException();
    }
}

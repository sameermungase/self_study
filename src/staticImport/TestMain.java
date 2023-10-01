package staticImport;

import staticImport.innerPackage.UtilityClass;

import static staticImport.innerPackage.UtilityClass.doingSomething;

public class TestMain {

    public static void main(String[] args) {

        doingSomething();
        UtilityClass.doingSomething();
    }
}

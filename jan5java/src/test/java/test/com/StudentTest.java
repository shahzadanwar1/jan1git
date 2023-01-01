/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import com.mycompany.edu.jan5java.Student;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author mshan
 */
public class StudentTest {
    
    Student stu;
    
    public StudentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        stu = new Student();
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
        @Test
        public void testName(){
        
            stu.setName("shah");
            assertEquals("shah", stu.getName());
    
    }

}
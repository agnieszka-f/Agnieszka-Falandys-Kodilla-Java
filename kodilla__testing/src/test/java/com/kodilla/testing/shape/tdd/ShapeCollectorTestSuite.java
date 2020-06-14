package com.kodilla.testing.shape.tdd;

import com.kodilla.testing.shape.*;
import org.junit.Assert;
import org.junit.*;

import java.lang.annotation.Target;

import static java.lang.Math.PI;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddShape(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square1 = new Square();
        Triangle triangle1 = new Triangle();
        Circle circle1 = new Circle();

        boolean add1 = shapeCollector.addShape(square1);
        boolean add2 = shapeCollector.addShape(triangle1);
        boolean add3 = shapeCollector.addShape(circle1);

        Assert.assertTrue(add1);
        Assert.assertTrue(add2);
        Assert.assertTrue(add3);

        shapeCollector.showShapes();
    }
    @Test
    public void testRemoveShape(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square1 = new Square();
        Triangle triangle1 = new Triangle();
        Circle circle1 = new Circle();

        boolean add1 = shapeCollector.addShape(square1);
        boolean add2 = shapeCollector.addShape(triangle1);
        boolean add3 = shapeCollector.addShape(circle1);

        boolean remove1 = shapeCollector.removeShape(circle1);
        Assert.assertTrue(remove1);

        shapeCollector.showShapes();
    }
    @Test
    public void testGetShape(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square1 = new Square();
        Triangle triangle1 = new Triangle();
        Circle circle1 = new Circle();

        boolean add1 = shapeCollector.addShape(square1);
        boolean add2 = shapeCollector.addShape(triangle1);
        boolean add3 = shapeCollector.addShape(circle1);

        Shape temp1 = shapeCollector.getShape(0);

        Assert.assertNotEquals(null, temp1);
    }
    @Test
    public void testGetShapeNotExisting(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square1 = new Square();
        Triangle triangle1 = new Triangle();
        Circle circle1 = new Circle();

        boolean add1 = shapeCollector.addShape(square1);
        boolean add2 = shapeCollector.addShape(triangle1);
        boolean add3 = shapeCollector.addShape(circle1);

        Shape temp1 = shapeCollector.getShape(8);

        Assert.assertEquals(null, temp1);
    }

}

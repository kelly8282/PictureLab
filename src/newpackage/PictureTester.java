package newpackage;
/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {

    /**
     * Method to test zeroBlue
     */
    public static void testZeroBlue()
    {
        Picture beach = new Picture("water.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    /**
     * Method to test mirrorVertical
     */
    public static void testMirrorVertical() 
    {
        Picture caterpillar = new Picture("beach.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    public static void testMirrorHorizontal() 
    {
        Picture caterpillar = new Picture("beach.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontal();
        caterpillar.explore();
    }

    /**
     * Method to test mirrorTemple
     */
    public static void testMirrorTemple() 
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /**
     * Method to test the collage method
     */
    public static void testCollage()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /**
     * Method to test edgeDetection
     */
    public static void testEdgeDetection() 
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }
    
    public static void testEdgeDetection2() 
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection2(10);
        swan.explore();
    }


    private static void testMirrorDiagonal() 
    {
        Picture pic = new Picture("beach.jpg");
        pic.mirrorDiagonal();
        pic.explore();
    }

    private static void testNegate() 
    {
        Picture swan = new Picture("beach.jpg");
        swan.negate();
        swan.explore();
    }

    private static void testGrayscale() 
    {
        Picture pic = new Picture("water.jpg");
        pic.grayscale();
        pic.explore();
    }

    private static void testMirrorArms() 
    {
        Picture pic = new Picture("snowman.jpg");
        pic.mirrorArms();
        pic.explore();   
    }

    
    /**
     * Main method for testing. Every class can have a main method in Java
     */
    public static void main(String[] args) {
    // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        //testZeroBlue();
//    testKeepOnlyBlue();
//    testKeepOnlyRed();
//    testKeepOnlyGreen();
//    testNegate();
//    testGrayscale();
//    testFixUnderwater();
//    testMirrorVertical();
//testMirrorHorizontal();
//testMirrorTemple();
//        testMirrorArms();
//    testMirrorGull();
//    testMirrorDiagonal();
//    testCollage();
//    testCopy();
 //   testEdgeDetection();
//    testEdgeDetection2();
//    testChromakey();
//    testEncodeAndDecode();
//    testGetCountRedOverValue(250);
//    testSetRedToHalfValueInTopHalf();
//    testClearBlueOverValue(200);
//    testGetAverageForColumn(0);
    }


}
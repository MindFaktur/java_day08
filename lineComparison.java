import java.util.Scanner;

public class lineComparison {
    public static void main(String[] args){
        ValuesAndMethods newObj = new ValuesAndMethods();
        newObj.x1 = newObj.getValue("x",1);
        newObj.y1 = newObj.getValue("y",1);
        newObj.x2 = newObj.getValue("x",2);
        newObj.y2 = newObj.getValue("y",2);
        newObj.x3 = newObj.getValue("x",3);
        newObj.y3 = newObj.getValue("y",3);
        newObj.x4 = newObj.getValue("x",4);
        newObj.y4 = newObj.getValue("y",4);

        float line1length = newObj.lineLength( newObj.x1, newObj.y1, newObj.x2, newObj.y2 );
        System.out.println(" line1 length is " + line1length);
        float line2length = newObj.lineLength( newObj.x3, newObj.y3, newObj.x4, newObj.y4 );
        System.out.println(" line2 length is " + line2length);

        newObj.equality(line1length,line2length);
    }
}
class ValuesAndMethods{
    float x1, x2, x3, x4, y1, y2, y3, y4;
    public float getValue( String axis, int number) {
        System.out.println(" Enter " + axis + number + " co-ordinate ");
        Scanner obj = new Scanner(System.in);
        return obj.nextFloat();
    }
    public void values (){


    }
    public float lineLength(float x1, float y1, float x2, float y2){
        return (float) Math.sqrt( (Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
    }
    public void equality(float line1, float line2){
        if ( line1 == line2 ){
            System.out.println("Both lines are equal");
        }else if (line1 > line2){
            System.out.println("Line1 is greater than line2");
        }else{
            System.out.println("Line1 is lesser than line2");
        }
    }
}


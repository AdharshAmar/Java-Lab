import java.util.*;
public class exp13 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter the height and width of the image : ");
    int h=sc.nextInt();
   int w=sc.nextInt();
    Image image = new Image(h,w);
    int r;
        do{
        System.out.print("Enter the percentage to resize(-1 to exit ) :");
        r=sc.nextInt();
       if(r>0 && r<=100){
        image.resize(r);
        image.display();
        }
    }while(r!=-1);
}
}
interface Resizable {
    void resize(int percentage);
}

class Image implements Resizable {
    private int width;
    private int height;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public void resize(int percentage) {
        double scaleFactor = 1 + percentage / 100.0;
        width *= scaleFactor;
        height *= scaleFactor;
    }
  public void display(){

        System.out.println("Image resized to width: " + width + ", height: " + height);
        }
}

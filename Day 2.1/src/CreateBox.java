In Edd Format Yiew Help
public static void main(String[] args)
{
//create scanner's instance to wrap std i/p
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Box dimensions: w dh");
/int data=100;
    Box box1;//box1: ref type of var(class type of ref), no obj created so far, method local var:
/mem allocated on the stack: how many bytes: as per JVM spec.
// System.out.println(box1); javac err
    box1=new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());//Box class gets loaded in meth
    area //it's instance is created in the heap.
//print box dims
    System.out.println(box1.getBoxDimensions());
//print box volume
    System.out.println("Volume: "+box1.getBoxVolume());
    Box box2=new Box(4,5,6);
    I
    System.out.println(box2.getBoxDimensions());
    Box box3=box1;//copy of refs
    System.out.println(box2.get)BoxDimensions());
//close scanner
    sc.close();
1)package rash3;

public class logicaloperator {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        if(a&&b) {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");


        }
    }
}

OUTPUT:
no

2)package rash3;

public class logicaloperator {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=true;
        if(a&&b) {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");


        }
    }
}
Output:yes
3)package rash3;
public class logicaloperator {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=true;
        boolean c=true; 
        if(a && b && c) {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");


        }
    }
}
Output:
yes
4)package rash3;
public class logicaloperator {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean c=true; 
        if(a && b && c) {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");


        }
    }
}
Output:
no

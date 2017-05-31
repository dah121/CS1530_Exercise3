package haskell;

public class Exercise3
{
    public static int lazy(int num)
    {
        return ((num*num)+num+2)/2;
    }

    public static int triangle(int num)
    {
        return ((num*(num+1))/2);
    }

    public static void main(String[] args)
    {
        if(args.length != 2)
        {
            //wrong number of args entered, error
            System.out.println("You must enter either 'lazy' or 'triangle' followed by an integer.");
            System.exit(1);
        }
        else
        {
            try
            {
                if(args[0].equals("triangle") || args[0].equals("lazy"))
                {
                    //check that the number entered is a 32 bit int. if it isn't the exception with throw
                    int x = Integer.parseInt(args[1]);
                    //do the things
                    if(args[0].equals("lazy") || args[0].equals("Lazy"))
                    {
                        x = lazy(x);
                        System.out.println("Lazy(n) = " + x);
                    }
                    //add triangle here
                    if(args[0].equals("triangle") || args[0].equals("Triangle"))
                    {
                        x = triangle(x);
                        System.out.println("Tri(n) = " + x);
                    }
                }
                else
                {
                    System.out.println("You must enter either 'lazy' or 'triangle' followed by an integer.");
                }
            }
            catch(NumberFormatException ex)
            {
                System.out.println("Enter an integer buddy");
                System.exit(2);
            }
        }
    }
}

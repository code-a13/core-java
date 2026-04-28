package Exception_Handling;

public class Task1 {
    public static void main(String[] args) {
        String[] str = {"apple", null, "123"};
        try{
            System.out.println("Array Index Exception :"+str[5]);
            System.out.println("Null Pointer Exception :"+str[1].length());
            System.out.println("Number Format Exception :"+Integer.parseInt(str[2]));
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }
        finally {
            System.out.println("Task 1 completed successfully");
        }
    }
}

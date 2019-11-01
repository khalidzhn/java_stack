public class Basics {
    public void Print_1to255(){
        System.out.println("Print_1to255: ");
        for(int i =0 ; i<=255;i++){
            System.out.print(", "+i);
        }

    }
    public void PrintOdd_1to255() {
        System.out.println();
        System.out.println("PrintOdd_1to255: ");
        for (int i = 1; i <= 255; i += 2) {
            System.out.print(", "+i);        }
    }
    public void PrintSum_1to255() {
        int sum=0;
        System.out.println();
        for (int i = 1; i <= 255; i += 2) {
            sum+=i;
            System.out.print("New Number is: "+i+"Sum: "+sum+"###");
        }
    }
}

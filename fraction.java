/* here i've solved a problem on fraction of two number(2/12,1/6...) using oops concepts*/
// ******************this is the firs file***********************************
public class fraction {

    int numeartor;
    int denominator;
    public fraction(int numeartor,int denominator){
        this.numeartor = numeartor;
        this.denominator = denominator;
        simplify();

    }

public void print(){
        if(denominator==0){
            return;
        }
    System.out.println(numeartor + "/" + denominator);
}
// but we want that our print value come in simplified form



    void simplify(){
        int gcd = 1;
        int smallest = Math.min(numeartor,denominator);
        for(int i = 1;i<=smallest;i++){
            if(numeartor%i==0&&denominator%i==0){
                gcd = i;
            }
        }
        numeartor = numeartor/gcd;
        denominator = denominator/gcd;
    }

    public void add(fraction f2) {
        this.numeartor= this.numeartor * f2.denominator+this.denominator*f2.numeartor;

        this.denominator = this.denominator* f2.denominator;
        simplify();
    }
}





//*************************** this is another file **************************************


public class fractionUse {
    public static void main(String[]args){
        fraction f1 = new fraction(2,16);

//    f1.simplify();
        f1.print();

    // now how to add two fractions
//        typically there is no method to do that so we will do that with the help of a functions
        fraction f2 = new fraction(2,4);
    f1.add(f2);
    f1.print();


    }
}


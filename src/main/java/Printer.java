public class Printer {

    private int numberOfSheetsLeft;
    private int tonerVolume;

    public Printer(int numberOfSheetsLeft, int tonerVolume){
        this.numberOfSheetsLeft = numberOfSheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int[] print(int numOfSheets, int numOfCopies){
        int total = numOfSheets * numOfCopies;
        int numArray[] = new int[2];
        numArray[0] = this.numberOfSheetsLeft;
        numArray[1] = this.tonerVolume;
        if (this.numberOfSheetsLeft >= total){
            numArray[0] = this.numberOfSheetsLeft - total;
            numArray[1] = this.tonerVolume - total;
            return numArray;
        }
        return numArray;
    }

    public int newPrint(int numOfSheets, int numOfCopies){
        int total = numOfSheets * numOfCopies;
        if (this.numberOfSheetsLeft >= total){
            this.tonerVolume = this.tonerVolume - total;
            return this.numberOfSheetsLeft - total;
        }
        return this.numberOfSheetsLeft;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }





}

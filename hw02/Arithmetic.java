//hw02-Arithmetic
//9/8/14
//Noah Reifsnyder
//CSE2
//This program should add up prices of items, including 6% PA Sales taxp
//Main Class
public class Arithmetic {
    //Main Method
    public static void main(String[] args){
        //set variables
        int nSocks=3; //number of socks bought
        //cost per sock
        double sockCost$=2.58;
        
        //Number of glasses bought
        int nGlasses=6;
        //cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes bought
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        //tax value
        double taxPercent=0.06; //6% PA sales tax
        double totalSockCost$; //total cost of socks
        double totalGlassCost$; //total cost of glasses
        double totalEnvelopeCost$; //total cost of envelopes
        double totalCost$; //total cost no tax
        double taxSocks$; //tax on socks
        double taxGlass$; //tax on Glasses
        double taxEnvelopes$; //tax on Envelopes
        double totalTax$; //total tax
        double totalPaid$; //total amount paid 
        
        //total cost calculations
        totalSockCost$=nSocks*sockCost$;
        totalGlassCost$=nGlasses*glassCost$;
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        
        //begin sales tax calculations
        taxSocks$=totalSockCost$*taxPercent;
        taxEnvelopes$=totalEnvelopeCost$*taxPercent;
        taxGlass$=totalGlassCost$*taxPercent;
        //multiple tax values by 100 so I can convert to int without losing important information,then cast to int and divide by 100 to return to real cost value
        taxSocks$=taxSocks$*100;
        taxGlass$=taxGlass$*100;
        taxEnvelopes$=taxEnvelopes$*100;
        taxSocks$=(int)taxSocks$;
        taxGlass$=(int)taxGlass$;
        taxEnvelopes$=(int)taxEnvelopes$;
        taxSocks$=taxSocks$/100.0;
        taxGlass$=taxGlass$/100.0;
        taxEnvelopes$=taxEnvelopes$/100.0;
        //add up total costs
        totalCost$=totalSockCost$+totalEnvelopeCost$+totalGlassCost$;
        totalTax$=taxEnvelopes$+taxGlass$+taxSocks$;
        totalPaid$=totalCost$+totalTax$;
        
        //printing out the values
        System.out.println("You are buying "+ nSocks +" pairs of socks at $"+ sockCost$ +" each for a total of $"+ totalSockCost$);
        System.out.println("The sales tax on your sock purchase is $"+ taxSocks$);
        System.out.println("You are buying "+ nGlasses +" drinking glasses at $"+ glassCost$ +" each for a total of $"+ totalGlassCost$);
        System.out.println("The sales tax on your drinking glass purchase is $"+ taxGlass$);
        System.out.println("You are buying "+ nEnvelopes +" boxes of envelopes at $"+ envelopeCost$ +" each for a total of $"+ totalEnvelopeCost$);
        System.out.println("The sales tax on your envelope purchase is $"+ taxEnvelopes$);
        System.out.println("The amount paid before tax for this purchase is $"+ totalCost$ +" and the 6% sales tax is $"+ totalTax$);
        System.out.println("The total amount paid for this purchase include 6% PA sales tax is $"+ totalPaid$);
        
    }//end of main method
}//end of class
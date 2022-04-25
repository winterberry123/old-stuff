public class Investment {
    private double monthlyInterestRate; 
    private int numberOfYears; 
    private double investmentAmount; 
    private java.util.Date investmentDate; 
    
    /** Default constructor */ 
    public Investment() { 
        this(2.5, 1, 1000); 
    } 
    
    /** Construct an investment with specified monthly interest rate,
     * number of years, and investment amount
     */
    public Investment(double monthlyInterestRate, int numberOfYears, 
    double investmentAmount) { 
        this.monthlyInterestRate = monthlyInterestRate; 
        this.numberOfYears = numberOfYears; 
        this.investmentAmount = investmentAmount; 
        investmentDate = new java.util.Date(); 
    } 
    
    /** Return monthlyInterestRate */ 
    public double getMonthlyInterestRate() { 
        return monthlyInterestRate; 
    } 
    
    /** Set a new monthlyInterestRate */ 
    public void setMonthlyInterestRate(double monthlyInterestRate) { 
        this.monthlyInterestRate = monthlyInterestRate; 
    } 
    
    /** Return numberOfYears */ 
    public int getNumberOfYears() { 
        return numberOfYears; 
    } 
    
    /** Set a new numberOfYears */ 
    public void setNumberOfYears(int numberOfYears) { 
        this.numberOfYears = numberOfYears; 
    } 
    
    /** Return investmentAmount */ 
    public double getInvestmentAmount() { 
        return investmentAmount; 
    } 
    
    /** Set a new investmentAmount */ 
    public void setInvestmentAmount(double investmentAmount) { 
        this.investmentAmount = investmentAmount; 
    } 
    
    /** Get future value */ 
    public double getFutureValue() {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears*12);
    } 
    
    
    /** Return investment date */ 
    public java.util.Date getInvestmentDate() { 
        return investmentDate; 
    } 
}

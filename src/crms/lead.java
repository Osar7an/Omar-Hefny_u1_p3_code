/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crms;

/**
 *
 * @author Wasim
 */
public class lead {
    private String ClientName;
    private String EnteredDate;
    private int PhoneNumber;
    private String LeadStatus;
   
    
    
    public lead(String ClientName, String EnteredDate, int PhoneNumber, String LeadStatus)
    {
        this.ClientName = ClientName;
        this.EnteredDate = EnteredDate;
        this.PhoneNumber = PhoneNumber;
        this.LeadStatus = LeadStatus;
        
    }
    
    public String getClientName() {
        return ClientName;
    }

    
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    
    public String getEnteredDate() {
        return EnteredDate;
    }

    
    public void setEnteredDate(String EnteredDate) {
        this.EnteredDate = EnteredDate;
    }
    
    
    public int getPhoneNumber() {
        return PhoneNumber;
    }
    
    
    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    
    
     public String getLeadStatus() {
        return LeadStatus;
    }

    
    public void setLeadStatus(String LeadStatus) {
        this.LeadStatus = LeadStatus;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crms;

import java.util.ArrayList;

/**
 *
 * @author Wasim
 */
public class LeadList {
    
    ArrayList<lead> LeadList = new ArrayList();
    
    void addLead(lead toAdd)
    {
        LeadList.add(toAdd);
    }
    
    void addLead(String ClientName, String EnteredDate, int PhoneNumber, String LeadStatus)
    {
        lead leadToAdd = new lead(ClientName, EnteredDate, PhoneNumber, LeadStatus);
        LeadList.add(leadToAdd);
    }
    
    void deletelead( String ClientName  )
    {
        for(lead c: this.LeadList)
        {
            if(c.getClientName() == ClientName)
            {
                this.LeadList.remove(c);
                return;
            }
        }
    }
}

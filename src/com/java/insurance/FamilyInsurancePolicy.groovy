package com.java.insurance
public class FamilyInsurancePolicy extends InsurancePolicies
{
    public FamilyInsurancePolicy(String clientName,String policyId,int age,long mobileNumber,String emailId)
    {
        this.clientName=clientName
        this.policyId=policyId
        this.age=age
        this.mobileNumber=mobileNumber
        this.emailId=emailId
    }
    public boolean validatePolicyId()
    {
        String pid = policyId
        boolean val = false
        char[] charpid = pid.toCharArray()
        if(charpid.length!=9)
            val = false
        else if(charpid[0] == 'F'&&charpid[1]=='A'&&charpid[2]=='M'&&charpid[3]=='I'&&charpid[4]=='L'&&charpid[5]=='Y'&&charpid[6]>=48&&charpid[7]>=48&&charpid[8]>=48&&charpid[6]<=57&&charpid[7]<=57&&charpid[8]<=57)
            val = true
        return val
    }
    public double calculateInsuranceAmount(int months, int no_of_members)
    {
        int k=1
        if(age>=5&&age<=25)
            k=2500
        else if(age>=26&&age<=59)
            k=5000
        else if(age>=60)
            k=10000
        int ans=k*months*no_of_members
        return ans
    }
}


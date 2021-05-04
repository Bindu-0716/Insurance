package com.java.insurance
public class SeniorCitizenPolicy extends InsurancePolicies
{
    public SeniorCitizenPolicy(String clientName,String policyId,int age,long mobileNumber,String emailId)
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
        else if(charpid[0]=='S'&&charpid[1]=='E'&&charpid[2]=='N'&&charpid[3]=='I'&&charpid[4]=='O'&&charpid[5]=='R'&&charpid[6]>=48&&charpid[7]>=48&&charpid[8]>=48&&charpid[6]<=57&&charpid[7]<=57&&charpid[8]<=57)
            val = true
        return val

    }
    public double calculateInsuranceAmount(int months, int no_of_members)
    {
        int k=10000

        int ans=k*months*no_of_members
        return ans
    }
}



package com.java.insurance
public class IndividualInsurancePolicy extends InsurancePolicies
{
    public IndividualInsurancePolicy(String clientName,String policyId,int age,long mobileNumber,String emailId)
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
        boolean val=false
        char[] charpid = pid.toCharArray()
        if(charpid.length!=9)
            val=false
        else if(charpid[0]=='S' && charpid[1]=='I'&&charpid[2]=='N'&& charpid[3]=='G' && charpid[4]=='L' && charpid[5]=='E')
            val=true
        return val
    }
    public double calculateInsuranceAmount(int months)
    {
        int k = 1
        if(age>=5&&age<=25)
            k=2500
        else if(age>=26&&age<=59)
            k=5000
        else if(age>=60)
            k=10000
        int ans=k*months
        return ans
    }
}




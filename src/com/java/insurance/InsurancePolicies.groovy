package com.java.insurance

 class InsurancePolicies
{
    InsurancePolicies()
    {
    }

    public InsurancePolicies(String clientName,String policyId,int age,long mobileNumber,String emailId)
    {
        this.clientName=clientName
        this.policyId=policyId
        this.age=age
        this.mobileNumber=mobileNumber
        this.emailId=emailId
    }
    protected String clientName

    protected String policyId

    protected int age

    protected long mobileNumber

    protected String emailId

    public String getClientName()
    {
        return clientName
    }
    public void setClientName(String name)
    {
        this.clientName=name
    }
    public String getpolicyId()
    {
        return policyId
    }
    public void setpolicyId(String policyId)
    {
        this.policyId=policyId
    }
    public int getage()
    {
        return age
    }
    public void setage(int age)
    {
        this.age=age
    }
    public long getmobileNumber()
    {
        return mobileNumber
    }
    public void setmobileNumber(long mobileNumber)
    {
        this.mobileNumber=mobileNumber
    }
    public String getemailId()
    {
        return emailId
    }
    public void setemailId(String emailId)
    {
        this.emailId=emailId
    }

}



package com.java.insurance
import java.util.Scanner

public class UserInterface
{

    public static void main (String[] args) throws java.lang.Exception
    {
        String clientName

        String policyId

        int age

        long mobileNumber

        String emailId
        boolean x=false,y=false,z=false
        Scanner sc = new Scanner(System.in)
        System.out.println("Enter Client name")
        clientName =sc.nextLine()
        System.out.println("Enter Policy Id")
        policyId=sc.nextLine()
        System.out.println("Enter Client age")
        age=sc.nextInt()
        System.out.println("Enter mobile number")
        mobileNumber=sc.nextLong()
        System.out.println("Enter Email ")
        emailId=sc.nextLine()

        InsurancePolicies i= new InsurancePolicies(clientName,policyId,age,mobileNumber,emailId)
        FamilyInsurancePolicy m=new FamilyInsurancePolicy(clientName,policyId,age,mobileNumber,emailId)
        IndividualInsurancePolicy n=new IndividualInsurancePolicy(clientName,policyId,age,mobileNumber,emailId)
        SeniorCitizenPolicy s= new SeniorCitizenPolicy(clientName,policyId,age,mobileNumber,emailId)
        x=n.validatePolicyId()
        y=m.validatePolicyId()
        z=s.validatePolicyId()
        if(x)
        {
            int month,ans
            System.out.println("Enter the months")
            month=sc.nextInt()
            ans=(int) n.calculateInsuranceAmount(month)
            System.out.println("Name :"+clientName)
            System.out.println("Email Id :"+emailId)
            System.out.println("Amount to be paid :"+ans)
        }
        else if(y)
        {
            int month,ans,mem
            System.out.println("Enter the months")
            month=sc.nextInt()
            System.out.println("Enter number of members")
            mem=sc.nextInt()
            ans=(int) m.calculateInsuranceAmount(month,mem)
            System.out.println("Name :"+clientName)
            System.out.println("Email Id :"+emailId)
            System.out.println("Amount to be paid :"+ans)
        }
        else if(z)
        {
            int month,ans,mem
            System.out.println("Enter the months")
            month=sc.nextInt()
            System.out.println("Enter number of members")
            mem=sc.nextInt()
            ans=(int) s.calculateInsuranceAmount(month,mem)
            System.out.println("Name :"+clientName)
            System.out.println("Email Id :"+emailId)
            System.out.println("Amount to be paid :"+ans)
        }
        else
        {
            System.out.println("Provide valid Policy Id")
        }
    }
}



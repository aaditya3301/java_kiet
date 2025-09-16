class emp {

    //Attributes
    String sName;
    int iAge;
    float fSalary;

    emp(){                          //when there a method with two same names it is called constructor overloading

    }

    emp(String sName, int iAge, float fSalary){             //this - is a current object 
        this.sName = sName;
        this.iAge = iAge;
        this.fSalary = fSalary;
    }

    //methods
    void calcIncomeTax(float fSalary) {
        System.out.println("Return income tax...");             // make a parameterized income tax function??
    }
    public static void main(String[] args) {
        emp e1 = new emp();
        emp e2 = new emp("Aaditya", 20, 50000000.00f);

        e1.sName = "Aayush";
        e1.iAge = 19;
        e1.fSalary = 90000000.00f;

        System.out.println("The E1 name is "+ e1.sName);
        System.out.println("The E1 age is "+ e1.iAge);
        System.out.println("The E2 salary is "+ e2.fSalary  );
    }

}

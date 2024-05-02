package Week2.Homeworks.Homework04_SalaryCalculator;

public class Employee {
    //Qualifications
    String name;
    double salary;
    int workHours;
    int hireYear;
    int thisYear = 2021;
    double tax ;
    double bonus;
    double salaryWithTaxAndBonus;
    double raise = 0;
    double totalSalary;

    //Constructor
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //Calculating the tax
    public double tax() {
        if (this.salary > 1000) {
            this.tax = this.salary * 0.03;
        }
        return this.tax;
    }

    //Calculating the bonus
    public double bonus() {
        if (this.workHours > 40) {
            this.bonus = (this.workHours - 40) * 30;
        }
        return this.bonus;
    }

    //Calculating the raise
    public double raiseSalary() {
        if (this.thisYear - this.hireYear < 10) {
            this.raise = this.salary * 0.05;
        } else if (this.thisYear - this.hireYear < 20) {
            this.raise = this.salary * 0.1;
        } else if (this.thisYear - this.hireYear >= 20) {
            this.raise = this.salary * 0.15;
        } else {
            System.out.println("Başlangıç Yılını Hatalı Girdiniz!");
        }
        return this.raise;
    }

    public double salaryWithTaxAndBonus(){
        return this.salaryWithTaxAndBonus = this.salary - tax() + bonus();
    }

    public double totalSalary() {
        return this.totalSalary = this.salaryWithTaxAndBonus + raiseSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Adı: " + name +
                ", Maaşı: " + salary +
                ", Çalışma Saati: " + workHours +
                ", Başlangıç Yılı: " + hireYear +
                ", Vergi: " + tax() +
                ", Bonus:" + bonus() +
                ", Maaş Artışı: " + raiseSalary() +
                ", Vergi ve Bonuslar ile Birlikte Maaş: " + salaryWithTaxAndBonus() +
                ", Toplam Maaş: " + totalSalary() +
                '}';
    }
}

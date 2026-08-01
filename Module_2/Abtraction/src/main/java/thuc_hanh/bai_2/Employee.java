package thuc_hanh.bai_2;

public class Employee implements Payable {
    double hoursWorked;

    double hourlyRate;

    public Employee(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePayment() {
        return this.hourlyRate * this.hoursWorked;
    }
}

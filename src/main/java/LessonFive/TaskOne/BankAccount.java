package LessonFive.TaskOne;

public class BankAccount {

    int id;
    double balance;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    void popolnenieScheta(double replenishment) {
        balance = balance + replenishment;
    }

    void snyatieSoScheta(double withdrawal) {
        balance = balance - withdrawal;
    }
}

class TaskOneLessonFive {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1, 150.5);
        System.out.println(bankAccount.balance);

        bankAccount.popolnenieScheta(49.5);
        System.out.println(bankAccount.balance);

        bankAccount.snyatieSoScheta(100);
        System.out.println(bankAccount.balance);
    }
}

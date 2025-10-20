import java.sql.SQLOutput;

public class Account {
    public String id;
    public String name;
    public int balance = 0;

    public Account(String id,String name, int balance ){

        this.name= name;
        this.balance= balance;
        this.id=id;

    }

  int amount;

    public int getAmount() {
        return amount;
    }

    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }
    public String getName(){
        return name;
}



    public int credit(int amount){
        this.balance += amount;
        return balance;
    }
    public  int debit(int amount){
        if (amount <= balance){
        this.balance -= amount;

        }
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }
    public int transfer(Account another, int amount ) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else
            System.out.println("Amount exceeded balance");
        return balance;
    }
    public String toString(){
        return "Account[id="+id + ",Name:"+name + ",Balance:"+balance+"]";
    }




}
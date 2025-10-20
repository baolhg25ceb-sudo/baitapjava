
public class TestAccount {
    public static void main(String[] args){
        Account a1= new Account("B004","Le Ha Gia Bao",200);
        System.out.println("Name:"+ a1.getName());
        System.out.println("Id:"+ a1.id);
        Account a2= new Account("B005","Anh Tin",100);
        System.out.println("Name:"+a2.name);

        a1.credit(100);
        System.out.println(a1);
        a1.debit(60);
        System.out.println(a1);




        a1.transfer(a2,50);
          System.out.println(a1);
          System.out.println(a2);


    }
}

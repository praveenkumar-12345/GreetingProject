import org.example.SavingsAcc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {
    @Test
    public void testWithdraw(){
        System.out.println("Testing Withdraw");
        double openbal=4000;
        double amttowithdraw=2000;
        SavingsAcc savingsAcc2=new SavingsAcc(openbal);
        Assertions.assertTrue(savingsAcc2!=null);
        savingsAcc2.getbalance();
        savingsAcc2.withdraw(amttowithdraw);
        double expectedbal=openbal-amttowithdraw;
        Assertions.assertEquals(expectedbal,savingsAcc2.getbalance());
        savingsAcc2.getbalance();
        //savingsAcc2.deposit(1000);
        //System.out.println("Tested withdraw");
    }
}

package bankaccount;

import org.junit.Test;
import junitparams.Parameters;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
@RunWith(JUnitParamsRunner.class)
public class BankAccountTest {

    @Parameters({"2","100","500"})
    @Test
    public void whenDepositingMoneyBalanceChanges(double amount){
        BankAccount account = new BankAccount();
        account.deposit(amount);
        assertEquals(amount,account.getBalance(),1e-10);
    }

    @Test
    public void addedZeroToBalance(){
        BankAccount ba = new BankAccount();
        ba.balance = 340;
        ba.deposit(0);
        assertEquals(340, ba.balance, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void depositingNegativeAmountReturnsFalse() {
        BankAccount ba = new BankAccount();
        ba.deposit(-100.50);
    }

    @Test
    public void depositingWhenAccountIsClosed() {
        BankAccount ba = new BankAccount();
        ba.deposit(245);
        assertTrue(ba.isOpen = false);
    }

    @Test
    public void withdrawAmount(double amount) {
        BankAccount ba = new BankAccount();
        ba.balance = 340;
        ba.withdraw(120.50);
        assertEquals(219.50, ba.balance, 0.00001);
    }

    @Test
    public void withdrawZeroAmount() {
        BankAccount ba = new BankAccount();
        ba.balance = 340;
        ba.withdraw(0);
        assertEquals(340, ba.balance, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdrawingNegativeAmountReturnsFalse() {
        BankAccount ba = new BankAccount();
        ba.balance = 340;
        ba.withdraw(-100.50);
    }

    @Test
    public void withdrawingWhenAccountIsClosed() {
        BankAccount ba = new BankAccount();
        ba.withdraw(245);
        assertTrue(ba.isOpen = false);
    }

    @Test (expected = IllegalArgumentException.class)
    public void withdrawingMoreThanOnBalance(){
        BankAccount ba = new BankAccount();
        ba.balance = 250;
        ba.withdraw(500);
    }

    @Test (expected = IllegalArgumentException.class)
    public void withdrawingFromEmptyAccount(){
        BankAccount ba = new BankAccount();
        ba.balance = 0;
        ba.withdraw(500);
    }

}
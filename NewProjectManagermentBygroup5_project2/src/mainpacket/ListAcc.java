/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpacket;

/**
 *
 * @author huytr
 */
import java.util.ArrayList;
import java.util.List;

public class ListAcc {
    private List<Account> accounts;

    public ListAcc() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public Account getAccount(String name) {
        for (Account account : accounts) {
            if (account.getName().equals(name)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }
    public boolean isUsernameExist(String username) {
        for (Account account : accounts) {
            if (account.getName().equals(username)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Account account : accounts) {
            sb.append(account.toString()).append("\n");
        }
        return sb.toString();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import domain.Currency;
import java.math.BigDecimal;
import java.time.LocalDate;


public class PlayerBuilder {

    private String name;
    private Integer accountNumber;
    private BigDecimal balance;
    private LocalDate birth;
    private Currency currency;

    public PlayerBuilder accountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public PlayerBuilder balance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    public PlayerBuilder birth(LocalDate birth) {
        this.birth = birth;
        return this;
    }

    public PlayerBuilder currency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public String getName() {
        return name;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public Currency getCurrency() {
        return currency;
    }

}

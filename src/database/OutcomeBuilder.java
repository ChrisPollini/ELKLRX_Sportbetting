/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import domain.Bet;
import domain.Outcome;
import domain.OutcomeOdd;
import java.util.ArrayList;
import java.util.List;


public class OutcomeBuilder {

    private String description;
    private Bet bet;
    private List<OutcomeOdd> outcomeOdds;

    public OutcomeBuilder() {
        this.outcomeOdds=new ArrayList<OutcomeOdd>();
    }

    public OutcomeBuilder description(String description) {
        this.description = description;
        return this;
    }

    public OutcomeBuilder bet(Bet bet) {
        this.bet = bet;
        return this;
    }

    public OutcomeBuilder outcomeOdds(List<OutcomeOdd> outcomeOdds) {
        this.outcomeOdds = outcomeOdds;
        return this;
    }
    
    public Outcome build() {
        return new Outcome(description,bet,outcomeOdds);
    }

}

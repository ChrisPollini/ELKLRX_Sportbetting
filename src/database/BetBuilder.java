/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import domain.Bet;
import domain.BetType;
import domain.Outcome;
import domain.SportEvent;
import java.util.ArrayList;
import java.util.List;

public class BetBuilder {

    private String description;
    private SportEvent event;
    private List<Outcome> winnerOutcomes;
    private BetType type;

    public BetBuilder() {
        this.winnerOutcomes=new ArrayList<Outcome>();
    }

    public BetBuilder description(String description) {
        this.description = description;
        return this;
    }

    public BetBuilder event(SportEvent sportEvent) {
        this.event = sportEvent;
        return this;
    }

    public BetBuilder winnerOutcomes(List<Outcome> outcome) {
        this.winnerOutcomes = outcome;
        return this;
    }

    public BetBuilder type(BetType type) {
        this.type = type;
        return this;
    }

    public Bet build() {
        return new Bet(description, event, winnerOutcomes, type);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import domain.Bet;
import domain.FootballSportEvent;
import domain.Result;
import domain.SportEvent;
import domain.TennisSportEvent;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SporteventBuilder {

    private String title;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private List<Bet> bets;
    private Result result;

    public SporteventBuilder() {
        this.bets=new ArrayList<Bet>();
    }

    public SporteventBuilder title(String title) {
        this.title = title;
        return this;
    }

    public SporteventBuilder startDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public SporteventBuilder endDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    public SporteventBuilder bets(List<Bet> bets) {
        this.bets = bets;
        return this;
    }

    public SporteventBuilder result(Result result) {
        this.result = result;
        return this;
    }

    public SportEvent build(int sportEventType) {
        if (sportEventType == 0) {
            return new TennisSportEvent(title, startDate, endDate, bets, result);
        } else {
            return new FootballSportEvent(title, startDate, endDate, bets, result);
        }
    }
}

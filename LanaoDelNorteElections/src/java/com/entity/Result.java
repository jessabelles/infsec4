/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author gokspoweroffour
 */
public class Result {
    private String city_or_municipality;
    private String position;
    private String name;
    private String nickname;
    private String party_affiliation;
    private int votes_obtained;

    /**
     * @return the city_or_municipality
     */
    public String getCity_or_municipality() {
        return city_or_municipality;
    }

    /**
     * @param city_or_municipality the city_or_municipality to set
     */
    public void setCity_or_municipality(String city_or_municipality) {
        this.city_or_municipality = city_or_municipality;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the party_affiliation
     */
    public String getParty_affiliation() {
        return party_affiliation;
    }

    /**
     * @param party_affiliation the party_affiliation to set
     */
    public void setParty_affiliation(String party_affiliation) {
        this.party_affiliation = party_affiliation;
    }

    /**
     * @return the votes_obtained
     */
    public int getVotes_obtained() {
        return votes_obtained;
    }

    /**
     * @param votes_obtained the votes_obtained to set
     */
    public void setVotes_obtained(int votes_obtained) {
        this.votes_obtained = votes_obtained;
    }
}

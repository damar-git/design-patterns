package com.damar.designpatterns.builder;

public class CharacterService {

    public Character createCharachter(String name,
                                      Character.Class _class,
                                      Character.Race race,
                                      Character.Alignment alignment) {
        return new CharacterBuilder()
                .withName(name)
                .withClass(_class)
                .withRace(race)
                .withAlignment(alignment)
                .build();
    }
}

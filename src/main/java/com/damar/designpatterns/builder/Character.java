package com.damar.designpatterns.builder;

import lombok.Data;

@Data
public class Character {

    private String name;

    private Class _class;

    private Alignment alignment;

    private Race race;

    public enum Class {
        WARRIOR,
        PALADIN,
        CLERIC,
        THIEF,
        WIZARD
    }

    public enum Alignment {
        GOOD,
        EVIL
    }

    public enum Race {
        HUMAN,
        ELF,
        DWARF,
        GNOME,
        GOBLIN
    }
}

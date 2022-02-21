package com.damar.designpatterns.builder;

import lombok.Data;

@Data
public class CharacterBuilder {

    private Character character;

    private String name;

    private Character.Class _class;

    private Character.Alignment alignment;

    private Character.Race race;

    public CharacterBuilder() {
        this.character = new Character();
    }

    public CharacterBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CharacterBuilder withRace(Character.Race race) {
        this.race = race;
        return this;
    }

    public CharacterBuilder withAlignment(Character.Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    public CharacterBuilder withClass(Character.Class _class) {
        this._class = _class;
        return this;
    }

    public Character build() {
        if (this.name == null)
            throw new RuntimeException("Character name is mandatory.");
        else
            this.character.setName(this.name);

        return this.character;
    }

}

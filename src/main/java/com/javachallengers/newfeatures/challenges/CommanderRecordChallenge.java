package com.javachallengers.newfeatures.challenges;

import java.io.Serializable;

public class CommanderRecordChallenge {

  record Commander<T>(T ship, String name, String planet) {
    public Commander {
      if (!(ship instanceof Serializable))
        throw new RuntimeException();
    }
    public String name() {
      return "Worf";
    }
    public boolean equals(Object obj) {
      return (obj instanceof Commander commander) && (commander.name.equals(this.name));
    }
  }

  public static void main(String[] args) {
    Commander<String> commander = new Commander<>("V-ger", "Spock", "Vulcan");

    record NewString(String ship) implements Serializable { }

    System.out.println(commander.name());
    System.out.println(commander.equals(new Commander<>(new NewString("V-ger"), "Spock", "Kronos")));
  }
}

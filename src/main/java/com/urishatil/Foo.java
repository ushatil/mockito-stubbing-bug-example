package com.urishatil;

import java.util.Optional;

public class Foo {
  private int id;
  private Optional<Long> barId;

  public Foo(int id, Optional<Long> barId) {
    this.id = id;
    this.barId = barId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Optional<Long> getBarId() {
    return barId;
  }

  public void setBarId(Optional<Long> barId) {
    this.barId = barId;
  }
}

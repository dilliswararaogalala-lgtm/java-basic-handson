// Money.java
package com.tw.step.domain;

public class Money {
  public int value;

  public Money(int value){
    this.value = value;
  }

  public Money add(Money money){
    int value = this.value + money.value;
    return new Money(value);
  }

  public Money minus(Money money){
    int value = this.value - money.value;
    return new Money(value);
  }
}
package com.javarush.test.level14.lesson06.home01;

public class BelarusianHen extends Hen
{

    final private int EGGS_COUNT = 200;

    @Override
    public int getCountOfEggsPerMonth()
    {
        return EGGS_COUNT;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + String.format( " Моя страна - %s. Я несу %d яиц в месяц.",
                Country.BELARUS, getCountOfEggsPerMonth() );
    }
}

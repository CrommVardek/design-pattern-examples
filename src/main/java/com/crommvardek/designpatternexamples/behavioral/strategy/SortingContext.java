package com.crommvardek.designpatternexamples.behavioral.strategy;

public class SortingContext {

    private SortingStrategy strategy;

    public SortingContext(SortingStrategy strategy){
        this.strategy = strategy;
    }

    public int[] sortArray(int[] array){

        strategy.sort(array);

        return array;

    }

}

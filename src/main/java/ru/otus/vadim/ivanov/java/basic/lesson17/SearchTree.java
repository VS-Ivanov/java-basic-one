package ru.otus.vadim.ivanov.java.basic.lesson17;

import java.util.List;

public interface SearchTree {
/**
 @param element to find
 @return element if exists, otherwise - null
 */
 Integer find(Integer element);
 List getSortedList();
}

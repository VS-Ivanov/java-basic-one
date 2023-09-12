package ru.otus.vadim.ivanov.java.basic.lesson18;

import java.io.File;
import java.io.FileFilter;

//фильтр для текстовых файлов
public class TxtFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return !pathname.isDirectory() && pathname.getName().endsWith(".txt");
    }
}

package com.alphasense.cloudconfiguration.util.file;

public interface FileReader<T> {
    T readFile(String filePath);
}

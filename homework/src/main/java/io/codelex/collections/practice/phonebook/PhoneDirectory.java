package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String, String> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    public String getNumber(String name) {
        for (String key : data.keySet()) {
            if (key.equals(name)) {
                return data.get(key);
            }
        }
        return null;
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        data.put(name,number);
    }

    @Override
    public String toString() {
        return "PhoneDirNew{" +
                "newdata=" + data + ". Size of phonebook:" + data.size() +
                '}';
    }


}

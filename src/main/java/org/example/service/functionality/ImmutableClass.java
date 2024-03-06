package org.example.service.functionality;

public final class ImmutableClass {

    private final String name;
    private final int age;
    private final Address address;

    public ImmutableClass(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

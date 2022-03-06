package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFacialFeaturesConstructor() {
        //given
        Person Aaa = new Person();
        String expectedName = "Aaa";
        String expectedHairColor = "Brown";
        String expectedEyeColor = "Blue";
        //when
        Aaa.setHairColor(expectedHairColor);
        Aaa.setEyeColor(expectedEyeColor);
        Aaa.setName(expectedName);
        //then
        String actualName = Aaa.getName();
        String actualHairColor = Aaa.getHairColor();
        String actualEyeColor = Aaa.getEyeColor();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
    }

    @Test
    public void testFacialFeaturesSetterHair() {
        //given
        Person Aaa = new Person();
        String expectedHairColor = "Brown";
        //when
        Aaa.setHairColor(expectedHairColor);
        //then
        String actualHairColor = Aaa.getHairColor();
        Assert.assertEquals(expectedHairColor, actualHairColor);
    }

    @Test
    public void testFacialFeaturesSetterEye() {
        //given
        Person Aaa = new Person();
        String expectedEyeColor = "Blue";
        //when
        Aaa.setEyeColor(expectedEyeColor);
        //then
        String actualEyeColor = Aaa.getEyeColor();
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
    }

    @Test
    public void testBloodTypeConstructor() {
        //given
        Person Aaa = new Person();
        String expectedName = "Aaa";
        int expectedAge = 16;
        String expectedBloodType = "A Positive";
        //when
        Aaa.setAge(expectedAge);
        Aaa.setBloodType(expectedBloodType);
        Aaa.setName(expectedName);

        //then
        String actualName = Aaa.getName();
        int actualAge = Aaa.getAge();
        String actualBloodType = Aaa.getBloodType();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedBloodType, actualBloodType);
    }

    @Test
    public void testBloodTypeSetter() {
        //given
        Person Aaa = new Person();
        String expectedBloodType = "A Positive";
        //when
        Aaa.setBloodType(expectedBloodType);
        //then
        String actualBloodType = Aaa.getBloodType();
        Assert.assertEquals(expectedBloodType, actualBloodType);
    }

    @Test
    public void testHeightWeightConstructor() {
        //given
        Person Aaa = new Person();
        String expectedName = "Aaa";
        int expectedAge = 16;
        int expectedHeight = 67;
        int expectedWeight = 187;
        //when
        Aaa.setAge(expectedAge);
        Aaa.setHeight(expectedHeight);
        Aaa.setWeight(expectedWeight);
        Aaa.setName(expectedName);

        //then
        String actualName = Aaa.getName();
        int actualAge = Aaa.getAge();
        int actualHeight = Aaa.getHeight();
        int actualWeight = Aaa.getWeight();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testHeightSetter() {
        //given
        Person Aaa = new Person();
        int expectedHeight = 67;
        //when
        Aaa.setHeight(expectedHeight);
        //then
        int actualHeight = Aaa.getHeight();
        Assert.assertEquals(expectedHeight, actualHeight);
    }

    @Test
    public void testWeightSetter() {
        //given
        Person Aaa = new Person();
        int expectedWeight = 187;
        //when
        Aaa.setWeight(expectedWeight);
        //then
        int actualWeight = Aaa.getWeight();
        Assert.assertEquals(expectedWeight, actualWeight);
    }
}


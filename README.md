# SexIst
[![Build Status](https://travis-ci.org/aistomin/sexist.svg?branch=master)](https://travis-ci.org/aistomin/sexist)
[![Hits-of-Code](https://hitsofcode.com/github/aistomin/sexist)](https://hitsofcode.com/view/github/aistomin/sexist)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.aistomin/sexist/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.aistomin/sexist)

_"Sexism is bad. The name of the library is derived from the word "Sex" and my surname :)" - Andrej Istomin._
   
## Description

Java library for gender detection by person's first name. Inspired by https://github.com/ferhatelmas/sexmachine/ library for Python. Based on the data from the program "gender" by Jorg Michael (described [here](https://autohotkey.com/board/topic/20260-gender-verification-by-forename-cmd-line-tool-db/))

## Add Maven Dependency
Add the following configuration to your project's `pom.xml`:
```
<dependencies>
    <!-- other dependencies are there -->
    <dependency>
        <groupId>com.github.aistomin</groupId>
        <artifactId>sexist</artifactId>
        <version>0.1.1</version>
    </dependency>
    <!-- other dependencies are there -->
</dependencies>
```
## Quick start
Once you've added the Maven dependency you can start detecting the gender by
 the person's name. You may start with the default implementation of the 
 `com.github.aistomin.sexist.NamesDictionary`, which is 
 `com.github.aistomin.sexist.DefaultDictionary`. See the code examle:
```
NamesDictionary dictionary = new DefaultDictionary();
System.out.println("Andrej: " + dictionary.gender("Andrej"));
System.out.println("Emily: " + dictionary.gender("Emily"));
``` 
The output of the code above will be:
```
Andrej: MALE
Emily: FEMALE
```
## Questions?
If you have any questions about the framework, or something doesn't work as
 expected, please submit an issue [here](https://github.com/aistomin/sexist/issues/new/choose).

## How to contribute?
Fork the repository, make changes, submit a pull request. Your changes will be
 reviewed and applied to the master branch, if they look correct.

Please run Maven build before submitting a pull request:

```
$ mvn clean install package
```
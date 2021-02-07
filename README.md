# DeckOfCards
<!-- PROJECT LOGO -->
<br />
<p align="center">
    <img src="images/cards.png" alt="Logo" width="80" height="80">
<h3 align="center">Decf of Cards Problem Statement</h3>

 <!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li>[Installation](#installation) </li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#decisions">Decisions</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

## About The Project
This project tries to representen a deck of a poker-style playing cards (52 cards): 4 suits and with
faces of Ace, 2-10, Jack, Queen and King.

It has to provide two operations:

* shuffle(): returnos no value, but result in the cards in the deck being randomly permuted.

* dealOneCard(): this method returns one card of the deck.

## Getting Started
### Prerequisites
* JDK 8 (It has been also tested in JAVA 11)
* Maven 3

### Installation
```
$ mvn clean jacoco:prepare-agent test verify
```
This will generate the .jar file and run the coverage report
## Generate site files
```
$ mvn clean jacoco:prepare-agent site
```


## Reporting
On /doc/site/index.html we will be able to find the:
* Quality metrics
* Unit test coverage
* Javadoc documentation

## Decision
* Language: It have been implemented using:
<ul>
    <li><em>JAVA 8</em>: to use lambdas and streams. For 2 reason: it is the most used languages used at Appian, it is wide language and supported one
    and because it is my main programming language. I could have done it using C#, Python or NodeJS as well.</li>
    <li><em>Maven</em>: to manage the dependencies.</li>
    <li><em>Jacoco and surfire</em>: to get the test coverage.</li>
</ul>

## Next steps
* API: this functional operations might be exposed as a microservices.

* Load test: just for testing purpose, besides the unit tests another kind of test might be implemented using artillery, k6 or similar.

* CI / CD: this code might be included inside a continuos integration workflow. For example: build and update after a pull/merge request has been done.

## Contact
Jose Ant. Beltrán
bjabinn@hotmail.com - @bjabinn - +34 669 801 840

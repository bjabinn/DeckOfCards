# DeckOfCards
<!-- PROJECT LOGO -->
<br />
<p align="center">
    <img src="https://github.com/bjabinn/DeckOfCards/blob/main/images/cards.jpg" alt="Logo" width="180">
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
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#reporting">Reporing</a></li>
    <li><a href="#decisions">Decisions</a></li>
    <li><a href="#Next steps">Next steps</a></li>
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

## Decisions
Language: It have been implemented using:
<ul>
    <li><em>JAVA 8</em>: to use lambdas and streams. For 2 reason: it is the most used languages used at Appian, it is wide language and supported one.
    and because it is my main programming language. I could have done it using C#, Python or NodeJS as well. :wink:</li>
    <li><em>Maven</em>: to manage the dependencies.</li>
</ul>

## Next steps
This classes could be extended to new features and the application could be modified with this adittional ideas:
<ul>
    <li><em>API</em>: this functional operations might be exposed as a microservices.</li>
    <li><em>Load test</em>: just for testing purpose, besides the unit tests another kind of test might be implemented using artillery, k6 or similar.</li>
    <li><em>CI / CD</em>: this code might be included inside a continuos integration workflow. For example: build and update after a pull/merge request has been done.</li>
</ul>

## Contact
Jose Ant. Beltrán
bjabinn@hotmail.com - @bjabinn - +34 669 801 840

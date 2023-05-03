# FriendsBank

The goal is to avoid the costs of __Bank Transfers__ for small amounts between __Groups__ of __Friends__. After an __Initial Deposit__ into a __Main Account__ (a __Bank Account__ belonging to one of the friends), it is no longer necessary to move real money. The __Payments__ between friends become virtual, meaning that a ledger is maintained that updates the __Virtual Balance__ of each pair of friends after each payment that involves that pair. It is assumed that there is a basis of __Trust__ among the friends. However, it is strictly necessary to trust a special friend who is the __Trusty Depository__, to whom the main account belongs.

The main account of the Faithful Depository functions as a payment guarantee for everyone. This creates an informal "monetary authority."

An existing account of the Faithful Depository is used as the main account, so it was not created specifically to support this application. 
Thus, there are no extra account maintenance costs, and it may even happen that the costs to the Faithful Depository are reduced, depending on the policy of the bank.

In the best scenario, each friend makes only 1 initial deposit (a bank transfer) to the main account (shortly after joining the group) and another transfer from the main account (when leaving the group and recovering what remains of their money). Thus, there are 2(n-1) transfers in the case of n friends. However, each friend can make reinforcements to their account, thereby increasing their number of transfers to the main account.

In the aforementioned contract, the Trusty Depository commits to maintaining in the main account an amount equal to or greater than the sum of the reinforcements of all the friends (including their own reinforcements).

## Dependencies

This project requires:

- Java 17 
- Maven 3.8.1

## Run Locally

#### Clone the project

```bash
  git clone https://github.com/AndreR10/Java-Projects.git
```

#### Go to the project directory

```bash
  cd FriendsBank
```

#### Install dependencies

Using a package manager

__macOS__

```bash
  brew install maven
```

__OR__

[Maven](https://maven.apache.org/index.html)





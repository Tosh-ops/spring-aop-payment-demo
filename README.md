# Spring AOP Payment Demo

## What it does
A simple Spring Boot app that logs payments and refunds. When you make a payment or refund, the app automatically logs what happened without mixing that logging code into your payment logic.

## Why I built this
To learn how Spring AOP works. It lets you write code once (like logging) and apply it everywhere - without repeating yourself.

## What I used
- Java 11
- Spring Boot 2.7.15
- Spring AOP (AspectJ)
- Maven

## What you'll see in the code
- `@Before` - Runs before a payment
- `@AfterReturning` - Runs after a payment works  
- `@AfterThrowing` - Runs if a refund fails

## How to run it
```bash
git clone https://github.com/YOUR-USERNAME/spring-aop-payment-demo
cd spring-aop-payment-demo
mvn spring-boot:run

##SAMPLE OUTPUT

=== Making a payment ===
[BEFORE] Starting payment...
Processing payment of $100
[AFTER] Payment completed successfully!

=== Trying a refund ===
[BEFORE] Starting refund...
Processing refund...
[AFTER THROWING] Refund failed with: Refund failed!
Caught exception: Refund failed!
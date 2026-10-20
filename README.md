# Bank Queue Management System (Java)

A simple console-based banking queue application built in Java to demonstrate the **Queue** data structure and the **FIFO (First In, First Out)** principle.

## Features

1. **Add customer** — adds a customer to the back of the queue (enqueue).
2. **Serve next customer** — serves and removes the customer at the front (dequeue).
3. **Display waiting customers** — lists customers in service order.
4. **Count waiting customers** — shows how many customers are waiting.
5. **Exit** — closes the program.

The program handles an empty queue and rejects blank customer names.

## Requirements

- Java Development Kit (JDK) 8 or later
- A terminal or command prompt

## How to run

1. Clone or download this repository.
2. Open a terminal in the project folder.
3. Compile the program:

   ```bash
   javac Main.java
   ```

4. Run it:

   ```bash
   java Main
   ```

## Example

If Ama, Kofi, and Kwame join in that order, the queue is:

```text
Front -> Ama -> Kofi -> Kwame <- Back
```

When the teller serves the next customer, **Ama** is served first and removed from the queue.

## Queue operations used

- `offer(name)`: adds a customer to the back of the queue.
- `poll()`: removes and returns the customer at the front, or returns `null` if the queue is empty.
- `isEmpty()`: checks whether the queue contains any customers.
- `size()`: returns the number of waiting customers.

## Learning objective

This project shows how a queue can be used in a real-life banking situation to ensure customers are served in the order they arrive.

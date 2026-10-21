# Bank Queue Management System

A school project demonstrating the **Queue** data structure and the **FIFO (First In, First Out)** principle in a banking scenario.

## 🌐 Visual interface

This repository now includes a browser-based interface in [`index.html`](./index.html), with a dashboard, customer registration, ticket numbers, a live waiting line, and a **Serve next customer** button.

> **Important:** GitHub's code page shows source files; it does not automatically run a Java console program or display a website preview. To publish the visual interface, enable GitHub Pages as described below.

### Publish the interface with GitHub Pages

1. Open this repository on GitHub and select **Settings**.
2. In the sidebar, select **Pages**.
3. Under **Build and deployment**, choose **Deploy from a branch**.
4. Select branch **main** and folder **/(root)**, then click **Save**.
5. Wait a few minutes, then open the published link shown on the Pages settings screen. GitHub notes publishing can take up to 10 minutes.

Official guide: [Configure a GitHub Pages publishing source](https://docs.github.com/en/pages/getting-started-with-github-pages/configuring-a-publishing-source-for-your-github-pages-site).

## ☕ Java console application

The Java source is in [`Main.java`](./Main.java). It runs in a terminal and demonstrates a queue using Java's `Queue` interface and `LinkedList`.

### Features

1. **Add customer** — adds a customer to the back of the queue (enqueue).
2. **Serve next customer** — serves and removes the customer at the front (dequeue).
3. **Display waiting customers** — lists customers in service order.
4. **Count waiting customers** — shows how many customers are waiting.
5. **Exit** — closes the program.

### Run the Java program

Requirements: JDK 8 or later.

```bash
javac Main.java
java Main
```

## Queue concept

If Ama, Kofi, and Kwame join in that order, Ama is served first:

```text
Front -> Ama -> Kofi -> Kwame <- Back
```

The Java program uses `offer(name)` to enqueue customers, `poll()` to serve the next customer, `isEmpty()` to check the queue, and `size()` to count waiting customers.

## Learning objective

Show how a real-life bank can serve customers in the order they arrive by applying the FIFO queue data structure.

**Note:** The web interface is a front-end demo; its queue data stays in the browser session. The Java console program is a separate implementation.

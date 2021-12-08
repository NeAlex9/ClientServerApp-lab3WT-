package by.server.main;

import by.server.serverProcessor.Server;

public class Main {
    Server server = new Server(5555);
        server.start();
        try {
        server.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
        Thread.currentThread().interrupt();
    }
}

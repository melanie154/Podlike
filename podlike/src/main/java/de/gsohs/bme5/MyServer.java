package de.gsohs.bme5;
import io.javalin.Javalin;
import java.util.List;
import java.util.Map;



public class MyServer {
    public static void main(String[] args) {
        Javalin javalin = Javalin.create().start(8080);
        javalin.config.addStaticFiles("Media_Podlike");

        javalin.get("/", ctx -> {
            ctx.render("podlike_Hauptseite.html", Map.of("fruits", new String[]{"apples", "bananas", "peaches"}));
        });

    }
}
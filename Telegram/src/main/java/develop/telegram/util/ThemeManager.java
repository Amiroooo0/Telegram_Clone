package develop.telegram.util;

import javafx.scene.Scene;

public class ThemeManager {
    private static String currentTheme = "light";

    public static void applyTheme(Scene scene, String theme) {
        scene.getStylesheets().removeIf(s -> s.contains("light.css") || s.contains("dark.css"));

        String themePath = ThemeManager.class
                .getResource("/develop/telegram/styles/" + theme + ".css")
                .toExternalForm();

        scene.getStylesheets().add(themePath);
        currentTheme = theme;
    }

    public static void toggleTheme(Scene scene) {
        applyTheme(scene, currentTheme.equals("light") ? "dark" : "light");
    }

    public static String getCurrentTheme() {
        return currentTheme;
    }
}

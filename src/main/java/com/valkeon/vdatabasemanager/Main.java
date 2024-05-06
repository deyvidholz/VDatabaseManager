package com.valkeon.vdatabasemanager;

import org.bukkit.plugin.java.JavaPlugin;

import java.sql.SQLException;

public final class Main extends JavaPlugin {

    private Database database;

    @Override
    public void onEnable() {
        database = new Database();

        try {
            database.connect();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(database.isConnected());
    }

    @Override
    public void onDisable() {
        database.disconnect();
    }
}

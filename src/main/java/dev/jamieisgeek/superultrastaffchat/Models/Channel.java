package dev.jamieisgeek.superultrastaffchat.Models;

public record Channel(String name, String displayName, String permission, String chatColor, String chatPrefix, String command, String[] aliases, String discordChannelID, String format) {}
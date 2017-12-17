Minecraft Forge (and many mods) have problems with the Turkish locale because they expect that for the basic ASCII letter A-Z the uppercase and lowercase conversions result in the same ASCII-result, e.g. i<->I. However for the Turkish locale that isn't true. There i<->İ and ı<->I.

 

This small coremod does one thing when the game starts: If it detects a Turkish locale, it changes it to English.

 

Note: This has nothing to do with the ingame language.

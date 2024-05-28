# instant pistons
Minecraft mod for Fabric to make piston speed customizable (because i wanted that and didn't find an already-existing mod for it)

## dependencies
- [oωo-lib](https://modrinth.com/mod/owo-lib) for config

## incompatibilities
- [#1](https://github.com/WarpedWartWars/instant_pistons/issues/1) [Lithium](https://modrinth.com/mod/lithium) - [G4mespeed](https://modrinth.com/mod/g4mespeed) "fixes" it

## bugs
- animations are messed up (note to self: check without lithium+g4mespeed)
- breaking a piston base while it's extending leaves the head intact until the extension finishes (vanilla bug, won't fix, plus it's funny to have a moving piston head on its own)
- unable to break base of retracting piston, yet able to break base of extending piston ([vanilla bug](https://bugs.mojang.com/browse/MC-94003))
- extension tick length 0 still makes piston lines retract instantly (vanilla bug, if i fix it i'll reimplement it with extension tick length -1, and have it happen with extension too, not just retraction. also shoutout [Instant Redstone Computer](https://minecraftforum.net/forums/minecraft-java-edition/redstone-discussion-and/343733-instant-redstone-computer))

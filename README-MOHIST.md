I don't know where else to put this, so here it is

Steps for creating Mohist compatible version:
    1. Use the forge mod setup in IntelliJ in order to be able to access the nms (which will later be compiled into the obfuscated mappings)
    2. Write your code then compile into a forge mod
    3. Open the problematic Java bytecode editor and hex editor where incompatible spigot-CraftBukkit and forge-nms descriptors collide
    4. Rename them to their correct obfuscated mappings (mappings can be located at ./build/createMcpToSrg/output.tsrg)
    5. Save and hope that you've not corrupted the class file

These steps are loose as I forgot the process taken to creating the remapped classes
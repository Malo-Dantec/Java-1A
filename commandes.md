# Commandes Java

### Générer la javadoc

```
javadoc -charset utf8 -noqualifier java.lang -d doc src/*.java
```

### Compiler les fichiers source 

```
javac -d bin src/*.java
```

### Exécuter la classe Exécutable

```
java -cp bin Executable
```
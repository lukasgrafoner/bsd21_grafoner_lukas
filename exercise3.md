# Exercise 3

Ich hatte bereit die JDK 17 auf meinem Laptop installiert. Also habe ich  Installation von Maven begonnen.\
Dazu habe ich, vom in der Angabe enthaltenen Link, einen .zip-Ordner von Maven heruntergeladen.\

Im gedownloadeten .zip-Ordner habe ich, um Maven richtig zu installieren, die README abgearbeitet:
1. Den zip-Ordner in C:/Programme entzippt
2. Die Systemvariablen bearbeitet, d.h. ich habe zur PATH-Variable den Pfad zum Maven Ordner angegeben. Wichtig hierbei ist es, `\bin` anzuhängen.
3. Danach konnte mit den folgenden Befehlen überprüft werden, ob sowohl Maven als auch Java richtig installiert ist.\
`mvn -v`\
`java -version`\
`javac -version`\

Nun war alles soweit korrekt installiert und ich konnte mit dem Erstellen eines Java-Projektes beginnen.\
Dazu habe ich in Intellij ein neues Maven-Projekt in den Ordner, der in der letzten Übung mit `git clone` erstellt wurde, erstellt.\
Da durch diese Erstellung auch ein .idea-Ordner erzeugt wurde, wurde dieser zu der .gitignore-Datei hinzugefügt.



---

---
Links:\
[README (Start)](/README.md)
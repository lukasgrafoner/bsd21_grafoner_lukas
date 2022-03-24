# Exercise 2

## Git Befehle:

* `git config`\
   Konfigurieren der Benutzer-Information (Email und Username). So werden erledigte Schritte nachvollziehbar gemacht.\
   
   **Beispiel:** 
   ```
   git config --global user.name "Lukas Grafoner"
   git config --global user.email "s50706@edu.campus02.at"
   ```

* `git init`\
   Mit diesem Befehl wird ein neues Git-Repository erstellt.
   Dabei wird auch der .git Ordner (unsichtbar) erzeugt.\
   Alternativ kann auch `git clone <path>` verwendet werden.

* `git commit`\
   Dieser Befehl erstellt einen Snapshot vom Projekt. Also es wird die Version zur Zeit X "gespeichert".\
   Er sollte möglichst nach jeder Änderung ausgeführt werden und eine Beschreibung (-m) enthalten.

   **Beispiel:** 
   ```
   git commit -m "Added file-xy"
   ```

* `git status`\
   Zeigt den aktuellen Status des Repositorys und der Staging Area.\
   Es werden nur Informationen ausgegeben.\
   Der Befehl zeigt z.B. Files an, die noch nicht committed wurden.

* `git add <filename>`\
   Mit diesem Befehl wird die angegebene Datei in die Staging Area geschoben, sodass es beim nächsten Commit "mitabgespeichert" wird.

* `git log`\
   Zeigt die vorgenommenen Commits in umgekehrter Reihenfolge (aktuellste zuerst) an.\
   Es werden Author (inkl. Email), Datum des Commits und die Commit-Message angezeigt.

* `git diff`\
   Von 'Difference'.\
   Mit diesem Befehl werden die Unterschiede zwischen dem commited File und dem nicht commited File ausgegeben.\
    **Beispiel:** 
   ```
   git diff exercise1.md
   ```
   _Output:_
   ```
   diff --git a/exercise1.md b/exercise1.md
   index 8ce94fe..1a6c529 100644
   --- a/exercise1.md
   +++ b/exercise1.md
   @@ -17,4 +17,4 @@ Damals, vor ca. 11 Jahren ...

   ---
   Links:\
   -[README (Start)](/README-Grafoner-Lukas.md)
   +[README (Start)](/README.md)
   ```
   Die letzten 2 Zeilen des Outputs stellen die Unterschiede dar.\
   Im commited File steht ".../README-Grafoner-Lukas.md", im nicht commited File ".../README.md".

* `git pull`\
   Updated das lokale Repository mit Hilfe des Remote Repositorys.

* `git push`\
   Nachdem man Änderungen vorgenommen und diese commited hat, wird der Befehl benutzt, um diese Änderungen in das Remote Repository zu "teilen".

---

---
Links:\
[README (Start)](/README.md)

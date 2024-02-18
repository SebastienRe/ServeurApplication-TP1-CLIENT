# Compilation du fichier Java
javac -cp TP_bean_session.jar Client_session.java

# Exécution du fichier Java avec la modification du CLASSPATH
java -cp "$env:CLASSPATH;TP_bean_session.jar" --add-opens java.base/java.lang=ALL-UNNAMED Client_session
#Quarkus + kafka + ISO


http://localhost:8080/mensagem-cobol.html

clear && mvn --settings ~/.m2/settings-quarkus.xml compile -f producer/ quarkus:dev
clear && mvn --settings ~/.m2/settings-quarkus.xml compile -f consumer/ quarkus:dev


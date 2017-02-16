# grails-rest-api
Sample rest-api with grails


Requires: Java 1.8+, Groovy 2.4.8+, Grails 3.2.6+


Created with: grails create-app supermarket --profile rest-api --features mongodb

Domain:       supermarket.item.Item(nome, quantidade)

Controller:   supermarket.item.ItemController


Backed by a local mongodb (must be installed)


Start the server: gradle clean build bootRun


Urls:

localhost:8080/itens/

localhost:8080/acomprar


All http verbs supported. Ex (POST):

curl -i -X POST -H "Content-Type: application/json" -d '{"nome":"limao", "quantidade":"1"}' localhost:8080/itens

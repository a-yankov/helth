FROM openliberty/open-liberty:microProfile2-java8-openj9
COPY liberty/server.xml /config/
ADD target/helth.war /config/dropins/
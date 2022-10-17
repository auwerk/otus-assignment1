FROM eclipse-temurin:11
ARG app_ver="1.0-SNAPSHOT"
RUN mkdir /opt/app
COPY "build/libs/OtusAssignment1-${app_ver}.jar" /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]
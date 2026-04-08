FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copia todo el proyecto
COPY . .

# Da permisos de ejecución al Maven wrapper
RUN chmod +x mvnw

# Ejecuta Maven wrapper
RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["sh", "-c", "java -jar target/*.jar"]
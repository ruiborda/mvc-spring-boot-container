# Etapa de compilación
FROM maven:3-amazoncorretto-21-alpine AS build
WORKDIR /app

# Copiamos el archivo de configuración para aprovechar la caché de dependencias
COPY . .

# Compilamos el proyecto (se omiten los tests para agilizar el proceso)
RUN mvn clean package -DskipTests

# Etapa de ejecución
FROM amazoncorretto:21-alpine-jdk AS runtime
WORKDIR /workspace

# Copiamos el jar generado en la etapa anterior
COPY --from=build /app/target/*.jar /workspace/app.jar

RUN echo "test text" > /workspace/test.txt
RUN chmod 755 /workspace/app.jar

# Verificar si existe un archivo
RUN ls -la /workspace
EXPOSE 8000

# Ejecutamos la aplicación
CMD ["java", "-jar", "/workspace/app.jar"]


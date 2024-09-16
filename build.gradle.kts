plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    compileOnly ("org.projectlombok:lombok:1.18.26")
    annotationProcessor ("org.projectlombok:lombok:1.18.26")

    implementation("org.hibernate:hibernate-core:5.6.0.Final")
    //implementation("mysql:mysql-connector-java:8.0.28")
    // Cambia javax.persistence-api por jakarta.persistence-api
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
}


tasks.test {
    useJUnitPlatform()
}
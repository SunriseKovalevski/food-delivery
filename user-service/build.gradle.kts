plugins {
    id("java")
}

group = "com.innowise.kovalevski_vv"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

springBoot {
    mainClass.set("com.innowise.kovalevski_vv.UserServiceApplication")
}

dependencies {
    implementation("org.postgresql:postgresql:42.6.0")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
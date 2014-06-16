grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6

grails.project.dependency.resolver = "maven"

grails.project.dependency.resolution = {

    inherits("global") {
    }
    
    log "warn"
    
    repositories {
        grailsPlugins()
        grailsCentral()
        mavenCentral()
    }
    
    dependencies {
        build ('org.kuali.maven.wagons:maven-s3-wagon:1.1.22') {
            export = false
            exclude 'slf4j-log4j12'
        }
        compile 'de.javakaffee:kryo-serializers:0.26'
    }

    plugins {
        build (':release:3.0.1') {
            export = false
            exclude 'spock'
        }
        compile (":hibernate:3.6.10.16") {
            export = false  
        }
        compile (":webxml:1.4.1") {
            exclude 'spock'
        }
    }
}

grails.release.scm.enabled = false
grails.project.repos.default = "ducktape"

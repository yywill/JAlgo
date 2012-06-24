# to get a maven enabled ecipse of Groovy
## just for reference (I am not using this way)

mvn archetype:generate \
    -DarchetypeGroupId=org.codehaus.groovy \
    -DarchetypeArtifactId=groovy-eclipse-quickstart \
    -DarchetypeVersion=2.5.2-01 \
    -DgroupId=foo \
    -DartifactId=bar \
    -Dversion=1 \
    -DinteractiveMode=false \
    -DarchetypeRepository=https://nexus.codehaus.org/content/repositories/snapshots/
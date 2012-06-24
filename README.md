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
    
## environment for building

* [eclipse 3.7](http://www.eclipse.org/downloads/) -- `download eclipse`
* [groovy eclipse plugin](http://groovy.codehaus.org/Eclipse+Plugin) -- `eclipse->help->Install New Software` (http://dist.springsource.org/release/GRECLIPSE/e3.7/)
* [m2e](http://www.eclipse.org/m2e/) -- `eclipse->help->Install New Software` (http://download.eclipse.org/technology/m2e/releases)

# Mule Rollbar Connector
**WARNING** This connector is still very much in the early stages of development, as such functionaly is liable to change in a non-backwards compatable manor.

## Build
* If using MuleStudio without Maven
```
mvn clean package
```

* If you are using Maven
```
mvn clean install
```

## Install
* In MuleStudio goto Help > Install New Software...
* Click Add...
* Click Local...
* Add the mule-module-rollbar/target/update-site path
* Give the repository a name and click ok
* Install Rollbar

Additional dependency if using Maven:

```xml
<dependency>
    <groupId>net.rstomlinson.mule</groupId>
    <artifactId>mule-module-rollbar</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

## Usage
For information about usage you can check out the documentation at http://rtomlinson.github.com/rollbar-connector

## Reporting Issues
You can report new issues at https://github.com/rtomlinson/rollbar-connector/issues
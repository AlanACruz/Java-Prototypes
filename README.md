# Copyright (C) 2021 Alan Cruz
# Java-Prototypes

# Git Clone
```
git clone git@github.com:AlanACruz/Java-Prototypes.git ~/git/Java-Prototypes
```
# Install Docker on Chromebook
https://github.com/AlanACruz/DevSecOps/blob/master/docker/Install-Docker-On-Chromebook.md

# Pull Maven image
```
docker pull maven:3-openjdk-17
```

# Run Container
```
docker run \
   --name maven \
   -v ~/.m2:/var/maven/.m2:Z \
   -v ~/git/Java-Prototypes:/var/maven/git/Java-Prototypes:Z \
   -t \
   -i \
   --rm \
   -u $UID \
   -e MAVEN_CONFIG=/var/maven/.m2 \
   maven:3-openjdk-17 \
   /bin/bash
```
# Run Maven Build from Container
```
   mvn -f /var/maven/git/Java-Prototypes -Duser.home=/var/maven install
```
# Run Maven Build Locally
```
sudo apt-get install -y \
   openjdk-17-jdk \
   maven

cd ~/git/Java-Prototypes

mvn install
```

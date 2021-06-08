# Copyright (C) 2021 Alan Cruz
# Java-Prototypes

# git clone
```
git clone git@github.com:AlanACruz/Java-Prototypes.git ~/git/
```
# install docker
```
sudo apt update

sudo apt install -y \
   apt-transport-https \
   ca-certificates \
   curl \
   gnupg2 \
   software-properties-common

curl -fsSL https://download.docker.com/linux/debian/gpg | sudo apt-key add -

sudo add-apt-repository \
   "deb [arch=amd64] https://download.docker.com/linux/debian \
   $(lsb_release -cs) \
   stable"
   
sudo apt update

sudo apt install -y \
   docker-ce \
   docker-ce-cli \
   containerd.io
```

# Enable non-root docker (Chromebook)
```
sudo usermod -aG docker $USER

sudo chmod 666 /var/run/docker.sock
```

# Pull Maven image
```
docker pull maven:3-openjdk-16
```

# Run Maven build from container
```
docker run \
   -v ~/.m2:/var/maven/.m2 \
   -v ~/git/Java-Prototypes:/var/maven/git/Java-Prototypes \
   -t \
   -i \
   --rm \
   -u $UID \
   -e MAVEN_CONFIG=/var/maven/.m2 \
   maven:3-openjdk-16 \
   mvn -f /var/maven/git/Java-Prototypes -Duser.home=/var/maven install
```

# Run Maven build locally
```
sudo apt-get install -y \
   openjdk-16-jdk \
   maven

cd ~/git/Java-Prototypes

mvn install
```

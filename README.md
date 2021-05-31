#-------------------------------------------------------------------------------
# Copyright (C) 2021 Alan Cruz
# 
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
# 
# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.
# 
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
#-------------------------------------------------------------------------------
# cruz-jee-proto

# git clone
git clone git@github.com:AlanACruz/Java-Prototypes.git ~/git/

# install docker
sudo apt update
sudo apt install -y apt-transport-https ca-certificates curl gnupg2 software-properties-common

curl -fsSL https://download.docker.com/linux/debian/gpg | sudo apt-key add -
sudo add-apt-repository \
   "deb [arch=amd64] https://download.docker.com/linux/debian \
   $(lsb_release -cs) \
   stable"
sudo apt update
sudo apt install -y docker-ce docker-ce-cli containerd.io

# Enable non-root docker (Chromebook)
sudo usermod -aG docker $USER
sudo chmod 666 /var/run/docker.sock

# Pull Maven container
docker pull maven:3-openjdk-11

# Run Maven build from container
docker run -v ~/.m2:/var/maven/.m2 -v ~/git/Java-Prototypes:/var/maven/git/Java-Prototypes -t -i --rm -u $UID -e MAVEN_CONFIG=/var/maven/.m2 maven:3-openjdk-11 mvn -f /var/maven/git/Java-Prototypes -Duser.home=/var/maven install
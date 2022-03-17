# SPSMB 3AI ANJ2 - PRO/PRA
----------------------------
Automatické spuštění serveru PiskorkyServer pod ubuntu:
```
wget https://github.com/gitofson/spsmb_3ai_anj2/raw/main/lessons/src/_22y/_02m/_17d_46/piskorky/PiskorkyServer.java
wget https://github.com/gitofson/spsmb_3ai_anj2/raw/main/lessons/src/_22y/_02m/_17d_46/piskorky/PiskorkyStatus.java
echo "Main-Class: PiskorkyServer.class" > MANIFEST.MF
sed -i -e'/package.*/d'  PiskorkyServer.java
sed -i -e'/package.*/d'  PiskorkyStatus.java
javac PiskorkyStatus.java PiskorkyServer.java
java PiskorkyServer
sudo sysctl -w net.ipv6.conf.all.disable_ipv6=1
sudo sysctl -w net.ipv6.conf.default.disable_ipv6=1
sudo sysctl -w net.ipv6.conf.lo.disable_ipv6=1
```


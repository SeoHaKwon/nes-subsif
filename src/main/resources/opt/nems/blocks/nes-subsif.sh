#!/bin/sh

MODULE_NAME="NES_SUBIF"

case $1 in
    -Ver)       echo "@(#) NEMS_BASE_V1.0";
                echo "Mar  2 202314:00:00";
                echo "KT_POTS2.0_EMS_V1.0.0 /";;
    *)          exec  -a ${MODULE_NAME} java -server -Xnoclassgc -XX:+UseParNewGC -XX:ParallelGCThreads=4 -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=50 -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintHeapAtGC -XX:+PrintTenuringDistribution -XX:NewRatio=2 \
                        -Djava.net.preferIPv4Stack=true \
                        -Dlog4j2.formatMsgNoLookups=true \
                        -Xms1024m \
                        -Xmx1024m \
                        -XX:MetaspaceSize=256M \
                        -XX:MaxMetaspaceSize=512M \
                        -cp /usr/share/nems/nes-subif.jar \
                        -Dlogback.configurationFile=/etc/nems/conf.d/nes-subsif-logback.xml \
                        com.ipageon.subsif.SubsifApplication;
esac

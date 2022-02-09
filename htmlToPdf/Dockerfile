FROM java:8
VOLUME /data
ADD src/main/resources/arcsoft_lib/libarcsoft_face_engine_jni.so /home/arcsoft_lib/libarcsoft_face_engine_jni.so
ADD src/main/resources/arcsoft_lib/libarcsoft_face_engine.so /home/arcsoft_lib/libarcsoft_face_engine.so
ADD src/main/resources/arcsoft_lib/libarcsoft_face.so /home/arcsoft_lib/libarcsoft_face.so
ADD src/main/resources/arcsoft_lib/arthas-packaging-3.6.2-bin /home/arthas-packaging-3.6.2-bin
ADD target/sl-jobmgt-sys-0.0.1-SNAPSHOT.jar app.jar
# ADD src/main/resources/arcsoft_lib/jrebel/jrebel.jar /home/jrebel/jrebel.jar
#
# ADD src/main/resources/arcsoft_lib/jrebel/libjrebel64.so /home/jrebel/libjrebel64.so

ENV TZ Asia/Shanghai
#RUN bash -c 'touch /app.jar'
# RUN java -jar /home/jrebel/jrebel.jar -set-remote-password 12345678

EXPOSE 30323
ENTRYPOINT ["java","-server","-Xms256m","-Xmx2g","-Xmn256m","-Xss256k","-XX:MetaspaceSize=64m","-XX:MaxMetaspaceSize=256m","-Xss256k","-XX:SurvivorRatio=4","-XX:TargetSurvivorRatio=70","-XX:+UseConcMarkSweepGC","-XX:+UseParNewGC","-XX:+CMSClassUnloadingEnabled","-XX:+DisableExplicitGC","-XX:+UseCMSInitiatingOccupancyOnly","-XX:CMSInitiatingOccupancyFraction=70","-XX:+CMSScavengeBeforeRemark","-verbose:gc","-Xloggc:/data/gc.log","-XX:+PrintGCTimeStamps","-XX:+PrintGCDetails","-Djava.security.egd=file:/dev/./urandom","-jar","-Dspring.profiles.active=dev","/app.jar"]

#
# FROM magistral/jdk8-ubuntu
# RUN  apt-get update -y
# RUN  apt-get  install  telnet -y
# RUN  apt-get  install  unzip -y
# RUN  apt-get install curl -y
# VOLUME /data
#
#
#
#
#
# ADD src/main/resources/arcsoft_lib/arthas-packaging-3.6.2-bin /root/opt/arthas
# #ADD target/sl-jobmgt-sys-0.0.1-SNAPSHOT.jar app.jar
# ADD src/main/resources/arcsoft_lib/jrebel/jrebel.jar /home/jrebel/jrebel.jar
# RUN java -jar /home/jrebel/jrebel.jar -set-remote-password 12345678
# ADD src/main/resources/arcsoft_lib/jrebel/libjrebel64.so /home/jrebel/libjrebel64.so
#
# #RUN apt-get install openjdk-8-jdk
# RUN  chmod u+x /root/opt/arthas/as.sh
# #/home/user/opt/arthas/mybatis/mapper/
# RUN  chmod u+x /root/opt/arthas/mybatis-mapper-xml-reload.sh
# RUN  chmod -R 777 /root/opt/arthas
# RUN  mkdir -p /root/opt/arthas/mybatis/mapper/
# RUN  chmod 777 /root/opt/arthas/mybatis/mapper/
# RUN  chmod 777 /root/opt/arthas
#
# #                   /home/user/opt/arthas/mybatis/mapper/
# # ADD src/main/resources/arcsoft_lib/jdk-8u341-linux-x64.tar /usr/local/
# # ENV JAVA_HOME /usr/local/jdk-8u341-linux-x64
# # ENV CLASSPATH $JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
# # ENV PATH $PATH:$JAVA_HOME/bin
# # RUN echo '!!!' RUN echo '222' > /222 RUN echo $ENV1 > env1
# #RUN java -version
# #FROM java:8
#
# ADD target/sl-jobmgt-sys-0.0.1-SNAPSHOT.jar /home/jrebel/app.jar
# ENV TZ Asia/Shanghai
# RUN  bash -c 'touch /home/jrebel/app.jar'
#
#
#
# EXPOSE 30323
# # ADD src/main/resources/arcsoft_lib/libarcsoft_face_engine_jni.so /home/arcsoft_lib/libarcsoft_face_engine_jni.so
# # ADD src/main/resources/arcsoft_lib/libarcsoft_face_engine.so /home/arcsoft_lib/libarcsoft_face_engine.so
# # ADD src/main/resources/arcsoft_lib/libarcsoft_face.so /home/arcsoft_lib/libarcsoft_face.so
# RUN whoami
# #RUN sudo
#
#
#
#
# ENTRYPOINT ["java","-server","-agentpath:/home/jrebel/libjrebel64.so",
# "-Drebel.remoting_plugin=true","-Drebel.log.file=/jrebel.log","-Xms256m","-Xmx2g","-Xmn256m","-Xss256k",
# "-XX:MetaspaceSize=64m","-XX:MaxMetaspaceSize=256m","-Xss256k","-XX:SurvivorRatio=4",
# "-XX:TargetSurvivorRatio=70","-XX:+UseConcMarkSweepGC","-XX:+UseParNewGC",
# "-XX:+CMSClassUnloadingEnabled","-XX:+DisableExplicitGC","-XX:+UseCMSInitiatingOccupancyOnly",
# "-XX:CMSInitiatingOccupancyFraction=70","-XX:+CMSScavengeBeforeRemark","-verbose:gc","-Xloggc:/data/gc.log",
# "-XX:+PrintGCTimeStamps","-XX:+PrintGCDetails","-Djava.security.egd=file:/dev/./urandom","-jar",
# "-Dspring.profiles.active=dev","/home/jrebel/app.jar"]
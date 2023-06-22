# SchedualManager
1. Change the **IP Address** **username** and **Password** in \WEB-INF\classes\c3p0-config.xml

2. if the MySQL version you use is **below 8.0**, change the **Driver** as well.
   
3. Due to C3P0 is the **Single Threaded** module, personal recommend the **Connection Pool** must **small** than **20**.
   
4. MySQL script is in the root folder. You must **at least** add a Administrator in Tablet **s-admin**
   
5. move **ALL file** except mysql script into **Tomcat webapp** folder while deploy.
   
6. This Projects File is only use for **JavaWeb-Curriculum-Design of Class 2020** in HUUC(Henan University of Urban Construction).
   1. If anyone want to use for other purpose, please let me know( Free of course，Just let me know ).
---
    * writen by M.Ds.CQ ( ChaoticNeutral )
    * 2023.6.22 11:59
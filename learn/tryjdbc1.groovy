// try some jdbc stuff
import groovy.sql.Sql

def sql = Sql.newInstance("jdbc:oracle:thin:@130.35.46.41:1521:orcl", 
    "oimsysadm", "oimsysadm", "oracle.jdbc.driver.OracleDriver")
sql.eachRow("select usr_login, usr_password from usr"){ row ->
    println row.usr_login + " " + row.usr_password
}


// try accessing the database

import java.sql.*

Class.forName("oracle.jdbc.driver.OracleDriver")
def con = DriverManager.getConnection("jdbc:oracle:thin:@tde10:1522:CUSTOMER", "oim91", "oim91")
def stmt = con.createStatement()
def query = "select xsd_code, xsd_value from xsd"
def rs = stmt.executeQuery(query)

while (rs.next()) {
    println "${rs.getString('xsd_code')} ==> ${rs.getString('xsd_value')}"
}

stmt.close()
rs.close()
con.close()

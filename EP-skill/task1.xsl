<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:template match="/Students">
		 <html>
		  <body>
		  <h1 align = 'center'>Students Data</h1>
		    <table border="1" align="center">
		      <tr>
		        <th  bgcolor="yellow">Number</th>
		        <th  bgcolor="pink">Name</th>
		        <th  bgcolor="lightblue">Email</th>
		        <th  bgcolor="lightgreen">Marks</th>
		        <th  bgcolor="orange">Class</th>
		      </tr>
		      <xsl:for-each select="student">
		      <tr>
		        <td><xsl:value-of select="no"/></td>
		        <td><xsl:value-of select="name"/></td>
		        <td><xsl:value-of select="email"/></td>
		        <td><xsl:value-of select="marks"/></td>
		        <td><xsl:value-of select="classs"/></td>
		      </tr>
		      </xsl:for-each>
		    </table>
		  </body>
  		</html>
	</xsl:template>
</xsl:stylesheet>
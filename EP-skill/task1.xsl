<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/Students">
		 <html>
		  <body>
		  <h1 align = 'center'>Students Data</h1>
		    <table border="1">
		      <tr>
		        <th  bgcolor="blue">Number</th>
		        <th  bgcolor="yellow">Name</th>
		        <th  bgcolor="green">Email</th>
		        <th  bgcolor="red">Marks</th>
		        <th  bgcolor="pink">Class</th>
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
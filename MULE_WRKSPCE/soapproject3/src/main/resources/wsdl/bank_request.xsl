<?xml version="1.0" encoding="ISO-8859-1"?>
 
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:tra="http://proxy.testing.bakka.com/">
 
    <xsl:output method="xml" encoding="UTF-8" indent="yes"
        omit-xml-declaration="yes" />
 
    <!-- By default, retain all elements -->
    <xsl:template match="@* | node()">
        <xsl:copy>
            <xsl:apply-templates select="@* | node()" />
        </xsl:copy>
    </xsl:template>
 
    <!-- 
        Transform proxySendMoney tag into sendMoney 
        Enrich to add authCode and partnerCode elements
    -->
    <xsl:template match="tra:proxySendMoney">
        <tra:sendMoney>
            <arg0>
                <xsl:copy-of select="arg0/node()" />
                <authCode xmlns="">APICode123</authCode>
                <partnerCode xmlns="">Mule</partnerCode>
            </arg0>
        </tra:sendMoney>
    </xsl:template>
</xsl:stylesheet>
<?xml version="1.0" encoding="ISO-8859-1"?>
 
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:tra="http://proxy.testing.bakka.com/">
 
    <xsl:output method="xml" encoding="UTF-8" indent="yes"
        omit-xml-declaration="yes" />
 
    <!-- Copy all nodes as it is when no matching template found -->
    <xsl:template match="@* | node()">
        <xsl:copy>
            <xsl:apply-templates select="@* | node()" />
        </xsl:copy>
    </xsl:template>
 
    <!-- Transform sendMoneyResponse tag into sendMoneyResponse -->
    <xsl:template match="tra:sendMoneyResponse">
        <tra:proxySendMoneyResponse>
            <xsl:copy-of select="return" />
        </tra:proxySendMoneyResponse>
    </xsl:template>
 
</xsl:stylesheet>
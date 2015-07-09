wsdl: http://localhost:8082/soap>wsdl

Input:
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:soap="http://soap.testing.bakka.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <soap:wishDaily>
         <!--Optional:-->
         <arg0>Srikanth</arg0>
      </soap:wishDaily>
   </soapenv:Body>
</soapenv:Envelope>

Output:
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:wishDailyResponse xmlns:ns2="http://soap.testing.bakka.com/">
         <return>Good Morning Mr.Srikanth</return>
      </ns2:wishDailyResponse>
   </soap:Body>
</soap:Envelope>
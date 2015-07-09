http://training.middlewareschool.com/mule/soap-code-first-build/
http://training.middlewareschool.com/mule/consuming-soap-code-first-service/


http://localhost:8082/soap?wsdl

Use Soap UI to test it
We can use client flow also to test the same


Input::
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:soap="http://soap.test.bakka.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <soap:wishAll>
         <!--Optional:-->
         <arg0>Ram</arg0>
      </soap:wishAll>
   </soapenv:Body>
</soapenv:Envelope>

Output:

<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:wishAllResponse xmlns:ns2="http://soap.test.bakka.com/">
         <return>Hello Mr.Ram, Good Morning!!</return>
      </ns2:wishAllResponse>
   </soap:Body>
</soap:Envelope>
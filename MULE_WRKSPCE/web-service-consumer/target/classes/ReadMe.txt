:::1:::
url: 
http://localhost:8001/orders
Input:
{
  "email":"12121@mulesoft.com",
  "address1":"Corrientes 316",
  "address2":"EP",
  "city":"Buenos Aires",
  "country":"Argentina",
  "name":"MuleSoft Argentina",
  "postalCode":"C1043AAQ",
  "size":"L",
  "stateOrProvince":"CABA"
}

:::2:::
url:http://localhost:8001/inventory
Input: none
Output:
{
  "inventory" : [ {
    "productCode" : "4102",
    "size" : "L",
    "description" : "Prueba",
    "count" : 2
  }, {
    "productCode" : "1412",
    "size" : "L",
    "description" : "Foo",
    "count" : 9
  }, {
    "productCode" : "5656",
    "size" : "S",
    "description" : "Bar",
    "count" : 2
  }, {
    "productCode" : "5657",
    "size" : "M",
    "description" : "Prueba2",
    "count" : 3
  }, {
    "productCode" : "1411",
    "size" : "M",
    "description" : "Awesome Tshirt",
    "count" : 5
  } ]
}

:::3:::
url:http://localhost:8081/trackIt?orderId=1234&emailId=s1@sa.com
output:
{
  "orderId" : "1234",
  "size" : "M"
}
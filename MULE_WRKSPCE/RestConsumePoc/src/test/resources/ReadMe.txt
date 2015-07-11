REST Consume POC


Rest- get call
Input:
http://localhost:8082/vm

Output:
[Customer [id=9999, name=Dummy]]


Rest Post Call
Input:
http://localhost:8082/pm
Output:
[Customer [id=1, name=Sam Hooster]]

Rest AUTH USER password POC
Input:
http://localhost:8082/rpm
Output:
[Customer [id=1, name=Sam Hooster]]

Rest AUTH TOKEN POC
Input:
http://localhost:8082/ram
Output:
[Customer [id=1, name=Sam Hooster]]
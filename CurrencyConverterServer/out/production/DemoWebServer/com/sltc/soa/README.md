Run this to build the client stub
change the jdk path to your machine appropriately

[comment]: <> ("C:\Program Files\Java\jdk1.8.0_291\bin\wsimport.exe"  -d ..\DemoWebServiceClient\Stub -p com.sltc.soa.client.stub http://localhost:8888/DemoWebService?wsdl)


"C:\Program Files\Java\jdk1.8.0_291\bin\wsimport.exe" -keep -d ..\DemoWebServiceClient\Stub -p com.sltc.soa.client.stub http://localhost:8888/DemoWebService?wsdl
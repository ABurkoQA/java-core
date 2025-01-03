## Topic: Regex

1. Find and return true or false if String contains orderUUID
```   
app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO  
OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract customerName=0005084863 
orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515 lineCount=3
```
2. Find and return orderUUID substring from string
```   
app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO  
OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract 
customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515 lineCount=3
```
3. Find and return user email from string
```
   test 2667843 (test_email@griddynamics.com) test 67483 some string
```
4. Find and return how many orders were created from this string -
```   
app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 
poiFileName=Integration_test_Contract INFO  LogUtils - POI file name: 
[Integration_test_Contract], total number of 
orders successfully processed: [2]
```
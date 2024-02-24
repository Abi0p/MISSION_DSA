## searching a string taken from the input 
orginal = input("enter the sentence")
if orginal.find('how'):
   print ("present")
else:
   print ("not present")
## searching no. of times a particular string exists in a string 

statement = " hello , hello, Hello, Hello, krishna , Radha"
sub_string = "hello"
count_er = 0
start_index = 0
for i in range (len(statement)):
   j = statement.find(sub_string,start_index)
   if j != -1:
      start_index = j+1
      count_er +=1
print ('Total occurance :',count_er)

## searching 
if  statement.find("hello") != -1 :
   print ("present")
else: 
   print ("not present ")

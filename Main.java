import java.util.*;

public class Main
{

public static void main(String[] args)
{
// [1]-> Create a string for the old text and another string to store the result
String old="is2 this1 test4 a3",result="";
// [2]-> Split old text and store it into a new array
final String[] s;
s=old.split("\\s+");
// [3]-> Use nested for loop to fix the order of the words
for(int i=1;i<s.length+1;i++){

for(int j=1;j<s.length+1;j++){
// [5]-> if statement to check everytime if the array at i-1 contains number i
if(s[j-1].contains(String.valueOf(i))==true){
// [6]-> Update the result text
result+=s[j-1].replace(String.valueOf(i),"")+" ";
//Note : i used += to update the value of result everytime the order is good

}
}
}
//Print the result
System.out.println(result);
}
}

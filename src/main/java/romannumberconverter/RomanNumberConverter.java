package romannumberconverter;

public class RomanNumberConverter {

public String convert(int number){
  if(number<0){
    throw new IllegalArgumentException("number can't be negative");
  }

  String roman= "";
  int N=number;
  while(N>=10){
    roman+="X";
    N-=10;
  }
  while(N>=9){
    roman+="IX";
    N-=9;
  }
  while(N>=5){
    roman+="V";
    N-=5;
  }
  while(N>=4){
    roman+="IV";
    N-=4;
  }
  while(N>=1){
    roman+="I";
    N-=1;
  }
  return roman;
}




}

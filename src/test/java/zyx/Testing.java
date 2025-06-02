package zyx;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str ="persistent";
        int length = str.length();
        int maxCount=0,currentCount=0;
        char maxChar=0;
        char currentChar=0;
        
        for(int i=0; i<length;i++){
            currentChar = str.charAt(i);
            currentCount=0;
            for(char c: str.toCharArray()){
                if(str.charAt(i)==c){
                    currentCount++;
                }
                if(maxCount<currentCount){
                    maxChar = c;
                    maxCount=currentCount;
                }
            }
           
        }
        StringBuilder chars = new StringBuilder();
        for(char c: str.toCharArray()){
        	chars.append(c);
        }

        System.out.println(chars);
	}           
}

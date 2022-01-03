// https://practice.geeksforgeeks.org/problems/run-length-encoding/1/

String encode(String str)
	{
          //Your code here
        char[] ch = str.toCharArray();
        int cnt = 1;
        StringBuilder sb = new StringBuilder("");
        sb.append(ch[0]);
        for(int i = 1; i< ch.length;i++){
            if (ch[i] == ch[i-1]){
                cnt++;
            }else{
                sb.append(cnt);
                cnt = 1;
                sb.append(ch[i]);
            }
        }
        sb.append(cnt);
        return sb.toString();
	}

public class StringManipulator {
    public String  trimAndConcat(String x, String y){
        return x.trim()+y.trim();
    }
    public Integer getIndexOrNull(String x, char y){
         if(x.indexOf(y)==-1)
             return null;
         else
            return x.indexOf(y);
    }
    public Integer getIndexOrNull(String x, String y){
        if(x.indexOf(y)==-1)
            return null;
        else
            return x.indexOf(y);
    }
    public String concatSubstring(String x, int start, int end, String y){
        return x.substring(start,end)+y;
    }
}


public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int index = 0;
        int longestStrLen = arr[0].length();

        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() >= longestStrLen){
                longestStrLen = arr[i].length();
                index = i;
            }
        }

        String longestStr = arr[index];

        return longestStr;

        
        // String firstStr = arr[0];
        // String longestStr = firstStr;

        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i].length() >= firstStr.length() ){
        //         longestStr = arr[i];
        //     }
        // }

        // return longestStr;


    }
}

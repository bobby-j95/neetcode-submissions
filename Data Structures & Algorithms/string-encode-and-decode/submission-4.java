class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedVal = new StringBuilder();

        // For each value in string add values to encodedVal with delimiter and length of string
        for (String x : strs){
            encodedVal.append(x.length()).append("#").append(x);
        }
        System.out.println("string val1: " + encodedVal.toString());
        // Return the full string
        return encodedVal.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedVal = new ArrayList<>();
        char[] cArray = str.toCharArray();
        int x = 0;
        int y = 0;

        System.out.println("string val2: " + str);
        // Loop through and read the number before delimiter put each val in a new char array
        // convert to string then add to decodedVal
        while (x < cArray.length && y < cArray.length){
            y = x;
            if (cArray[0] == 0 || cArray == null){
                decodedVal.add("");
                break;
            }
            while (cArray[y] != '#'){
                 y++;
            }
            if (cArray[y] == '#'){
                // Create substring of word and add to array
                System.out.println("substring: " + str.substring(x, y));
                int strSize = Integer.parseInt(str.substring(x, y));
                x = ++y;
                System.out.println("val: " + strSize);
                decodedVal.add(str.substring(x, x + strSize));
                x = x + strSize;
                System.out.println("x val vs lenth: " + x + " : " + cArray.length);
            }
        }
        return decodedVal;
    }
}

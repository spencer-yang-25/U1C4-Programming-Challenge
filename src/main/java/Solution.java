public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        int contains = x.indexOf("ly");
        int length = x.length();
        if (contains == (length-2) && x.length() > 1) {
            return true;
        }
        return false;
    }

    public String conCat(String s1, String s2) {
        String concated = "";
        if (s2.length() > 0 && s1.substring(s1.length()-1).equals(s2.substring(0,1))) {
            concated = s1.substring(0,s1.length()-1) + s2;
        } else {
            concated = s1 + s2;
        }
        return concated;
    }

    public String withoutX(String s1) {
        String deXed = s1;
        if (s1.indexOf("x") == 0) {
            deXed = deXed.substring(1);
        } if (deXed.substring(deXed.length()-1).indexOf("x") != -1) {
            deXed = deXed.substring(0, deXed.length()-1);
        }
        return deXed;
    }

    public String fizzString(String s1) {
        String solution = "";
        if (s1.indexOf("f") == 0) {
            solution = "Fizz";
        } if (s1.indexOf("b") == s1.length()-1) {
            solution = "Buzz";
        }if (s1.indexOf("f") == 0 && s1.indexOf("b") == s1.length()-1) {
            solution = "FizzBuzz";
        }
        return solution;
    }

    public String fizzString2(int x) {
        String solution = "" + x + "!";
        if (x%3 == 0) {
            solution = "Fizz!";
        } if (x%5 == 0) {
            solution = "Buzz!";
        } if (x%5 == 0 && x%3 == 0) {
            solution = "FizzBuzz!";
        }
        return solution;
    }

}

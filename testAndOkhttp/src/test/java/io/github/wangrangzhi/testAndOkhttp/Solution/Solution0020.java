package io.github.wangrangzhi.testAndOkhttp.Solution;


import java.util.ArrayList;

public class Solution0020 {

    public static void main(String[] args) {
        Solution0020 solution = new Solution0020();
//        System.out.println(solution.isValid("(){}}{"));
//        System.out.println(solution.isValid("(])]"));
//        System.out.println(solution.isValid("(){}{[()]}"));
//        System.out.println(solution.isValid("[])"));
        //


        System.out.println(solution.isValid("[(({})}]"));



    }

    public boolean isValid(String s) {
        if(s.length() == 1){
            return false;
        }

        if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}'){
            return false;
        }


        int top = 0;

        ArrayList a = new ArrayList();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                top++;
                a.add(c);
            } else {
                if (c == ')') {

                    if(a.size() == 0){
                        return false;
                    }
                    if ('(' != (char) a.get(a.size() - 1)) {
                        return false;
                    }


                }
                if (c == ']') {

                    if(a.size() == 0){
                        return false;
                    }
                    if ('[' != (char) a.get(a.size() - 1)) {
                        return false;
                    }
                }
                if (c == '}') {

                    if(a.size() == 0){
                        return false;
                    }
                    if ('{' != (char) a.get(a.size() - 1)) {
                        return false;
                    }
                }
                top--;
                if(a.size()>=1){
                    a.remove(a.size()-1);
                }else{
                    return false;
                }

            }
        }

        return top == 0;

    }
}


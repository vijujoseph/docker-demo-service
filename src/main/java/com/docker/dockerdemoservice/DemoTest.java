package com.docker.dockerdemoservice;

public class DemoTest {

    public static void main(String args[]) {
        String arrays[] = {"0111","1111", "1111","1111"};

        System.out.println("Max sqr matrix formation : " + solution(arrays));
    }

    private static int solution(String[] arrays) {
        int max = 0;
        int pos[] = {};
        for(String str: arrays) {
            char charArray[] = str.toCharArray();
            for(int i=0; i<charArray.length ; i++) {
                if(charArray[i] == 1) {
                    pos[i] = i;
                }
                max = findMaxIsland(arrays, i, pos);
            }

        }
        return 1;
    }

    private static int findMaxIsland(String[] arrays, int i, int[] pos) {
        int count = 0;
        for(int j=i+1; j < arrays.length ; j++ ) {
            char arr[] = arrays[j].toCharArray();
            for(int k=0; k < pos.length ; k++) {
                if(arr[k] == 1) {
                    pos[i] = i;
                }
            }
        }
        return count;
    }
}

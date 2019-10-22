/* Leetcode Day of the Year problem: 
Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

Example 1:

Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
*/

class Solution {
     int addingElement(int n,int y){
        int m=0;
        if(n==1||n==3||n==5||n==7||n==8||n==10||n==12)
           m=31;
        else if (n==2){
            if(y%400==0)
                m=29;
            else if(y%100==0)
                m=28;
            else if(y%4==0)
                m=29;
            else
                m=28;
        }
        else
           m=30;
        return m;
    }
    public int dayOfYear(String date) {
        int n=Integer.parseInt(date.substring(5,7));
        int d=0;
        int y=Integer.parseInt(date.substring(0,4));
        if(n==1)
            return(Integer.parseInt(date.substring(8)));
        else{
            for(int i=1;i<n;i++)
                d+=addingElement(i,y);
            d+=Integer.parseInt(date.substring(8));
            return d;   
        }
    }
}

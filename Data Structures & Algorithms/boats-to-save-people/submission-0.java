class Solution {
    // people = [1,3,2,3,2], limit = 3
    //  sorted = [1,2,2,3,3]

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0 , j=people.length-1;
        int noBoats = 0;
        while(i<=j){
            if(people[i]+people[j] <= limit){
                i++;
                j--;
                noBoats++;
            } else {
                j--;
                noBoats++;
            }
        }
        return noBoats;
    }
}
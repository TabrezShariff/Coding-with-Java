// This is 2 pointer approach to solve problem asking for maximum area within container stores more water
// Here, higher the width more the area & when lower the width, area is taken care by higher height

class MaxContainerArea {
    public int maxArea(int[] height) {
        int left=0, right=height.length-1;
        int maxArea=0;

        while(left<right){
            int length=findMin(height[left], height[right]);
            int breadth=right-left;
            int area=length*breadth;
            maxArea=findMax(maxArea, area);

            if(height[left] <= height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }

    public int findMin(int num1, int num2){
        if(num1<num2) return num1;
        return num2;
    }
    public int findMax(int num1, int num2){
        if(num1>num2) return num1;
        return num2;
    }
}

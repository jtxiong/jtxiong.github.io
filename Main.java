package com.company;
/**
* date: 2022/9/7 20:45<br/>
* @author: xjt <br/>
* @email: 2422450100@qq.com <br/>
* @since JDK 1.8
*/
public class Main {

    public  static int findmid(int a[],int left,int right)
    {
        int pivod=a[left];
        while (left<right)
        {
            while(a[right]>=pivod&&right>left)
                {right--;}
            a[left]=a[right];
            while(a[left]<=pivod&&right>left)
                {left++;}
            a[right]=a[left];
        }
        a[left]=pivod;
        return left;
    }
    public static void qsort(int a[],int left,int right)
    {
        if(left<right) {
            int mid = findmid(a, left, right);
            qsort(a, left, mid - 1);
            qsort(a, mid + 1, right);
        }

    }
    public static void main(String[] args) {
        System.out.println("原数组为");

	        int array[]={2,5,43,23,65,44,32,12,32,67};
        for(int i=0;i<10;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
            qsort(array,0,9);
        System.out.println("快速排序后数组为");
            for(int i=0;i<10;i++)
            {
                System.out.print(array[i]+" ");
            }
    }
}

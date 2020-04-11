/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*
        int level = 0;
        int firstVal = l1.val*level*10;
        int secondVal = l2.val*level*10;
        
        while(l1.next!=null){
            l1 = l1.next;
            level++;
            firstVal+=l1.val*level*10;
        }
        level = 0;
        while(l2.next!=null){
            l2 = l2.next;
            level++;
            secondVal+=l2.val*level*10;
        }
        
        int sumVal = firstVal+secondVal;
        
        ListNode sum = new ListNode(sumVal%10);
        sumVal = (sumVal-(sumVal%10))/10;
        while(sumVal>=10){
            sum.next = new ListNode(sumVal%10);
            sumVal = (sumVal-(sumVal%10))/10;
        }
        
        return sum;
        */
        
        int sumVal = l1.val+l2.val;
        int addup = 0;
        if(sumVal>=10){
            addup = 1;
            sumVal-=10;
        }
        ListNode sum = new ListNode(sumVal);
        ListNode current = sum;
        
        while((l1.next!=null)||(l2.next!=null)||(addup==1)){
            //ListNode next = new ListNode(0);
            current.next = new ListNode(0);
            current = current.next;
            if(addup==1){
                current.val+=1;
                addup=0;
            }
            
            //case 1, both have next node
            if((l1.next!=null)&&(l2.next!=null)){
                l1 = l1.next;
                l2 = l2.next;
                sumVal = l1.val+l2.val+current.val;
                if(sumVal>=10){
                    addup = 1;
                    sumVal-=10;
                }
                current.val = sumVal;
                continue;
            }
            
            //case 2, only one has next node
            else if((l1.next!=null)&&(l2.next==null)){
                l1 = l1.next;
                sumVal = l1.val+current.val;
                if(sumVal>=10){
                    addup = 1;
                    sumVal-=10;
                }
                current.val = sumVal;
                continue;
            }
            
            
            //case 3, only the other has next node
            else if((l2.next!=null)&&(l1.next==null)){
                l2 = l2.next;
                sumVal = l2.val+current.val;
                if(sumVal>=10){
                    addup = 1;
                    sumVal-=10;
                }
                current.val = sumVal;
                continue;
            }
           
            
        
            
            
        }
        
        return sum;
    }
}

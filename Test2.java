package practice0818;

public class Test2 {

    static class Node{
        int date;
        Node next;

        public Node(int date){
            this.date = date;
        }
    }


    public static int solve(int n,int m){
        if(m == 1 || n<2){
            return n;
        }
        Node head = createLinkedList(n);
        int count = 1;
        Node cur = head;
        Node pre = null;
        while(true){
            //当剩下两个节点时，不能用pre.next = cur.next，会死循环
            if(cur.next == pre && m == 3){
                pre = cur.next;
                break;
            }
            if(count == m){
                count = 1;
                pre.next = cur.next;
                cur = pre.next;
            }else{
                count++;
                pre = cur;
                cur = cur.next;
            }
        }
        return pre.date;
    }

    public static Node createLinkedList(int n){
        Node head = new Node(1);
        Node next = head;
        for(int i = 2;i<=n;i++){
            Node tmp = new Node(i);
            next.next = tmp;
            next = next.next;
        }
        //头尾串联
        next.next = head;
        return head;
    }

    public static void main(String[] args) {
        int a = solve(52,3);
        System.out.println(a);
    }

}



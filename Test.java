package practice0818;

public class Test {
    private static Integer compute(Integer n, Integer m) {
        Boolean[] peopleFlags = new Boolean[n];
        for (int i = 0; i < n; i++) {
            peopleFlags[i] = true;
        }
        int peopleLeft = n; //剩下的人数
        int count = 0; //计数器，每过一个人加一，加到m时归零
        int index = 0; //开始下标

        while (peopleLeft > 1) {
            if (peopleFlags[index]) {
                count++;

                if (count == m) {
                    count = 0;
                    peopleFlags[index] = false;
                    peopleLeft--;
                }
            }
            index++;

            //当当前人等于总人数时，则又从第一人开始计数
            if (index == n) {
                index = 0;
            }
        }

        for (int j = 0; j < n; j++) {
            if (peopleFlags[j]) {
                return j + 1;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int n = 52;
        int m = 3;
        Integer winner = compute(n, m);
        System.out.println(winner);
    }
}

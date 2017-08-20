package zhenti2017.lianjia;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 输入n门课，r课程满分，avg平均分没门达到
 * 后面输入n行：dii门的分数，以及提高1分需要的祝福值  求最少花费的祝福值
 *
 * 输入：
 * 5 5 4
 * 5 2
 * 4 7
 * 3 1
 * 3 2
 * 2 5
 * 输出
 * 4
 * Created by xl on 2017/8/19.
 */
public class num_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int avg = scanner.nextInt();
        Node[] nodes = new Node[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            int magic = scanner.nextInt();
            nodes[i] = new Node(score, magic);
            sum += nodes[i].score;
        }

        int curAvg = sum / n; // 得分平均

        if (curAvg > r) { // 平均分大于要求的
            System.out.println(0);
            return;
        }

        // 否则计算需要多少分才能达到平均分
        int neededScore = avg * n - sum;

        System.out.println("neededScore = " + neededScore);

        Arrays.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.magic == o2.magic){
                    return o1.score - o2.score;
                }
                return o1.magic - o2.magic;
            }
        });

        int magicValue = 0;

        for (int i = 0; i < n; i++) {
            if (neededScore <= 0) break;
            if (nodes[i].score < r) {
                while (nodes[i].score < r) {
                    magicValue += nodes[i].magic;
                    nodes[i].score++;
                    neededScore--;
                    if(neededScore <= 0)break;
                }
            }
        }

        System.out.println(magicValue);
    }

    static class Node {
        int score;
        int magic;

        public Node(int score, int magic) {
            this.score = score;
            this.magic = magic;
        }
    }

}

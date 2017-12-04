package zhenti2017.xunfei;

import java.util.*;

/**
 * Created by xl on 2017/9/16.
 */
public class num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int teamNum = Integer.parseInt(scanner.nextLine());
            Map<String, Team> teamMap = new HashMap<>();
            for (int i = 0; i < teamNum; i++) {
                String teamName = scanner.nextLine();
                teamMap.put(teamName, new Team(0, 0, teamName, i));
            }

            for (int i = 0; i < teamNum * (teamNum - 1) / 2; i++) {
                String contest = scanner.nextLine();
                String[] split = contest.split(" ");
                String teams = split[0];
                String victor = split[1];
                String[] teamNames = teams.split("-");
                String[] victors = victor.split(":");
                if (Integer.parseInt(victors[0]) > Integer.parseInt(victors[1])) {
                    Team team = teamMap.get(teamNames[0]);
                    teamMap.get(teamNames[0]).setScore(team.getScore() + 3);
                } else if (Integer.parseInt(victors[0]) < Integer.parseInt(victors[1])) {
                    Team team = teamMap.get(teamNames[1]);
                    teamMap.get(teamNames[1]).setScore(team.getScore() + 3);
                } else {
                    Team team1 = teamMap.get(teamNames[0]);
                    teamMap.get(teamNames[0]).setScore(team1.getScore() + 1);
                    Team team2 = teamMap.get(teamNames[1]);
                    teamMap.get(teamNames[1]).setScore(team2.getScore() + 1);
                }
            }

            List<Team> teamList = new ArrayList<>();
            Iterator iterator = teamMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                Team team = (Team) entry.getValue();
                teamList.add(team);
            }

            Collections.sort(teamList, new Comparator<Team>() {
                @Override
                public int compare(Team o1, Team o2) {
                    if (o1.getScore() == o2.getScore()) {
                        return o2.getPureWin() - o1.getPureWin();
                    }
                    return o2.getScore() - o1.getScore();
                }
            });

            String[] teams = new String[teamNum / 2];

            for (int i = 0; i < teamNum / 2; i++) {
                teams[i] = teamList.get(i).getTeamName();
            }

            Arrays.sort(teams);

            for (int i = 0; i < teamNum / 2; i++) {
                System.out.println(teams[i]);
            }
        }
    }

    static class Team {
        private int score;
        private int pureWin;
        private String teamName;
        private int teamId; // 好像没用

        public Team(int score, int pureWin, String teamName, int teamId) {
            this.score = score;
            this.pureWin = pureWin;
            this.teamName = teamName;
            this.teamId = teamId;
        }

        public int getTeamId() {
            return teamId;
        }

        public void setTeamId(int teamId) {
            this.teamId = teamId;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getPureWin() {
            return pureWin;
        }

        public void setPureWin(int pureWin) {
            this.pureWin = pureWin;
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }
    }


}

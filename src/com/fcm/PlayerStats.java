package com.fcm;

public class PlayerStats {
    private Positions position;
    private int overall;
    private int goalkeeping;
    private int sprint;
    private int passing;
    private int scoring;
    private int defending;
    private int dribbling;
    private int longBalls;

    public PlayerStats(Positions position) {
        this.position = position;
    }

    public PlayerStats(Positions position, int overall, int goalkeeping, int sprint, int passing, int scoring, int defending, int dribbling, int longBalls) {
        this.position = position;
        this.overall = validateStat(overall);
        this.goalkeeping = validateStat(goalkeeping);
        this.sprint = validateStat(sprint);
        this.passing = validateStat(passing);
        this.scoring = validateStat(scoring);
        this.defending = validateStat(defending);
        this.dribbling = validateStat(dribbling);
        this.longBalls = validateStat(longBalls);
    }

    private int validateStat(int stat) {
        return (stat > 0 && stat <= 100) ? stat : 50;
    }

    @Override
    public String toString() {
        return "PlayerStats{" +
                "position=" + position +
                ", overall=" + overall +
                ", goalkeeping=" + goalkeeping +
                ", sprint=" + sprint +
                ", passing=" + passing +
                ", scoring=" + scoring +
                ", defending=" + defending +
                ", dribbling=" + dribbling +
                ", longBalls=" + longBalls +
                '}';
    }
}

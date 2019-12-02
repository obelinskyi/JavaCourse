package basic3;

public final class NdsLaneGroup {

    private final int laneGroupId;
    private final int laneCount;


    public NdsLaneGroup(int laneGroupId, int laneCount) {
        this.laneGroupId = laneGroupId;
        this.laneCount = laneCount;
    }

    public final int getLaneGroupId() {
        return laneGroupId;
    }

    public final int getLaneCount() {
        return laneCount;
    }
}

package basic3;

public class NdsLaneGroupFactoryImpl implements NdsLaneGroupFactory {
    @Override
    public NdsLaneGroup create(int laneGroupId, int laneCount) {
        return new NdsLaneGroup(laneGroupId, laneCount);
    }
}

public class SuddenAccelModel {
    public float accelPressure;
    public float moveRange;
    public float moveTimer;
    //input gps data

    public SuddenAccelModel()
    {
        accelPressure = 0;
        moveRange = 0;
        moveTimer = 0;
    }
    public SuddenAccelModel(SuddenAccelModel data)
    {
        accelPressure = data.accelPressure;
        moveRange = data.moveRange;
        moveTimer = data.moveTimer;
    }
}

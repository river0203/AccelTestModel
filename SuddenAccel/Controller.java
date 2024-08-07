public class Controller {
    public SuddenAccelModel data;
    public float moveSpeed;

    public Controller()
    {
        data = new SuddenAccelModel();
    }

    public float calculSpeed(SuddenAccelModel data)
    {
        moveSpeed = data.moveRange / data.moveTimer;
        return moveSpeed;
    }
}

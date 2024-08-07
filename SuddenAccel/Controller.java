public class Controller implements Runnable{
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

    @Override
    public void run() {
        while (true)
        {
            try {
                Thread.sleep(1000);	// 1초
            } catch (Exception e) {
                e.printStackTrace();
            }

            data.moveTimer +=1;
            System.out.println(data.moveTimer);

            if(data.moveTimer > 6.0466176e+17)
            {
                System.out.println("Break Time");
                break;
            }
        }
    }
}

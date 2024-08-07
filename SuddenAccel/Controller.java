public class Controller implements Runnable{
    public SuddenAccelModel data;
    public float moveSpeed;

    public Controller()
    {
        data = new SuddenAccelModel();
    }

    public float calculSpeed(SuddenAccelModel data)
    {
        moveSpeed = data.moveRange / (data.moveTimer/3600);
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

            //타아머는 늘어나는 데 속도는 변하지 않음

            data.moveRange +=1;
            data.moveTimer +=1;
            System.out.println("타이머 " + data.moveTimer);

            System.out.println("현재속도 " + calculSpeed(data));
            if(data.moveTimer > 6.0466176e+17)
            {
                System.out.println("Break Time");
                break;
            }
        }
    }
}

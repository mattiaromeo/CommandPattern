public class Client {
    public static void main(String[] args) {
        //initializer new invoker object
        InvokerRemoteControl remotecontrol = new InvokerRemoteControl();
        //initialize new Receiver object
        ReceiverTv myTv = new ReceiverTv();
        //initialize new command object
        Command tvOn = new ConcreteCommandTurnOnTv();
        Command tvOff = new ConcreteCommandTurnOffTv();
        //execute the command
        remotecontrol.setCommand(tvOn);
        remotecontrol.pressButton();

    }
}

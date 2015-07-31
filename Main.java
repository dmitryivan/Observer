public class Main
{
    public static void main(String[] args)
    {
        DataSender sender1 = new DataSender();
        DataSender sender2 = new DataSender();

        DataUser user1 = new DataUser();

        sender1.registerObserver (user1);
        sender2.registerObserver (user1);
        
        sender1.setData(29);
        sender2.setData(99);
        sender1.setData(39);
    }
}

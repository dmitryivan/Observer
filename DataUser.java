class DataUser implements Observer
{
    public DataUser() {}
    
    @Override
    public void update(int data) {
        System.out.println("Новое значение: " + data);
    }
}

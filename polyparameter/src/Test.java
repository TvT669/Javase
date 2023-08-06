public class Test {
    public static void main(String[] args) {
        OrEmployee Anna = new OrEmployee("Anna", 3000.0);
        Manager Eric = new Manager("Eric", 4500.0, 800.0);
        Test  e = new Test ();
        e.showEmpAnnual(Anna);
        e.showEmpAnnual(Eric);
        e.show(Anna);
        e.show(Eric);
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getName()+"年薪 "+ e.getAnnual());
    }
    public void show(Employee e){
        if(e instanceof OrEmployee){
            ((OrEmployee)e).work();
        }
        else if(e instanceof Manager){
            ((Manager)e).manage();
        }
    }

}

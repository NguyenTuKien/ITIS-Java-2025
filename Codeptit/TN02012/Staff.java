package TN02012;

public class Staff implements Comparable<Staff>{
    private final String id;
    private final String name;
    public final String dept;
    private final int salary;
    private final int days;

    public Staff(String id, String name, String dept, int salary, int days){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.days = days;
    }

    public int getTotal(){
        int years = Integer.parseInt(this.id.substring(1, 3));
        if(this.id.charAt(0) == 'A'){
            if(years > 15) return 20 *  this.salary * this.days;
            else if (years > 8) return 14 *  this.salary * this.days;
            else if (years > 3) return 12 *  this.salary * this.days;
            else return 10 * this.salary * this.days;
        }
        if(this.id.charAt(0) == 'B'){
            if(years > 15) return 16 *  this.salary * this.days;
            else if (years > 8) return 13 *  this.salary * this.days;
            else if (years > 3) return 11 *  this.salary * this.days;
            else return 10 *  this.salary * this.days;
        }
        if(this.id.charAt(0) == 'C'){
            // 14 12 11 9
            if (years > 15) return 14 *  this.salary * this.days;
            else if (years > 8) return 12 *  this.salary * this.days;
            else if (years > 3) return 10 *  this.salary * this.days;
            else  return 9 *  this.salary * this.days;
        }
        else {
            //13 11 9 8
            if (years > 15) return 13 *  this.salary * this.days;
            else if (years > 8) return 11 *  this.salary * this.days;
            else if (years > 3) return 9 *  this.salary * this.days;
            else  return 8 *  this.salary * this.days;
        }
    }

    @Override
    public int compareTo(Staff o) {
        return o.getTotal() - this.getTotal();
    }

    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.dept + " " + Integer.toString(this.getTotal()) + "000";
    }
}

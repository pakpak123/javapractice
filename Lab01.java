
public class Lab01 {
    public static void main(String[] args) {
        int population = 312032486;
        int year = 365*24*60*60;
        int birth = 7;
        birth = year/7;
        int death = 13;
        death = year/13;
        int immigrant = 45;
        immigrant = year/45;
        System.out.println("population of year1 is " + population);
        population = population + birth - death + immigrant;
        System.out.println("population of year2 is " + population);
        population = population + birth - death + immigrant;
        System.out.println("population of year3 is " + population);
        population = population + birth - death + immigrant;
        System.out.println("population of year4 is " + population);
        population = population + birth - death + immigrant;
        System.out.println("population of year5 is " + population);
    }
}

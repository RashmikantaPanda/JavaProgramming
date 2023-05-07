
/**
 * Create an Employee class having id, name and city.
 * Add 10 employee details.
 * Show the employee details by city name in reverse order.
 */
package com.java.questions.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    int id;
    String name;
    String city;

    public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
}
class CityComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        /**
         * If we have to sort by length of the city, we can write this
        Integer l1=o1.city.length();
        Integer l2=o2.city.length();
        return l1.compareTo(l2);
        */
        return o1.city.compareTo(o2.city);
    }

    @Override
    public Comparator<Employee> reversed() {
        return Comparator.super.reversed();
    }
}
public class SortEmpByCity {
    public static void main(String[] args) {
        Employee e1=new Employee(1001,"Rashmikanta","Bhubaneswar");
        Employee e2=new Employee(1201,"Barenya","Cuttack");
        Employee e3=new Employee(2015,"Jyoti","Kendrapara");
        Employee e4=new Employee(2315,"Priya","Puri");
        Employee e5=new Employee(1548,"Sourav","Blasore");
        Employee e6=new Employee(1022,"Surya","Kendrapara");
        Employee e7=new Employee(1015,"Umakanta","Nayagard");
        Employee e8=new Employee(1065,"Sumanta","Puri");
        Employee e9=new Employee(1098,"Sankar","Kalahandi");
        Employee e10=new Employee(1071,"Soumya","Bhubaneswar");
        List<Employee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        list.add(e9);
        list.add(e10);

        Collections.sort(list,new CityComparator().reversed());
        System.out.println("Sorting by City Name in Reverse Order");
        for (Employee e:list
        ) {
            System.out.println(e.id+" "+e.name+" "+e.city);
        }

    }


}

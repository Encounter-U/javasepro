package com.Encounter.manager;

/**
 * @author Encounter
 * @date 2024/6/15 20:29
 */
public class Coder
    {
        private String name;
        private int id;
        private double salary;

        public Coder()
            {
            }

        public Coder(String name, int id, double salary)
            {
                this.name = name;
                this.id = id;
                this.salary = salary;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public int getId()
            {
                return id;
            }

        public void setId(int id)
            {
                this.id = id;
            }

        public double getSalary()
            {
                return salary;
            }

        public void setSalary(double salary)
            {
                this.salary = salary;
            }
    }

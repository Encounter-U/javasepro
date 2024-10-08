package com.Encounter.teacher;

/**
 * @author Encounter
 * @date 2024/6/16 23:29
 */
public class Teacher
    {
        private String id;
        private String name;
        private int age;
        private String birthday;

        public Teacher(String id, String name, int age, String birthday)
            {
                this.id = id;
                this.name = name;
                this.age = age;
                this.birthday = birthday;
            }

        public Teacher()
            {
            }

        public String getId()
            {
                return id;
            }

        public void setId(String id)
            {
                this.id = id;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public int getAge()
            {
                return age;
            }

        public void setAge(int age)
            {
                this.age = age;
            }

        public String getBirthday()
            {
                return birthday;
            }

        public void setBirthday(String birthday)
            {
                this.birthday = birthday;
            }
    }

package com.Encounter.girlfriend;

/**
 * @author Encounter
 * @date 2024/6/15 20:17
 */
public class GirlFriend
    {
        private String name;
        private int height;
        private int weight;

        public GirlFriend()
            {
            }

        public GirlFriend(String name, int height, int weight)
            {
                this.name = name;
                this.height = height;
                this.weight = weight;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public int getHeight()
            {
                return height;
            }

        public void setHeight(int height)
            {
                this.height = height;
            }

        public int getWeight()
            {
                return weight;
            }

        public void setWeight(int weight)
            {
                this.weight = weight;
            }
    }

package com.Encounter.pdd;

/**
 * @author Encounter
 * @date 2024/6/16 22:09
 */
public class User
    {
        private String userName;//用户名
        private int totalAmount;//总金额
        private int bargain;//砍价金额

        public User()
            {
            }

        public User(String userName, int totalAmount, int bargain)
            {
                this.userName = userName;
                this.totalAmount = totalAmount;
                this.bargain = bargain;
            }

        public String getUserName()
            {
                return userName;
            }

        public void setUserName(String userName)
            {
                this.userName = userName;
            }

        public int getTotalAmount()
            {
                return totalAmount;
            }

        public void setTotalAmount(int totalAmount)
            {
                this.totalAmount = totalAmount;
            }

        public int getBargain()
            {
                return bargain;
            }

        public void setBargain(int bargain)
            {
                this.bargain = bargain;
            }
    }

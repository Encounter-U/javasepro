package com.Encounter.girlfriend;

/**
 * @author Encounter
 * @date 2024/6/15 20:19
 */
public class GirlFriendBehavior
    {
        GirlFriend girlFriend;
        public GirlFriendBehavior(GirlFriend girlFriend)
            {
                this.girlFriend=girlFriend;
            }
        public void wash()
            {
                System.out.println("女朋友帮我洗衣服");
            }
        public void cook()
            {
                System.out.println("女朋友给我做饭");
            }
        public void show()
            {
                System.out.println("我女朋友叫"+girlFriend.getName()+"，身高"+girlFriend.getHeight()+"cm，体重"+girlFriend.getWeight()+"斤");
            }
    }

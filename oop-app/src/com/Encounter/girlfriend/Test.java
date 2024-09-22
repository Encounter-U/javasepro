package com.Encounter.girlfriend;

/**
 * @author Encounter
 * @date 2024/6/15 20:23
 */

/**
 * 定义一个女朋友类。女朋友的属性包含:姓名，身高，体重。行为包含:洗衣服wash()，做饭cook()。另外定
 * 义一个用于展示三个属性值的show()方法。请在测试类中创建对象并赋值，然后分别调用展示方法、洗衣服方
 * 法和做饭方法。打印效果如下:<br/>
 * 我女朋友叫王禾佳,身高175厘米,体重120斤<br/>
 * 女朋友帮我洗衣服<br/>
 * 女朋友给我做饭
 */
public class Test
    {
        public static void main(String[] args)
            {
                GirlFriend gf = new GirlFriend("王禾佳", 170, 120);
                GirlFriendBehavior gfb = new GirlFriendBehavior(gf);
                gfb.cook();
                gfb.wash();
                gfb.show();
            }
    }

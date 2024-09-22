package com.Encounter.manager;

/**
 * @author Encounter
 * @date 2024/6/15 20:40
 */
public class Behavior
    {
        Coder coder;
        Manager manager;

        public Behavior(Coder coder)
            {
                this.coder = coder;
            }

        public Behavior(Manager manager)
            {
                this.manager = manager;
            }

        public void work()
            {
                System.out.println("工号为"+manager.getId()+"基本工资为"+manager.getSalary()+"奖金为"+manager.getBonus()+"的项目经理正在摸鱼。。。");
            }

    }

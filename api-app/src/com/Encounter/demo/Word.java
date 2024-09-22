package com.Encounter.demo;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/16 15:56
 */

/**
 * 创建一个空集合Arrayist集合存储字符串,在集合中依次添加一些字符串元素"(++”、"PHP"、"Java、"Python”、"Helo"。紧接着删除Hello字
 * 符串，再将"PHP"修改为"Go"，最后对集合进行遍历输出。
 */
public class Word
    {
        public static void main(String[] args)
            {
                ArrayList<String> word=new ArrayList<>();
                word.add("C++");
                word.add("PHP");
                word.add("Java");
                word.add("Python");
                word.add("Hello");
                word.remove("Hello");
                word.set(1,"Go");
                System.out.println(word);
            }
    }

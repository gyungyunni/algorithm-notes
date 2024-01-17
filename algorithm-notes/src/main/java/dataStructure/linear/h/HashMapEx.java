package dataStructure.linear.h;

import java.util.HashMap;

// 해시 테이블 보다 빠르고, null 키를 허용함
// key 값은 중복을 허용하지 않음. 값은 동일해도 됨
// 동기화되지 않아서 스레드로부터 안전하지 않음
public class HashMapEx {
    public static void main(String[] args) {
        // create hash map
        HashMap<String, Integer> hashMap = new HashMap<>();

        // insert data
        hashMap.put("apple", 5);
        hashMap.put("banana", 7);
        hashMap.put("cherry", 3);

        // data query
        System.out.println("apple: " + hashMap.get("apple"));
        System.out.println("banana: " + hashMap.get("banana"));
        System.out.println("grape: " + hashMap.get("grape"));

        // delete data
        hashMap.remove("apple");

        // HashMap output
        for (var entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
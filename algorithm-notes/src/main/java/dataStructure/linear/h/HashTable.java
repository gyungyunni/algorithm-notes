package dataStructure.linear.h;

import java.util.Hashtable;
import java.util.Map;

// 장점: 빠른 검색, 동적 크기 조정, null 허용 안함, hashmap보다 느림
// 동기화되아서 스레드로부터 안전함
public class HashTable {
    public static void main(String[] args) {
        // 해시 테이블 생성
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // 데이터 삽입
        hashtable.put("apple", 5);
        hashtable.put("banana", 7);
        hashtable.put("cherry", 3);

        // 데이터 조회
        System.out.println("apple: " + hashtable.get("apple"));
        System.out.println("banana: " + hashtable.get("banana"));
        System.out.println("grape: " + hashtable.get("grape"));

        // 데이터 삭제
        hashtable.remove("apple");

//        // 해시 테이블 출력
//        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }

        for (var entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
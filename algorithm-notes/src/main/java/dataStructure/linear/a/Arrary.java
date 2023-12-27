package dataStructure.linear.a;

import java.util.ArrayList;
import java.util.List;

public class Arrary {

        public static void main(String[] args) {
            // 빈 배열 생성
            ArrayList<Integer> myArrayList = new ArrayList<>();

            // 원소를 포함한 배열 생성
            ArrayList<Integer> myArrayListWithElements = new ArrayList<>(List.of(1, 2, 3, 4, 5));

            // 다차원 배열 생성
            ArrayList<ArrayList<Integer>> multiDimensionalArrayList = new ArrayList<>(List.of(
                    new ArrayList<>(List.of(1, 2, 3)),
                    new ArrayList<>(List.of(4, 5, 6)),
                    new ArrayList<>(List.of(7, 8, 9))
            ));

            // 배열의 길이(크기) 확인
            int arrayListSize = myArrayListWithElements.size();

            // 배열의 특정 원소에 접근
            int element = myArrayListWithElements.get(2); // 3번째 원소에 접근

            // 배열의 원소 변경
            myArrayListWithElements.set(0, 10); // 첫 번째 원소를 10으로 변경

            // 배열에 원소 추가
            myArrayList.add(6); // 배열에 6을 추가

            // 배열의 원소 삭제
            myArrayListWithElements.remove(2); // 3번째 원소 삭제

            // 배열 순회(iteration)
            for (int value : myArrayListWithElements) {
                System.out.println(value);
            }

            // 배열의 특정 원소 인덱스 찾기
            int index = myArrayListWithElements.indexOf(4); // 4의 인덱스를 찾음

            // 배열 슬라이싱
            ArrayList<Integer> subArrayList = new ArrayList<>(myArrayListWithElements.subList(1, 4)); // 2번째부터 4번째 원소까지 슬라이싱
        }
}

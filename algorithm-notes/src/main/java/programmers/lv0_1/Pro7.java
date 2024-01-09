package programmers.lv0_1;

public class Pro7 {
    public int func1(int humidity, int val_set){
        if(humidity < val_set)
            return 3;
        return 1;
    }

    public int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        return 5;
    }

    public int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
        return 0;
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func2(humidity);
        }
        else if(mode_type.equals("target")){
            answer = func1(humidity, val_set);

        }
        else if(mode_type.equals("minimum")){
            answer = func3(humidity, val_set);

        }

        return answer;
    }
    public static void main(String[] args) {
        Pro7 pro7 = new Pro7();

        // solution 메서드 호출
        int result = pro7.solution("auto", 23, 45);

        System.out.println(result);
    }
}
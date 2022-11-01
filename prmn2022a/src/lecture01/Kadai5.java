package lecture01;

public class Kadai5 {
    public static void main(String[] args) {

        int[] score = {41, 85, 72, 38, 80};

        for(int i = 0;i < score.length;i++){
            if(score[i] <= 100 && score[i] >= 90){
                System.out.println(i + "番 " + score[i] + "点 秀");
            }else if(score[i] < 90 && score[i] >= 80){
                System.out.println(i + "番 " + score[i] + "点 優");
            }else if(score[i] < 80 && score[i] >= 70){
                System.out.println(i + "番 " + score[i] + "点 良");
            }else if(score[i] < 70 && score[i] >= 60){
                System.out.println(i + "番 " + score[i] + "点 可");
            }else{
                System.out.println(i + "番 " + score[i] + "点 不可");
            }
        }

        int min = min(score);
        int max = max(score);
        double ave = average(score);

        System.out.println();
        System.out.println("最高点：" + max + "点");
        System.out.println("最低点：" + min + "点");
        System.out.println("平均点：" + ave + "点");

    }

    public static int min(int[] score){

        int min = 100;
        for(int value : score){
            if(min > value){
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] score){

        int max = 0;
        for(int value : score){
            if(max < value){
                max = value;
            }
        }
        return max;
    }

    public static double average(int[] score){

        double sum = 0;
        int n = score.length;
        for(int value : score){
            sum += value;
        }
        return sum / n;
    }

}

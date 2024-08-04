package mission;

public class Array {

    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] result1 = extendArrayAsPowerOfTwo(arr1);
        System.out.println(result1);

        int[] arr2 = {58, 172, 746, 89};
        int[] result2 = extendArrayAsPowerOfTwo(arr2);
        System.out.println(result2);

        int[] arr3 = {9, 8, 7};
        int[] result3 = extendArrayAsPowerOfTwo(arr3);
        System.out.println(result3);

        int[] arr4 = {11, 22, 33, 44, 55, 66, 77, 88,99, 1111,2222,333, 4444, 2222,333, 4444 ,2222,333, 4444, 2222,333, 4444, 2222,333, 4444};
        int[] result4 = extendArrayAsPowerOfTwo(arr4);
        System.out.println(result4);
    }

    public static int[] extendArrayAsPowerOfTwo(int[] arr){
        int length = arr.length;

        // arr의 길이가 이미 2의 정수 거듭제곱이라면 arr 그대로 반환
        if((length & (length - 1)) == 0){
            return arr;
        }

        // 추가해야 하는 0의 개수 계산
        int targetLength = 1;
        while (targetLength < length){
            targetLength *=2;
        }
        int numZeros = targetLength - length;

        // 0을 추가한 배열 반환
        int[] result = new int[targetLength];
        for (int i = 0; i < length; i++){
            result[i] = arr[i];
        }
        return result;
    }

    /**
     * arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
     * 정수 배열 arr이 매개변수로 받고 arr에 최소한의 개수로 0을 추가한 배열을 return 하는 함수를 만들어주세요.
     * ( 단, 이때 함수는 static으로 정의해야합니다. )
     */

}

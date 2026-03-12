package swing.ch11;

import java.util.Arrays;
import java.util.Random;

public class LottoRandomNumber {
    /**
     * SRP(single Responsibility principle) - 단일 책임 원침(5가지 원칙)
     * : 클래스는 하나의 책임만 가져야 한다.
     * - 즉 이클래스는 오직 로또 번호 생성 만 담당한다.
     *
     * @return
     *
     */

        static final int LOTTO_NUMBER_COUNT = 6;

        public int[] createNumber () {
            //[1] [1] [1] [1] [1] [1]
            // 1. 이중 for , while (set) , 셔플 {1, 2, 3, ~ 45}
            int[] lottoWinNum = new int[LOTTO_NUMBER_COUNT];
            Random random = new Random();
            for (int i = 0; i < lottoWinNum.length; i++) {
                // 1 ~ 45 사이의 랜덤 숫자 생성
                lottoWinNum[i] = random.nextInt(45) + 1;

                // 앞에서 이미 뽑은 숫자들과 중복 비교
                for (int j = 0; j < i; j++) {
                    // lottoWinNum[j] --> 0 --> [1]
                    // lottoWinNum[i] --> 0 --> [2]
                    if (lottoWinNum[j] == lottoWinNum[i]) {

                        // 중복 발견 시점 i 값을 되돌려서 같은 자리를 다시 뽑게 함
                        i--;
                        break;
                    }

                }

            }
            // 오름차순 정렬
            Arrays.sort(lottoWinNum); // 오름 차순 정렬이 기본값
            return lottoWinNum;

        } // end of createNumber


        public static void main (String[]args){
            LottoRandomNumber randomNumber = new LottoRandomNumber();
            int[] result = randomNumber.createNumber();

            for (int numb : result){
                System.out.println();


        }

    }


    }


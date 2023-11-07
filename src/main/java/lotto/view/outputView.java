package lotto.view;

import lotto.model.Lotto;

import java.util.List;

public class outputView {
    //발행된 로또 번호 출력
    public static void IssuedLottoNumbers(int amount, List<Lotto> lottos) {
        System.out.println(amount + "개를 구입했습니다.");
        for (Lotto lotto : lottos) {
            System.out.println(lotto);
        }
    }

    //당첨 내역 출력
    public static void LottoResults() {
        System.out.println("당첨 통계");
        System.out.println("---");

    }

    //총 수익률 출력
}

package view;

import camp.nextstep.edu.missionutils.Console;
import model.TryCount;
import utils.Utils;

public class InputView {
    static final String INPUT_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    static final String INPUT_TRY_COUNT = "시도할 횟수는 몇회인가요?";
    Utils utils = new Utils();

    public String requestCarNames() {
        System.out.println(INPUT_CAR_NAMES);
        String carNames = Console.readLine();
        return carNames;
    }

    public TryCount requestTryCount() {
        System.out.println(INPUT_TRY_COUNT);
        TryCount tryCount = new TryCount(Console.readLine());
        System.out.println();
        return tryCount;
    }


}

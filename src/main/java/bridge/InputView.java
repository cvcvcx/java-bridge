package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        String bridgeSize = Console.readLine();
        validateBridgeSize(bridgeSize);
        int result = Integer.parseInt(bridgeSize);
        return result;
    }

    private static void validateBridgeSize(String  bridgeSize) {
        try {
            Integer.parseInt(bridgeSize);
        }catch (Exception e){
            throw new IllegalArgumentException("[ERROR] 다리의 길이는 정수로 입력해 주십시오");
        }

        if(bridgeSize.length() <3|| bridgeSize.length() >20){
            throw new IllegalArgumentException("[ERROR] 다리의 길이는 3부터 20까지입니다.");
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        String playerMove = Console.readLine();

        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}

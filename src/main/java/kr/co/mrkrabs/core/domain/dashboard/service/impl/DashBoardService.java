package kr.co.mrkrabs.core.domain.dashboard.service.impl;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * <pre>
 *
 * 설명: 대시보드 Service Interface
 *
 * - 수정 이력 -
 * --------------------------------------------------------
 * [ 2022-04-07 applan I ] 최초 작성
 * --------------------------------------------------------
 * </pre>
 * @author applan
 * @version 1.0
 */
public interface DashBoardService {

    /**
     * <pre>
     *  다음 데이터를 반환
     *     1. 한달 수입
     *     2. 다음달 결제 금액
     *     3. 고정 지출 금액
     *     4. Flex 분류
     * </pre>
     * @param request - 반환된 값을 저장하기위한 Request 객체
     * @return 반환 값을 가지고있는 데이터
     */
    Map<String, Object> getHeaderData(HttpServletRequest request);

}

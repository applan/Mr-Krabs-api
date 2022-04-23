package kr.co.mrkrabs.core.domain.dashboard.service.impl;


import kr.co.mrkrabs.core.domain.dashboard.service.DashBoardService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * <pre>
 *
 * 설명: 대시보드 Service Implements
 *
 * - 수정 이력 -
 * --------------------------------------------------------
 * [ 2022-04-07 applan I ] 최초 작성
 * --------------------------------------------------------
 * </pre>
 * @author applan
 * @version 1.0
 */
@Service
public class DashBoardServiceImpl implements DashBoardService {

    @Override
    public Map<String, Object> getHeaderData(HttpServletRequest request){
        return null;
    }

}

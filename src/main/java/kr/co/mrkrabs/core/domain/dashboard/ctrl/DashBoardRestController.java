package kr.co.mrkrabs.core.domain.dashboard.ctrl;

import kr.co.mrkrabs.core.domain.dashboard.service.impl.DashBoardServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * <pre>
 *
 * 설명: 대시보드 로딩시 사용할 REST API Controller
 *
 * - 수정 이력 -
 * --------------------------------------------------------
 * [ 2022-04-07 applan I ] 최초 작성
 * --------------------------------------------------------
 * </pre>
 * @author applan
 * @version 1.0
 */
@RestController
@RequestMapping("/dashboard/get")
public class DashBoardRestController {

    DashBoardServiceImpl dashBoardServiceImpl;

    @GetMapping("/header")
    public Map<String, Object> getHeaderData(HttpServletRequest request) {
        return dashBoardServiceImpl.getHeaderData(request);
    }

}

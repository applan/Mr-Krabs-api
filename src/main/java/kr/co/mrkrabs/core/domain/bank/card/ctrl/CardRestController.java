package kr.co.mrkrabs.core.domain.bank.card.ctrl;

import kr.co.mrkrabs.core.global.dto.SearchDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <pre>
 *
 * 설명: 자산 관리 - 카드 관리
 *
 * - 수정 이력 -
 * --------------------------------------------------------
 * [ 2022-05-10 applan I ] 최초 작성
 * --------------------------------------------------------
 * </pre>
 * @author applan
 * @version 1.0
 */
@RestController
@RequestMapping("/card")
public class CardRestController {

    // 카드 목록 가져오기
    @GetMapping("/list")
    public Map<String, Object> getList(SearchDTO searchDTO){
        return null;
    }

}

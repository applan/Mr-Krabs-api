package kr.co.mrkrabs.core.global.dto;

import kr.co.mrkrabs.core.global.enumeration.SearchType;
import kr.co.mrkrabs.core.global.enumeration.SortType;
import lombok.*;
import org.springframework.data.domain.Sort.Direction;

/**
 * <pre>
 *
 * 설명: 다양한 화면에서 검색용으로 사용할 객체
 *
 * - 수정 이력 -
 * --------------------------------------------------------
 * [ 2022-04-23 applan I ] 최초 작성
 * --------------------------------------------------------
 * </pre>
 * @author applan
 * @version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
public class SearchDTO {

    private String query;
    private SearchType searchType;
    private Long page;
    private Long size;
    private SortType sortType;
    private Direction direction;

}

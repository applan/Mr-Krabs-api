package kr.co.mrkrabs.core.domain.category.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * <pre>
 *
 * 파일명: Category.java
 * 설명: 금액 사용처 카테고리 Entity ( 음식집 등등.. )
 * 필드:
 *      - id            : pk
 *      - type          : 사용처 타입
 *          - APPAREL : 의류비
 *          - ENTERTAINMENT : 문화비
 *          - HEALTH : 의료비
 *          - FOOD : 식비
 *          - LIVING : 생활비
 *          - HOUSING : 주거비
 *          - COMMUNICATION : 통신비
 *          - EDUCATION : 교육비
 *      - createDate    : 사용처 정보 추가일
 *      - updateDate    : 사용처 정보 수정일
 *
 * - 수정 이력 -
 * --------------------------------------------------------
 * [ 2022-03-24 applan I ] 최초 작성
 * --------------------------------------------------------
 * </pre>
 * @author applan
 * @version 1.0
 */
@Entity
@Getter
public class Category {

    enum Type {
        APPAREL,
        ENTERTAINMENT,
        HEALTH,
        FOOD,
        LIVING,
        HOUSING,
        COMMUNICATION,
        EDUCATION
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Type type;
    private Date createDate;
    private Date updateDate;


}

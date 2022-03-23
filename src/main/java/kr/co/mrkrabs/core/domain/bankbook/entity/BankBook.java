package kr.co.mrkrabs.core.domain.bankbook.entity;

import kr.co.mrkrabs.core.global.config.properties.MrCrabsProperties;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

/**
 * <pre>
 *
 * 파일명: BankBook.java
 * 설명: 통장 Entity
 * 필드:
 *      - id            : pk
 *      - name          : 통장 명
 *      - accountNumber : 통장 번호
 *      - order         : 순위
 *      - registerDate  : 통장 정보 등록일
 *      - updateDate    : 통장 정보 수정일
 *      - createDate    : 통장 생성일
 *
 * - 수정 이력 -
 * --------------------------------------------------------
 * [ 2022-03-23 applan I ] 최초 작성
 * --------------------------------------------------------
 * </pre>
 * @author applan
 * @version 1.0
 */
@Entity
@Getter
@Table(name = MrCrabsProperties.BANK_BOOK_TABLE_NAME)
public class BankBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String accountNumber;
    private Integer order;
    private Date registerDate;
    private Date updateDate;
    private Date createDate;

}

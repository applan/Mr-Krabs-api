package kr.co.mrkrabs.core.domain.card.entity;

import kr.co.mrkrabs.core.domain.bank.entity.Bank;
import kr.co.mrkrabs.core.domain.card.model.CardType;
import kr.co.mrkrabs.core.global.config.properties.MrCrabsProperties;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

/**
 * <pre>
 *
 * 파일명: Card.java
 * 설명: 카드 Entity
 * 필드:
 *      - id            : pk
 *      - name          : 카드 명
 *      - type          : 카드 타입 ( 신용 | 체크 )
 *      - cardNumber    : 카드 번호
 *      - order         : 순위
 *      - registerDate  : 카드 정보 등록일
 *      - updateDate    : 카드 정보 수정일
 *      - createDate    : 카드 생성일
 *      - bank          : 가입 은행
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
@Table(name = MrCrabsProperties.CARD_TABLE_NAME)
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private CardType type;
    private String cardNumber;
    private Integer order;
    private Date registerDate;
    private Date updateDate;
    private Date createDate;

//    @OneToOne
//    @JoinColumn(name = "bank_id")
//    private Bank bank;
}

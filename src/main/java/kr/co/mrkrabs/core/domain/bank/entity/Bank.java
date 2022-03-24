package kr.co.mrkrabs.core.domain.bank.entity;

import kr.co.mrkrabs.core.global.config.MrCrabsProjectConfig;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

/**
 * <pre>
 *
 * 파일명: Bank.java
 * 설명: 은행 Entity
 * 필드:
 *      - id            : pk
 *      - name          : 은행 명
 *      - order         : 순위
 *      - createDate    : 은행 정보 추가일
 *      - updateDate    : 은행 정보 수정일
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
@Table(name = MrCrabsProjectConfig.BANK_TABLE_NAME)
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private Integer order;
    private Date createDate;
    private Date updateDate;
}

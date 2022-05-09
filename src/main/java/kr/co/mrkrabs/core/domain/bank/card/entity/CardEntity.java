package kr.co.mrkrabs.core.domain.bank.card.entity;

import kr.co.mrkrabs.core.global.constant.ProjectDBConstant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <pre>
 *
 * 설명: 자산 관리 - 카드 관리 - 카드(Entity)
 *
 * - 수정 이력 -
 * --------------------------------------------------------
 * [ 2022-05-10 applan I ] 최초 작성
 * --------------------------------------------------------
 * </pre>
 * @author applan
 * @version 1.0
 */
@Entity
@Table(name = ProjectDBConstant.CARD)
public class CardEntity {

    @Id
    private Integer cardIdx;


}

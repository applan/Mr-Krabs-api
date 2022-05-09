package kr.co.mrkrabs.core.domain.bank.card.dao.Impl;

import kr.co.mrkrabs.core.domain.bank.card.entity.CardEntity;
import kr.co.mrkrabs.core.global.dto.SearchDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <pre>
 *
 * 설명: 자산 관리 - 카드 관리 - DAO(Interface)
 *
 * - 수정 이력 -
 * --------------------------------------------------------
 * [ 2022-05-10 applan I ] 최초 작성
 * --------------------------------------------------------
 * </pre>
 * @author applan
 * @version 1.0
 */
@Repository
public interface CardDao {

    public List<CardEntity> getList(SearchDTO searchDTO);

}

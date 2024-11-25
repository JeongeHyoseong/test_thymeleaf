package egovframework.example.dao;

import egovframework.example.vo.FaqManageDefaultVO;
import egovframework.example.vo.FaqManageVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * FAQ를 처리하는 DAO 인터페이스
 * Spring Boot 변환 버전
 * 
 * @since 2009.04.01
 * @version 1.1
 */
@Mapper
public interface FaqManageDAO {

    /**
     * FAQ 글 목록에 대한 상세내용을 조회한다.
     * 
     * @param vo 조회할 FAQ 정보
     * @return 조회한 FAQ
     * @throws Exception 예외
     */
    FaqManageVO selectFaqListDetail(FaqManageVO vo) throws Exception;

    /**
     * FAQ 조회수를 수정한다.
     * 
     * @param vo 수정할 FAQ 정보
     * @throws Exception 예외
     */
    void updateFaqInqireCo(FaqManageVO vo) throws Exception;

    /**
     * FAQ 글 목록을 조회한다.
     * 
     * @param searchVO 검색 조건
     * @return 글 목록
     * @throws Exception 예외
     */
    List<FaqManageVO> selectFaqList(FaqManageDefaultVO searchVO) throws Exception;

    /**
     * FAQ 글 총 갯수를 조회한다.
     * 
     * @param searchVO 검색 조건
     * @return 글 총 갯수
     */
    int selectFaqListTotCnt(FaqManageDefaultVO searchVO);

    /**
     * FAQ 글을 등록한다.
     * 
     * @param vo 등록할 FAQ 정보
     * @throws Exception 예외
     */
    void insertFaqCn(FaqManageVO vo) throws Exception;

    /**
     * FAQ 글을 수정한다.
     * 
     * @param vo 수정할 FAQ 정보
     * @throws Exception 예외
     */
    void updateFaqCn(FaqManageVO vo) throws Exception;

    /**
     * FAQ 글을 삭제한다.
     * 
     * @param vo 삭제할 FAQ 정보
     * @throws Exception 예외
     */
    void deleteFaqCn(FaqManageVO vo) throws Exception;
}
package egovframework.example.service;

import egovframework.example.vo.FaqManageVO;
import egovframework.example.vo.FaqManageDefaultVO;

import java.util.List;

/**
 * FAQ를 처리하는 서비스 인터페이스
 * Spring Boot 변환 버전
 * 
 * @since 2009.04.01
 * @version 1.1
 */
public interface EgovFaqManageService {

    /**
     * FAQ 글을 조회한다.
     * 
     * @param vo FaqManageVO
     * @return 조회한 글
     * @throws Exception 예외
     */
    FaqManageVO selectFaqListDetail(FaqManageVO vo) throws Exception;

    /**
     * 조회수를 수정한다.
     * 
     * @param vo FaqManageVO
     * @throws Exception 예외
     */
    void updateFaqInqireCo(FaqManageVO vo) throws Exception;

    /**
     * FAQ 글 목록을 조회한다.
     * 
     * @param searchVO FaqManageDefaultVO
     * @return 글 목록
     * @throws Exception 예외
     */
    List<?> selectFaqList(FaqManageDefaultVO searchVO) throws Exception;

    /**
     * FAQ 글 총 갯수를 조회한다.
     * 
     * @param searchVO FaqManageDefaultVO
     * @return 글 총 갯수
     */
    int selectFaqListTotCnt(FaqManageDefaultVO searchVO);

    /**
     * FAQ 글을 등록한다.
     * 
     * @param vo FaqManageVO
     * @throws Exception 예외
     */
    void insertFaqCn(FaqManageVO vo) throws Exception;

    /**
     * FAQ 글을 수정한다.
     * 
     * @param vo FaqManageVO
     * @throws Exception 예외
     */
    void updateFaqCn(FaqManageVO vo) throws Exception;

    /**
     * FAQ 글을 삭제한다.
     * 
     * @param vo FaqManageVO
     * @throws Exception 예외
     */
    void deleteFaqCn(FaqManageVO vo) throws Exception;
}

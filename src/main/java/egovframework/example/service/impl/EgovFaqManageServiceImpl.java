package egovframework.example.service.impl;

import egovframework.example.dao.FaqManageDAO;
import egovframework.example.service.EgovFaqManageService;
import egovframework.example.vo.FaqManageDefaultVO;
import egovframework.example.vo.FaqManageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;

import java.util.List;

/**
 * FAQ를 처리하는 비즈니스 구현 클래스
 * Spring Boot 변환 버전
 * 
 * @since 2009.04.01
 * @version 1.1
 */
@Service
public class EgovFaqManageServiceImpl implements EgovFaqManageService {

    @Autowired
    private FaqManageDAO faqManageDAO;

    @Autowired
    private EgovIdGnrService idgenService; // ID 생성 서비스는 Spring Boot의 커스텀 서비스로 변경

    /**
     * FAQ 글을 조회한다.
     * 
     * @param vo 조회할 정보가 담긴 FaqManageVO
     * @return 조회한 글
     * @throws Exception 예외
     */
    @Override
    public FaqManageVO selectFaqListDetail(FaqManageVO vo) throws Exception {
        FaqManageVO resultVO = faqManageDAO.selectFaqListDetail(vo);
        if (resultVO == null) {
            throw new IllegalArgumentException("info.nodata.msg"); // 예외 처리 방식을 Java 표준으로 변경
        }
        return resultVO;
    }

    /**
     * FAQ 조회수를 수정한다.
     * 
     * @param vo 조회수 수정 정보가 담긴 FaqManageVO
     * @throws Exception 예외
     */
    @Override
    public void updateFaqInqireCo(FaqManageVO vo) throws Exception {
        faqManageDAO.updateFaqInqireCo(vo);
    }

    /**
     * FAQ 글 목록을 조회한다.
     * 
     * @param searchVO 검색 조건이 담긴 FaqManageDefaultVO
     * @return 글 목록
     * @throws Exception 예외
     */
    @Override
    public List<?> selectFaqList(FaqManageDefaultVO searchVO) throws Exception {
        return faqManageDAO.selectFaqList(searchVO);
    }

    /**
     * FAQ 글 총 갯수를 조회한다.
     * 
     * @param searchVO 검색 조건이 담긴 FaqManageDefaultVO
     * @return 글 총 갯수
     */
    @Override
    public int selectFaqListTotCnt(FaqManageDefaultVO searchVO) {
        return faqManageDAO.selectFaqListTotCnt(searchVO);
    }

    /**
     * FAQ 글을 등록한다.
     * 
     * @param vo 등록할 FAQ 정보가 담긴 FaqManageVO
     * @throws Exception 예외
     */
    @Override
    public void insertFaqCn(FaqManageVO vo) throws Exception {
        String faqId = idgenService.getNextStringId();
        vo.setFaqId(faqId);
        faqManageDAO.insertFaqCn(vo);
    }

    /**
     * FAQ 글을 수정한다.
     * 
     * @param vo 수정할 FAQ 정보가 담긴 FaqManageVO
     * @throws Exception 예외
     */
    @Override
    public void updateFaqCn(FaqManageVO vo) throws Exception {
        faqManageDAO.updateFaqCn(vo);
    }

    /**
     * FAQ 글을 삭제한다.
     * 
     * @param vo 삭제할 FAQ 정보가 담긴 FaqManageVO
     * @throws Exception 예외
     */
    @Override
    public void deleteFaqCn(FaqManageVO vo) throws Exception {
        faqManageDAO.deleteFaqCn(vo);
    }
}

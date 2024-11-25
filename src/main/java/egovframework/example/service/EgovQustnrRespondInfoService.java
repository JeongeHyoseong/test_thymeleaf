package egovframework.example.service;

import egovframework.example.vo.ComDefaultVO;
import egovframework.example.vo.QustnrRespondInfoVO;

import java.util.List;
import java.util.Map;

/**
 * 설문조사 Service 인터페이스
 * Spring Boot 변환 버전
 * 
 * @since 2009.03.20
 * @version 1.1
 */
public interface EgovQustnrRespondInfoService {

    /**
     * 설문 템플릿을 조회한다.
     * 
     * @param params 조회할 정보가 담긴 Map
     * @return 템플릿 목록
     * @throws Exception 예외
     */
    List<?> selectQustnrTmplatManage(Map<?, ?> params) throws Exception;

    /**
     * 객관식 통계를 조회한다.
     * 
     * @param params 조회할 정보가 담긴 Map
     * @return 통계 목록
     * @throws Exception 예외
     */
    List<?> selectQustnrRespondInfoManageStatistics1(Map<?, ?> params) throws Exception;

    /**
     * 주관식 통계를 조회한다.
     * 
     * @param params 조회할 정보가 담긴 Map
     * @return 통계 목록
     * @throws Exception 예외
     */
    List<?> selectQustnrRespondInfoManageStatistics2(Map<?, ?> params) throws Exception;

    /**
     * 회원 정보를 조회한다.
     * 
     * @param params 조회할 정보가 담긴 Map
     * @return 회원 정보
     * @throws Exception 예외
     */
    Map<?, ?> selectQustnrRespondInfoManageEmplyrinfo(Map<?, ?> params) throws Exception;

    /**
     * 설문 정보를 조회한다.
     * 
     * @param params 조회할 정보가 담긴 Map
     * @return 설문 정보
     * @throws Exception 예외
     */
    List<?> selectQustnrRespondInfoManageComtnqestnrinfo(Map<?, ?> params) throws Exception;

    /**
     * 문항 정보를 조회한다.
     * 
     * @param params 조회할 정보가 담긴 Map
     * @return 문항 목록
     * @throws Exception 예외
     */
    List<?> selectQustnrRespondInfoManageComtnqustnrqesitm(Map<?, ?> params) throws Exception;

    /**
     * 항목 정보를 조회한다.
     * 
     * @param params 조회할 정보가 담긴 Map
     * @return 항목 목록
     * @throws Exception 예외
     */
    List<?> selectQustnrRespondInfoManageComtnqustnriem(Map<?, ?> params) throws Exception;

    /**
     * 설문조사 목록을 조회한다.
     * 
     * @param searchVO 검색 조건
     * @return 설문조사 목록
     * @throws Exception 예외
     */
    List<?> selectQustnrRespondInfoManageList(ComDefaultVO searchVO) throws Exception;

    /**
     * 설문조사 목록의 총 건수를 조회한다.
     * 
     * @param searchVO 검색 조건
     * @return 총 건수
     * @throws Exception 예외
     */
    int selectQustnrRespondInfoManageListCnt(ComDefaultVO searchVO) throws Exception;

    /**
     * 응답자 결과 목록을 조회한다.
     * 
     * @param searchVO 검색 조건
     * @return 응답자 결과 목록
     * @throws Exception 예외
     */
    List<?> selectQustnrRespondInfoList(ComDefaultVO searchVO) throws Exception;

    /**
     * 응답자 결과를 상세 조회한다.
     * 
     * @param qustnrRespondInfoVO 응답자 정보
     * @return 응답자 상세 정보
     * @throws Exception 예외
     */
    List<?> selectQustnrRespondInfoDetail(QustnrRespondInfoVO qustnrRespondInfoVO) throws Exception;

    /**
     * 응답자 결과 목록의 총 건수를 조회한다.
     * 
     * @param searchVO 검색 조건
     * @return 총 건수
     * @throws Exception 예외
     */
    int selectQustnrRespondInfoListCnt(ComDefaultVO searchVO) throws Exception;

    /**
     * 응답자 결과를 등록한다.
     * 
     * @param qustnrRespondInfoVO 등록할 응답자 정보
     * @throws Exception 예외
     */
    void insertQustnrRespondInfo(QustnrRespondInfoVO qustnrRespondInfoVO) throws Exception;

    /**
     * 응답자 결과를 수정한다.
     * 
     * @param qustnrRespondInfoVO 수정할 응답자 정보
     * @throws Exception 예외
     */
    void updateQustnrRespondInfo(QustnrRespondInfoVO qustnrRespondInfoVO) throws Exception;

    /**
     * 응답자 결과를 삭제한다.
     * 
     * @param qustnrRespondInfoVO 삭제할 응답자 정보
     * @throws Exception 예외
     */
    void deleteQustnrRespondInfo(QustnrRespondInfoVO qustnrRespondInfoVO) throws Exception;
}
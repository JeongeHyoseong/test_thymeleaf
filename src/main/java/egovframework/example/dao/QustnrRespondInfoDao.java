package egovframework.example.dao;

import egovframework.example.vo.ComDefaultVO;
import egovframework.example.vo.QustnrRespondInfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 설문조사 DAO 인터페이스
 * Spring Boot 변환 버전
 * 
 * @since 2009.03.20
 * @version 1.1
 */
@Mapper
public interface QustnrRespondInfoDao {

    List<?> selectQustnrTmplatManage(Map<?, ?> map) throws Exception;

    List<?> selectQustnrRespondInfoManageStatistics1(Map<?, ?> map) throws Exception;

    List<?> selectQustnrRespondInfoManageStatistics2(Map<?, ?> map) throws Exception;

    Map<?, ?> selectQustnrRespondInfoManageEmplyrinfo(Map<?, ?> map) throws Exception;

    List<?> selectQustnrRespondInfoManageComtnqestnrinfo(Map<?, ?> map) throws Exception;

    List<?> selectQustnrRespondInfoManageComtnqustnrqesitm(Map<?, ?> map) throws Exception;

    List<?> selectQustnrRespondInfoManageComtnqustnriem(Map<?, ?> map) throws Exception;

    List<?> selectQustnrRespondInfoManageList(ComDefaultVO searchVO) throws Exception;

    int selectQustnrRespondInfoManageListCnt(ComDefaultVO searchVO) throws Exception;

    List<?> selectQustnrRespondInfoList(ComDefaultVO searchVO) throws Exception;

    List<?> selectQustnrRespondInfoDetail(QustnrRespondInfoVO qustnrRespondInfoVO) throws Exception;

    int selectQustnrRespondInfoListCnt(ComDefaultVO searchVO) throws Exception;

    void insertQustnrRespondInfo(QustnrRespondInfoVO qustnrRespondInfoVO) throws Exception;

    void updateQustnrRespondInfo(QustnrRespondInfoVO qustnrRespondInfoVO) throws Exception;

    void deleteQustnrRespondInfo(QustnrRespondInfoVO qustnrRespondInfoVO) throws Exception;
}

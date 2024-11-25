package egovframework.example.service.impl;

import egovframework.example.dao.QustnrRespondInfoDao;
import egovframework.example.service.EgovQustnrRespondInfoService;
import egovframework.example.vo.ComDefaultVO;
import egovframework.example.vo.QustnrRespondInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;

import java.util.List;
import java.util.Map;

/**
 * 설문조사 ServiceImpl Class 구현
 * Spring Boot 변환 버전
 * 
 * @since 2009.03.20
 * @version 1.1
 */
@Service
public class EgovQustnrRespondInfoServiceImpl implements EgovQustnrRespondInfoService {

    @Autowired
    private QustnrRespondInfoDao dao;

    @Autowired
    private EgovIdGnrService idgenService; // ID 생성 서비스

    @Override
    public List<?> selectQustnrTmplatManage(Map<?, ?> map) throws Exception {
        return dao.selectQustnrTmplatManage(map);
    }

    @Override
    public List<?> selectQustnrRespondInfoManageStatistics1(Map<?, ?> map) throws Exception {
        return dao.selectQustnrRespondInfoManageStatistics1(map);
    }

    @Override
    public List<?> selectQustnrRespondInfoManageStatistics2(Map<?, ?> map) throws Exception {
        return dao.selectQustnrRespondInfoManageStatistics2(map);
    }

    @Override
    public Map<?, ?> selectQustnrRespondInfoManageEmplyrinfo(Map<?, ?> map) throws Exception {
        return dao.selectQustnrRespondInfoManageEmplyrinfo(map);
    }

    @Override
    public List<?> selectQustnrRespondInfoManageComtnqestnrinfo(Map<?, ?> map) throws Exception {
        return dao.selectQustnrRespondInfoManageComtnqestnrinfo(map);
    }

    @Override
    public List<?> selectQustnrRespondInfoManageComtnqustnrqesitm(Map<?, ?> map) throws Exception {
        return dao.selectQustnrRespondInfoManageComtnqustnrqesitm(map);
    }

    @Override
    public List<?> selectQustnrRespondInfoManageComtnqustnriem(Map<?, ?> map) throws Exception {
        return dao.selectQustnrRespondInfoManageComtnqustnriem(map);
    }

    @Override
    public List<?> selectQustnrRespondInfoManageList(ComDefaultVO searchVO) throws Exception {
        return dao.selectQustnrRespondInfoManageList(searchVO);
    }

    @Override
    public int selectQustnrRespondInfoManageListCnt(ComDefaultVO searchVO) throws Exception {
        return dao.selectQustnrRespondInfoManageListCnt(searchVO);
    }

    @Override
    public List<?> selectQustnrRespondInfoList(ComDefaultVO searchVO) throws Exception {
        return dao.selectQustnrRespondInfoList(searchVO);
    }

    @Override
    public List<?> selectQustnrRespondInfoDetail(QustnrRespondInfoVO qustnrRespondInfoVO) throws Exception {
        return dao.selectQustnrRespondInfoDetail(qustnrRespondInfoVO);
    }

    @Override
    public int selectQustnrRespondInfoListCnt(ComDefaultVO searchVO) throws Exception {
        return dao.selectQustnrRespondInfoListCnt(searchVO);
    }

    @Override
	public void insertQustnrRespondInfo(QustnrRespondInfoVO qustnrRespondInfoVO) throws Exception {
		String sMakeId = idgenService.getNextStringId();

		qustnrRespondInfoVO.setQestnrQesrspnsId(sMakeId);

		dao.insertQustnrRespondInfo(qustnrRespondInfoVO);
	}
    
	/*
	 * @Override public void insertQustnrRespondInfo(QustnrRespondInfoVO
	 * qustnrRespondInfoVO) throws Exception { String generatedId =
	 * idgenService.generateId();
	 * qustnrRespondInfoVO.setQestnrQesrspnsId(generatedId);
	 * dao.insertQustnrRespondInfo(qustnrRespondInfoVO); }
	 */

    @Override
    public void updateQustnrRespondInfo(QustnrRespondInfoVO qustnrRespondInfoVO) throws Exception {
        dao.updateQustnrRespondInfo(qustnrRespondInfoVO);
    }

    @Override
    public void deleteQustnrRespondInfo(QustnrRespondInfoVO qustnrRespondInfoVO) throws Exception {
        dao.deleteQustnrRespondInfo(qustnrRespondInfoVO);
    }
}
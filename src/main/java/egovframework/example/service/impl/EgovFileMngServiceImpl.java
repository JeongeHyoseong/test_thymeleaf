package egovframework.example.service.impl;

import egovframework.example.dao.FileManageDAO;
import egovframework.example.service.EgovFileMngService;
import egovframework.example.vo.FileVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 파일정보 관리를 위한 구현 클래스
 * Spring Boot 변환 버전
 * 
 * @author
 * @since 2009.03.25
 * @version 1.1
 */
@Service
public class EgovFileMngServiceImpl implements EgovFileMngService {

    @Autowired
    private FileManageDAO fileMngDAO;

    @Override
    public void deleteFileInfs(List<?> fvoList) throws Exception {
        fileMngDAO.deleteFileInfs((List<FileVO>) fvoList);
    }
	/*
	 * @Override public void deleteFileInfs(List<?> fvoList) throws Exception {
	 * fileMngDAO.deleteFileInfs(fvoList); }
	 */

    @Override
    public String insertFileInf(FileVO fvo) throws Exception {
        String atchFileId = fvo.getAtchFileId();
        fileMngDAO.insertFileInf(fvo);
        return atchFileId;
    }

    @Override
    public String insertFileInfs(List<?> fileList) throws Exception {
        if (fileList == null || fileList.isEmpty()) {
            return null;
        }
        return fileMngDAO.insertFileInfs((List<FileVO>) fileList); // 타입 캐스팅 필요
    }
	/*
	 * @Override public String insertFileInfs(List<?> fvoList) throws Exception { if
	 * (fvoList.isEmpty()) { return null; } return
	 * fileMngDAO.insertFileInfs(fvoList); }
	 */

    @Override
    public List<FileVO> selectFileInfs(FileVO fvo) throws Exception {
        return fileMngDAO.selectFileInfs(fvo);
    }

    @Override
    public void updateFileInfs(List<?> fvoList) throws Exception {
        if (fvoList != null && !fvoList.isEmpty()) {
            fileMngDAO.updateFileInfs((List<FileVO>) fvoList); // 명시적 타입 캐스팅
        }
    }

    @Override
    public void deleteFileInf(FileVO fvo) throws Exception {
        fileMngDAO.deleteFileInf(fvo);
    }

    @Override
    public FileVO selectFileInf(FileVO fvo) throws Exception {
        return fileMngDAO.selectFileInf(fvo);
    }

    @Override
    public int getMaxFileSN(FileVO fvo) throws Exception {
        return fileMngDAO.getMaxFileSN(fvo);
    }

    @Override
    public void deleteAllFileInf(FileVO fvo) throws Exception {
        fileMngDAO.deleteAllFileInf(fvo);
    }

    @Override
    public Map<String, Object> selectFileListByFileNm(FileVO fvo) throws Exception {
        List<FileVO> result = fileMngDAO.selectFileListByFileNm(fvo);
        int cnt = fileMngDAO.selectFileListCntByFileNm(fvo);

        Map<String, Object> map = new HashMap<>();
        map.put("resultList", result);
        map.put("resultCnt", cnt);

        return map;
    }

    @Override
    public List<FileVO> selectImageFileList(FileVO vo) throws Exception {
        return fileMngDAO.selectImageFileList(vo);
    }
}
package egovframework.example.service;

import egovframework.example.vo.FileVO;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * 파일정보 관리를 위한 서비스 인터페이스
 * Spring Boot용 변환 버전
 * 
 * @author
 * @since 2009.03.25
 * @version 1.1
 */

public interface EgovFileMngService {

    /**
     * 파일에 대한 목록을 조회한다.
     * 
     * @param fvo 파일 VO
     * @return 파일 목록
     * @throws Exception 예외
     */
    List<FileVO> selectFileInfs(FileVO fvo) throws Exception;

    /**
     * 하나의 파일에 대한 정보(속성 및 상세)를 등록한다.
     * 
     * @param fvo 파일 VO
     * @return 파일 ID
     * @throws Exception 예외
     */
    String insertFileInf(FileVO fvo) throws Exception;

    /**
     * 여러 개의 파일에 대한 정보(속성 및 상세)를 등록한다.
     * 
     * @param fvoList 파일 VO 리스트
     * @return 파일 ID
     * @throws Exception 예외
     */
    String insertFileInfs(List<FileVO> fvoList) throws Exception;

    /**
     * 여러 개의 파일에 대한 정보(속성 및 상세)를 수정한다.
     * 
     * @param fvoList 파일 VO 리스트
     * @throws Exception 예외
     */
    void updateFileInfs(List<FileVO> fvoList) throws Exception;

    /**
     * 여러 개의 파일을 삭제한다.
     * 
     * @param fvoList 파일 VO 리스트
     * @throws Exception 예외
     */
    void deleteFileInfs(List<FileVO> fvoList) throws Exception;

    /**
     * 하나의 파일을 삭제한다.
     * 
     * @param fvo 파일 VO
     * @throws Exception 예외
     */
    void deleteFileInf(FileVO fvo) throws Exception;

    /**
     * 파일에 대한 상세정보를 조회한다.
     * 
     * @param fvo 파일 VO
     * @return 파일 상세 정보
     * @throws Exception 예외
     */
    FileVO selectFileInf(FileVO fvo) throws Exception;

    /**
     * 파일 구분자에 대한 최대값을 구한다.
     * 
     * @param fvo 파일 VO
     * @return 최대 파일 번호
     * @throws Exception 예외
     */
    int getMaxFileSN(FileVO fvo) throws Exception;

    /**
     * 전체 파일을 삭제한다.
     * 
     * @param fvo 파일 VO
     * @throws Exception 예외
     */
    void deleteAllFileInf(FileVO fvo) throws Exception;

    /**
     * 파일명 검색에 대한 목록을 조회한다.
     * 
     * @param fvo 파일 VO
     * @return 파일 목록 및 개수
     * @throws Exception 예외
     */
    Map<String, Object> selectFileListByFileNm(FileVO fvo) throws Exception;

    /**
     * 이미지 파일에 대한 목록을 조회한다.
     * 
     * @param vo 파일 VO
     * @return 이미지 파일 목록
     * @throws Exception 예외
     */
    List<FileVO> selectImageFileList(FileVO vo) throws Exception;
}

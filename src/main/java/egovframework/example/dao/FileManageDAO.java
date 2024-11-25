package egovframework.example.dao;

import egovframework.example.vo.FileVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 파일정보 관리를 위한 데이터 처리 클래스
 * Spring Boot 변환 버전
 * 
 * @author
 * @since 2009.03.25
 * @version 1.1
 */
@Mapper
public interface FileManageDAO {

    /** 여러 개의 파일에 대한 정보(속성 및 상세)를 등록한다. */
	String insertFileInfs(List<FileVO> fileList) throws Exception;

    /** 하나의 파일에 대한 정보(속성 및 상세)를 등록한다. */
    void insertFileInf(FileVO vo) throws Exception;

    /** 여러 개의 파일에 대한 정보(속성 및 상세)를 수정한다. */
    void updateFileInfs(List<FileVO> fileList) throws Exception;

    /** 여러 개의 파일을 삭제한다. */
    void deleteFileInfs(List<FileVO> fvoList) throws Exception;

    /** 하나의 파일을 삭제한다. */
    void deleteFileInf(FileVO fvo) throws Exception;

    /** 파일에 대한 목록을 조회한다. */
    List<FileVO> selectFileInfs(FileVO fvo) throws Exception;

    /** 파일 구분자에 대한 최대값을 구한다. */
    int getMaxFileSN(FileVO fvo) throws Exception;

    /** 파일에 대한 상세정보를 조회한다. */
    FileVO selectFileInf(FileVO fvo) throws Exception;

    /** 전체 파일을 삭제한다. */
    void deleteAllFileInf(FileVO fvo) throws Exception;

    /** 파일명 검색에 대한 목록을 조회한다. */
    List<FileVO> selectFileListByFileNm(FileVO fvo) throws Exception;

    /** 파일명 검색에 대한 목록 전체 건수를 조회한다. */
    int selectFileListCntByFileNm(FileVO fvo) throws Exception;

    /** 이미지 파일에 대한 목록을 조회한다. */
    List<FileVO> selectImageFileList(FileVO vo) throws Exception;
}

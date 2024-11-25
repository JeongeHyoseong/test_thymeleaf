package egovframework.example.service;

import java.util.Map;

import egovframework.example.vo.Board;
import egovframework.example.vo.BoardVO;

/**
 * 게시물 관리를 위한 서비스 인터페이스 클래스
 * Spring Boot 프로젝트용 변환 버전
 * 
 * @author
 * @since 2009.03.19
 * @version 1.1
 */
public interface EgovBBSManageService {

    /**
     * 게시물 한 건을 삭제한다.
     * 
     * @param board 게시물 정보
     * @throws Exception 예외
     */
    void deleteBoardArticle(Board board) throws Exception;

    /**
     * 방명록 내용을 삭제한다.
     * 
     * @param boardVO 방명록 정보
     * @throws Exception 예외
     */
    void deleteGuestList(BoardVO boardVO) throws Exception;

    /**
     * 방명록에 대한 패스워드를 조회한다.
     * 
     * @param board 게시물 정보
     * @return 패스워드 정보
     * @throws Exception 예외
     */
    String getPasswordInf(Board board) throws Exception;

    /**
     * 게시판에 게시물 또는 답변 게시물을 등록한다.
     * 
     * @param board 게시물 정보
     * @throws Exception 예외
     */
    void insertBoardArticle(Board board) throws Exception;

    /**
     * 게시물에 대한 상세 내용을 조회한다.
     * 
     * @param boardVO 게시물 정보
     * @return 게시물 상세 정보
     * @throws Exception 예외
     */
    BoardVO selectBoardArticle(BoardVO boardVO) throws Exception;

    /**
     * 조건에 맞는 게시물 목록을 조회한다.
     * 
     * @param boardVO 검색 조건
     * @param attrbFlag 속성 플래그
     * @return 게시물 목록
     * @throws Exception 예외
     */
    Map<String, Object> selectBoardArticles(BoardVO boardVO, String attrbFlag) throws Exception;

    /**
     * 방명록에 대한 목록을 조회한다.
     * 
     * @param boardVO 검색 조건
     * @return 방명록 목록
     * @throws Exception 예외
     */
    Map<String, Object> selectGuestList(BoardVO boardVO) throws Exception;

    /**
     * 게시물 한 건의 내용을 수정한다.
     * 
     * @param board 게시물 정보
     * @throws Exception 예외
     */
    void updateBoardArticle(Board board) throws Exception;
}

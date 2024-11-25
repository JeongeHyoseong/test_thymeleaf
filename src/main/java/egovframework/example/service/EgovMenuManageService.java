package egovframework.example.service;

import egovframework.example.vo.MenuManageVO;

import java.util.List;

/**
 * 메뉴 관리를 위한 서비스 인터페이스
 * Spring Boot 변환 버전
 * 
 * @since 2009.06.01
 * @version 1.1
 */
public interface EgovMenuManageService {

    /**
     * MainMenu Head Menu 조회
     * 
     * @param vo MenuManageVO
     * @return List
     * @throws Exception 예외
     */
    List<?> selectMainMenuHead(MenuManageVO vo) throws Exception;

    /**
     * MainMenu Head Left 조회
     * 
     * @param vo MenuManageVO
     * @return List
     * @throws Exception 예외
     */
    List<?> selectMainMenuLeft(MenuManageVO vo) throws Exception;

    /**
     * MainMenu Head MenuURL 조회
     * 
     * @param iMenuNo 메뉴 번호
     * @param sUniqId 사용자 고유 ID
     * @return String
     * @throws Exception 예외
     */
    String selectLastMenuURL(int iMenuNo, String sUniqId) throws Exception;

    /**
     * MainMenu Head Menu 조회 - Anonymous
     * 
     * @param vo MenuManageVO
     * @return List
     * @throws Exception 예외
     */
    List<?> selectMainMenuHeadByAuthor(MenuManageVO vo) throws Exception;

    /**
     * MainMenu Head Left 조회 - Anonymous
     * 
     * @param vo MenuManageVO
     * @return List
     * @throws Exception 예외
     */
    List<?> selectMainMenuLeftByAuthor(MenuManageVO vo) throws Exception;
}

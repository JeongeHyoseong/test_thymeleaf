package egovframework.example.dao;

import egovframework.example.vo.MenuManageVO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * 메뉴 관리 DAO 인터페이스
 * Spring Boot 변환 버전
 * 
 * @since 2009.06.01
 * @version 1.1
 */
@Mapper
public interface MenuManageDAO {

    /**
     * MainMenu Head Menu 조회
     * @param vo MenuManageVO
     * @return List
     * @throws Exception
     */
    List<MenuManageVO> selectMainMenuHead(MenuManageVO vo) throws Exception;

    /**
     * MainMenu Left Menu 조회
     * @param vo MenuManageVO
     * @return List
     * @throws Exception
     */
    List<MenuManageVO> selectMainMenuLeft(MenuManageVO vo) throws Exception;

    /**
     * MainMenu Head Menu URL 조회
     * @param vo MenuManageVO
     * @return String
     * @throws Exception
     */
    String selectLastMenuURL(MenuManageVO vo) throws Exception;

    /**
     * MainMenu Left Menu 번호 조회
     * @param vo MenuManageVO
     * @return int
     * @throws Exception
     */
    int selectLastMenuNo(MenuManageVO vo) throws Exception;

    /**
     * MainMenu Left Menu 카운트 조회
     * @param vo MenuManageVO
     * @return int
     * @throws Exception
     */
    int selectLastMenuNoCnt(MenuManageVO vo) throws Exception;

    /**
     * MainMenu Head Menu 조회 - 권한별
     * @param vo MenuManageVO
     * @return List
     * @throws Exception
     */
    List<MenuManageVO> selectMainMenuHeadByAuthor(MenuManageVO vo) throws Exception;

    /**
     * MainMenu Left Menu 조회 - 권한별
     * @param vo MenuManageVO
     * @return List
     * @throws Exception
     */
    List<MenuManageVO> selectMainMenuLeftByAuthor(MenuManageVO vo) throws Exception;
}

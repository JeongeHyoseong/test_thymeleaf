package egovframework.example.service.impl;

import egovframework.example.dao.MenuManageDAO;
import egovframework.example.service.EgovMenuManageService;
import egovframework.example.vo.MenuManageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 메뉴목록관리, 생성, 사이트맵을 처리하는 비즈니스 구현 클래스
 * Spring Boot 변환 버전
 * 
 * @since 2009.06.01
 * @version 1.1
 */
@Service
public class EgovMenuManageServiceImpl implements EgovMenuManageService {

    @Autowired
    private MenuManageDAO menuManageDAO;

    /**
     * MainMenu Head Menu 조회
     *
     * @param vo MenuManageVO
     * @return List
     * @throws Exception
     */
    @Override
    public List<?> selectMainMenuHead(MenuManageVO vo) throws Exception {
        return menuManageDAO.selectMainMenuHead(vo);
    }

    /**
     * MainMenu Head Left 조회
     *
     * @param vo MenuManageVO
     * @return List
     * @throws Exception
     */
    @Override
    public List<?> selectMainMenuLeft(MenuManageVO vo) throws Exception {
        return menuManageDAO.selectMainMenuLeft(vo);
    }

    /**
     * MainMenu Head Menu URL 조회
     *
     * @param iMenuNo int
     * @param sUniqId String
     * @return String
     * @throws Exception
     */
    @Override
    public String selectLastMenuURL(int iMenuNo, String sUniqId) throws Exception {
        MenuManageVO vo = new MenuManageVO();
        vo.setMenuNo(selectLastMenuNo(iMenuNo, sUniqId));
        return menuManageDAO.selectLastMenuURL(vo);
    }

    private int selectLastMenuNo(int iMenuNo, String sUniqId) throws Exception {
        int chkMenuNo = iMenuNo;
        int cntMenuNo = 0;
        while (chkMenuNo > -1) {
            chkMenuNo = selectLastMenuNoChk(chkMenuNo, sUniqId);
            if (chkMenuNo > 0) {
                cntMenuNo = chkMenuNo;
            }
        }
        return cntMenuNo;
    }

    private int selectLastMenuNoChk(int iMenuNo, String sUniqId) throws Exception {
        MenuManageVO vo = new MenuManageVO();
        vo.setMenuNo(iMenuNo);
        vo.setTempValue(sUniqId);

        int chkMenuNo;
        int cntMenuNo = menuManageDAO.selectLastMenuNoCnt(vo);
        if (cntMenuNo > 0) {
            chkMenuNo = menuManageDAO.selectLastMenuNo(vo);
        } else {
            chkMenuNo = -1;
        }
        return chkMenuNo;
    }

    /**
     * MainMenu Head Menu By Author 조회
     *
     * @param vo MenuManageVO
     * @return List
     * @throws Exception
     */
    @Override
    public List<?> selectMainMenuHeadByAuthor(MenuManageVO vo) throws Exception {
        return menuManageDAO.selectMainMenuHeadByAuthor(vo);
    }

    /**
     * MainMenu Head Left By Author 조회
     *
     * @param vo MenuManageVO
     * @return List
     * @throws Exception
     */
    @Override
    public List<?> selectMainMenuLeftByAuthor(MenuManageVO vo) throws Exception {
        return menuManageDAO.selectMainMenuLeftByAuthor(vo);
    }
}

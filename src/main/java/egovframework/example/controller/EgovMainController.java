package egovframework.example.controller;

import java.util.Map;

import egovframework.example.vo.ComDefaultVO;
import egovframework.example.vo.BoardVO;
import egovframework.example.service.EgovBBSManageService;
import egovframework.example.service.EgovMenuManageService;
import egovframework.example.vo.MenuManageVO;
import egovframework.example.service.EgovFaqManageService;
import egovframework.example.service.EgovFileMngService;
import egovframework.example.vo.FaqManageDefaultVO;
import egovframework.example.service.EgovQustnrRespondInfoService;

import org.egovframe.rte.fdl.security.userdetails.util.EgovUserDetailsHelper;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EgovMainController {

    @Autowired
    private EgovBBSManageService bbsMngService;

    @Autowired
    private EgovMenuManageService menuManageService;

    @Autowired
    private EgovFaqManageService faqManageService;

    @Autowired
    private EgovQustnrRespondInfoService egovQustnrRespondInfoService;
    
    @Autowired
    private EgovFileMngService egovFileMngService;

    @GetMapping("/")
    public String getMainPage(Model model) throws Exception {
        // 공지사항 조회
        BoardVO boardVO = new BoardVO();
        boardVO.setUseAt("Y");
        boardVO.setPageUnit(5);
        boardVO.setPageSize(10);
        boardVO.setBbsId("BBSMSTR_AAAAAAAAAAAA");

        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setCurrentPageNo(boardVO.getPageIndex());
        paginationInfo.setRecordCountPerPage(boardVO.getPageUnit());
        paginationInfo.setPageSize(boardVO.getPageSize());

        boardVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
        boardVO.setLastIndex(paginationInfo.getLastRecordIndex());
        boardVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());

        Map<String, Object> notiMap = bbsMngService.selectBoardArticles(boardVO, "BBSA02");
        model.addAttribute("notiList", notiMap.get("resultList"));

        // 자유게시판 조회
        boardVO.setPageUnit(9);
        boardVO.setBbsId("BBSMSTR_BBBBBBBBBBBB");
        Map<String, Object> bbsMap = bbsMngService.selectBoardArticles(boardVO, "BBSA02");
        model.addAttribute("bbsList", bbsMap.get("resultList"));

        // FAQ 조회
        FaqManageDefaultVO searchVO = new FaqManageDefaultVO();
        searchVO.setPageUnit(3);
        searchVO.setPageSize(10);

        paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
        paginationInfo.setRecordCountPerPage(searchVO.getPageUnit());
        paginationInfo.setPageSize(searchVO.getPageSize());

        searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
        searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
        searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());

        model.addAttribute("faqList", faqManageService.selectFaqList(searchVO));

        // 설문조사 조회
        ComDefaultVO qVO = new ComDefaultVO();
        qVO.setPageUnit(1);
        qVO.setPageSize(10);

        paginationInfo.setCurrentPageNo(qVO.getPageIndex());
        paginationInfo.setRecordCountPerPage(qVO.getPageUnit());
        paginationInfo.setPageSize(qVO.getPageSize());

        qVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
        qVO.setLastIndex(paginationInfo.getLastRecordIndex());
        qVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());

        model.addAttribute("qriList", egovQustnrRespondInfoService.selectQustnrRespondInfoManageList(qVO));

        return "thymeleaf/main/EgovMainView";
    }

    @GetMapping("/sym/mms/EgovHeader")
    public String selectHeader(@ModelAttribute("menuManageVO") MenuManageVO menuManageVO, Model model) throws Exception {
        if (EgovUserDetailsHelper.isAuthenticated()) {
            menuManageVO.setTmp_Id("사용자 ID");
            model.addAttribute("list_headmenu", menuManageService.selectMainMenuHead(menuManageVO));
        } else {
            menuManageVO.setAuthorCode("ROLE_ANONYMOUS");
            model.addAttribute("list_headmenu", menuManageService.selectMainMenuHeadByAuthor(menuManageVO));
        }
        return "main/inc/EgovIncHeader";
    }

    @GetMapping("/sym/mms/EgovFooter")
    public String selectFooter() {
        return "main/inc/EgovIncFooter";
    }

    @GetMapping("/sym/mms/EgovMenuLeft")
    public String selectMenuLeft(Model model) {
        if (EgovUserDetailsHelper.isAuthenticated()) {
            model.addAttribute("lastLogoutDateTime", "2024-01-01 12:00:00");
        }
        return "main/inc/EgovIncLeftmenu";
    }
}
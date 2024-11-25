package egovframework.example.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 파일정보 처리를 위한 VO 클래스
 * Spring Boot 변환 버전
 * Lombok 사용
 * 
 * @since 2009.03.25
 * @version 1.1
 */
@Data
@NoArgsConstructor
public class FileVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 첨부파일 아이디 */
    private String atchFileId = "";

    /** 생성일자 */
    private String creatDt = "";

    /** 파일내용 */
    private String fileCn = "";

    /** 파일확장자 */
    private String fileExtsn = "";

    /** 파일크기 */
    private String fileMg = "";

    /** 파일연번 */
    private String fileSn = "";

    /** 파일저장경로 */
    private String fileStreCours = "";

    /** 원파일명 */
    private String orignlFileNm = "";

    /** 저장파일명 */
    private String streFileNm = "";
}

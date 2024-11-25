package egovframework.example.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 메뉴 관리 처리를 위한 VO 클래스
 * Spring Boot 변환 버전
 * Lombok 사용
 * 
 * @since 2009.06.01
 * @version 1.1
 */
@Data
@NoArgsConstructor
public class MenuManageVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 메뉴번호 */
    private int menuNo;

    /** 메뉴순서 */
    private int menuOrdr;

    /** 메뉴명 */
    private String menuNm;

    /** 상위메뉴번호 */
    private int upperMenuId;

    /** 메뉴설명 */
    private String menuDc;

    /** 관련이미지경로 */
    private String relateImagePath;

    /** 관련이미지명 */
    private String relateImageNm;

    /** 프로그램파일명 */
    private String progrmFileNm;

    /** 생성자ID */
    private String creatPersonId;

    /** 권한코드 */
    private String authorCode;

    /** 임시값 */
    private String tempValue;

    /** 임시 정수값 */
    private int tempInt;

    /** 로그인 관련 속성 */
    private String tmp_Id;
    private String tmp_Password;
    private String tmp_Name;
    private String tmp_UserSe;
    private String tmp_Email;
    private String tmp_OrgnztId;
    private String tmp_UniqId;
    private String tmp_Cmd;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

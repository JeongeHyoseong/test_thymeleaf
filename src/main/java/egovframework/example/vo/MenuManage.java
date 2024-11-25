package egovframework.example.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 메뉴 관리를 위한 모델 클래스
 * Spring Boot 변환 버전
 * Lombok 사용
 * 
 * @since 2009.06.01
 * @version 1.0
 */
@Data
@NoArgsConstructor
public class MenuManage implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 메뉴설명 */
    private String menuDc;

    /** 메뉴명 */
    private String menuNm;

    /** 메뉴번호 */
    private int menuNo;

    /** 메뉴순서 */
    private int menuOrdr;

    /** 프로그램파일명 */
    private String progrmFileNm;

    /** 관련이미지명 */
    private String relateImageNm;

    /** 관련이미지경로 */
    private String relateImagePath;

    /** 상위메뉴번호 */
    private int upperMenuId;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
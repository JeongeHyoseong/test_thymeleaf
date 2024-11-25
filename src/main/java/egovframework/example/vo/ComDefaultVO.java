package egovframework.example.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 공통 검색 및 페이징 처리를 위한 VO 클래스
 * Spring Boot 변환 버전
 * Lombok 사용
 * 
 * @since 2009.02.01
 * @version 1.0
 */
@Data
@NoArgsConstructor
public class ComDefaultVO implements Serializable {

    private static final long serialVersionUID = -6062858939907510631L;

    /** 검색조건 */
    private String searchCondition = "";

    /** 검색 Keyword */
    private String searchKeyword = "";

    /** 검색 사용 여부 */
    private String searchUseYn = "";

    /** 현재 페이지 */
    private int pageIndex = 1;

    /** 페이지 갯수 */
    private int pageUnit = 10;

    /** 페이지 사이즈 */
    private int pageSize = 10;

    /** 첫 페이지 인덱스 */
    private int firstIndex = 1;

    /** 마지막 페이지 인덱스 */
    private int lastIndex = 1;

    /** 페이지당 레코드 수 */
    private int recordCountPerPage = 10;

    /** 검색 Keyword From */
    private String searchKeywordFrom = "";

    /** 검색 Keyword To */
    private String searchKeywordTo = "";

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

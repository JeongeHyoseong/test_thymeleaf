package egovframework.example.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 설문조사 VO 클래스
 * Spring Boot 변환 버전
 * Lombok 사용
 * 
 * @since 2009.03.20
 * @version 1.1
 */
@Data
@NoArgsConstructor
public class QustnrRespondInfoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 설문응답ID */
    private String qestnrQesrspnsId = "";

    /** 설문문항ID */
    private String qestnrQesitmId = "";

    /** 설문ID */
    private String qestnrId = "";

    /** 설문템플릿ID */
    private String qestnrTmplatId = "";

    /** 설문항목ID */
    private String qustnrIemId = "";

    /** 응답자답변내용 */
    private String respondAnswerCn = "";

    /** 응답자명 */
    private String respondNm = "";

    /** 기타답변내용 */
    private String etcAnswerCn = "";

    /** 최초등록시점 */
    private String frstRegisterPnttm = "";

    /** 최초등록자ID */
    private String frstRegisterId = "";

    /** 최종수정시점 */
    private String lastUpdusrPnttm = "";

    /** 최종수정자ID */
    private String lastUpdusrId = "";

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

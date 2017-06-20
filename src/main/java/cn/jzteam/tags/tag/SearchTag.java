package cn.jzteam.tags.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;

import org.apache.commons.lang3.StringUtils;

public class SearchTag extends AbstractTag {
    public static final long serialVersionUID = 6813748831822938835L;

    @Override
    public int doEndTag() throws JspException {

        try {
            StringBuffer ret = new StringBuffer();
            ret.append("<input type=\"text\"");
            ret.append(" name=\"").append(name).append("\"");
            ret.append(" class=\"").append(myClass).append("\"");
            ret.append(" queryField=\"").append(queryField).append("\"");
            if (StringUtils.isNotBlank(showField)) {
                ret.append(" showField=\"").append(showField).append("\"");
            }
            ret.append(" showSpan=\"").append(showSpan).append("\"");
            ret.append(" queryType=\"").append(queryType).append("\"");

            if (StringUtils.isNotBlank(value) && !"0".equals(value)) {
                ret.append(" value=\"").append(value).append("\"");
            }
            if (StringUtils.isNotBlank(initField) && !"0".equals(initField)) {
                ret.append(" initField=\"").append(initField).append("\"");
            }
            if (StringUtils.isNotBlank(isNeedPerssion)) {
                ret.append(" isNeedPerssion=\"").append(isNeedPerssion).append("\"");
            }
            if (StringUtils.isNotBlank(initCondition)) {
                ret.append(" initCondition=\"").append(initCondition).append("\"");
            }

            if (StringUtils.isNotBlank(validate_title)) {
                ret.append(" validate-title=\"").append(validate_title).append("\"");
            }
            if (StringUtils.isNotBlank(validate_rules)) {
                ret.append(" validate-rules=\"").append(validate_rules).append("\"");
            }

            // 处理该字段中JSON格式里的双引号，否则生成的html标签中无法获取
            if (StringUtils.isNotBlank(extendCondition)) {
                extendCondition = extendCondition.replace("\"", "&quot;");
            }
            ret.append(" extendCondition=\"").append(extendCondition).append("\"");

            if (StringUtils.isNotBlank(extendMethed)) {
                ret.append(" extendMethed=\"").append(extendMethed).append("\"");
            }
            if (StringUtils.isNotBlank(callBackMethed)) {
                ret.append(" callBackMethed=\"").append(callBackMethed).append("\"");
            }
            if (StringUtils.isNotBlank(pageSize)) {
                ret.append(" pageSize=\"").append(pageSize).append("\"");
            }
            ret.append(" />");
            pageContext.getOut().print(ret.toString());
        } catch (IOException e) {
            // e.printStackTrace();
        }

        /* 处理页面其它部分 */
        return EVAL_PAGE;
    }

    @Override
    public int doStartTag() throws JspException {

        /* 禁止处理主体部分 */
        return SKIP_BODY;
    }

}

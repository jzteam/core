package cn.jzteam.tags.tag;

import javax.servlet.jsp.tagext.TagSupport;

public abstract class AbstractTag extends TagSupport {
    private static final long serialVersionUID = 7145955020275801170L;

    public String id;// html text 元素id

    public String name;// html text 元素name

    public String myClass;// html text 元素class

    /*
     * //html text 元素value public String value;
     */

    public String validate_title;// js前端架构校验要求

    public String validate_rules;// js前端架构校验要求

    public String value;

    public String initField;// 初始化时需要查询的条件

    public String queryType;// 根据queryType来决定后台的查询逻辑分支

    public String queryField;// 输入框中要查询的条件

    public String showSpan;// 展示属性用什么符号隔开

    public String showField;// 展示属性

    public String initCondition;// 初始化的固定过滤条件

    public String extendCondition;// 动态扩展的查询条件

    public String isNeedPerssion;// 是否需要权限控制

    public String extendMethed;// 动态扩展的方法，返回动态扩展的查询条件

    public String callBackMethed;// 选中结果后，需要回调操作的js方法

    public String pageSize;// 显示条数

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMyClass() {
        return myClass;
    }

    public void setMyClass(String myClass) {
        this.myClass = myClass;
    }

    public String getValidate_title() {
        return validate_title;
    }

    public void setValidate_title(String validate_title) {
        this.validate_title = validate_title;
    }

    public String getValidate_rules() {
        return validate_rules;
    }

    public void setValidate_rules(String validate_rules) {
        this.validate_rules = validate_rules;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getInitField() {
        return initField;
    }

    public void setInitField(String initField) {
        this.initField = initField;
    }

    public String getQueryField() {
        return queryField;
    }

    public void setQueryField(String queryField) {
        this.queryField = queryField;
    }

    public String getShowSpan() {
        return showSpan;
    }

    public void setShowSpan(String showSpan) {
        this.showSpan = showSpan;
    }

    public String getShowField() {
        return showField;
    }

    public void setShowField(String showField) {
        this.showField = showField;
    }

    public String getInitCondition() {
        return initCondition;
    }

    public void setInitCondition(String initCondition) {
        this.initCondition = initCondition;
    }

    public String getExtendCondition() {
        return extendCondition;
    }

    public void setExtendCondition(String extendCondition) {
        this.extendCondition = extendCondition;
    }

    public String getIsNeedPerssion() {
        return isNeedPerssion;
    }

    public void setIsNeedPerssion(String isNeedPerssion) {
        this.isNeedPerssion = isNeedPerssion;
    }

    public String getExtendMethed() {
        return extendMethed;
    }

    public void setExtendMethed(String extendMethed) {
        this.extendMethed = extendMethed;
    }

    public String getCallBackMethed() {
        return callBackMethed;
    }

    public void setCallBackMethed(String callBackMethed) {
        this.callBackMethed = callBackMethed;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }
}

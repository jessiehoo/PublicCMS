package com.publiccms.entities.sys;
// Generated 2016-11-20 15:15:48 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * SysExtendFieldId generated by hbm2java
 */
@Embeddable
public class SysExtendFieldId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "扩展ID", condition = true)
    private int extendId;
    @GeneratorColumn(title = "字段")
    private String code;

    public SysExtendFieldId() {
    }

    public SysExtendFieldId(int extendId, String code) {
        this.extendId = extendId;
        this.code = code;
    }

    @Column(name = "extend_id", nullable = false)
    public int getExtendId() {
        return this.extendId;
    }

    public void setExtendId(int extendId) {
        this.extendId = extendId;
    }

    @Column(name = "code", nullable = false, length = 20)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof SysExtendFieldId))
            return false;
        SysExtendFieldId castOther = (SysExtendFieldId) other;

        return (this.getExtendId() == castOther.getExtendId()) && ((this.getCode() == castOther.getCode())
                || (this.getCode() != null && castOther.getCode() != null && this.getCode().equals(castOther.getCode())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getExtendId();
        result = 37 * result + (getCode() == null ? 0 : this.getCode().hashCode());
        return result;
    }

}
package xyz.blog.xuexi.pojo;

import java.io.Serializable;

public class ZjSubmenus implements Serializable {
    private Long linkId;

    private Long menuId;

    private String linkName;

    private String linkTarget;

    private String linkOpenWay;

    private Long parentLinkId;

    private static final long serialVersionUID = 1L;

    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkTarget() {
        return linkTarget;
    }

    public void setLinkTarget(String linkTarget) {
        this.linkTarget = linkTarget;
    }

    public String getLinkOpenWay() {
        return linkOpenWay;
    }

    public void setLinkOpenWay(String linkOpenWay) {
        this.linkOpenWay = linkOpenWay;
    }

    public Long getParentLinkId() {
        return parentLinkId;
    }

    public void setParentLinkId(Long parentLinkId) {
        this.parentLinkId = parentLinkId;
    }
}
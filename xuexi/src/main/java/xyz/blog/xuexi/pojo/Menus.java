package xyz.blog.xuexi.pojo;

import java.io.Serializable;

public class Menus implements Serializable {
    private Long menuId;

    private String menuName;

    private static final long serialVersionUID = 1L;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
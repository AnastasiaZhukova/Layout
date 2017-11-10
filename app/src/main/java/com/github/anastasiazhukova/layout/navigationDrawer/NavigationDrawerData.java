package com.github.anastasiazhukova.layout.navigationDrawer;

public class NavigationDrawerData {

    private int mIconId;

    private String mTitle;

    public NavigationDrawerData(final int pIconId, final String pTitle) {
        mIconId = pIconId;
        mTitle = pTitle;
    }

    public int getIconId() {
        return mIconId;
    }

    public void setIconId(final int pIconId) {
        mIconId = pIconId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(final String pTitle) {
        mTitle = pTitle;
    }
}

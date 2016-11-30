package com.test.zhangtao.activitytest.bean;

/**
 * Created by zhangtao on 16/9/26.
 */
public class HomeCategory extends Category
{

    private int imgBig;
    private int imgSmallTop;
    private int imgSmallBottom;

    public HomeCategory(String name, int imgSmallTop, int imgBig, int imgSmallBottom)
    {
        super(name);
        this.imgSmallTop = imgSmallTop;
        this.imgBig = imgBig;
        this.imgSmallBottom = imgSmallBottom;
    }

    public int getImgBig() {
        return imgBig;
    }

    public void setImgBig(int imgBig) {
        this.imgBig = imgBig;
    }

    public int getImgSmallTop() {
        return imgSmallTop;
    }

    public void setImgSmallTop(int imgSmallTop) {
        this.imgSmallTop = imgSmallTop;
    }

    public int getImgSmallBottom() {
        return imgSmallBottom;
    }

    public void setImgSmallBottom(int imgSmallBottom) {
        this.imgSmallBottom = imgSmallBottom;
    }
}

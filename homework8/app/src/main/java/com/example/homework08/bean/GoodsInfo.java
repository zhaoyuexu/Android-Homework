package com.example.homework08.bean;

import com.example.homework08.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "杜卡迪 Superbike Panigale V4 S", "杜卡迪 Street Fightre V4 S", "川崎 Ninja H2", "川崎 Z H2", "本田 CBR 650R", "本田 CB 65F","雅马哈 YZF-R1","雅马哈-MT09"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "杜卡迪 Superbike Panigale V4 S 车型：跑车，跨骑 能源：汽油 排量：1100",
            "杜卡迪 Street Fightre V4 S 车型：街车，跨骑 能源：汽油 排量：1103",
            "川崎 Ninja H2 车型：跑车，跨骑 能源：汽油 排量：1100",
            "川崎 Z H2 车型：街车，跨骑 能源：汽油 排量：1000",
            "本田 CBR 650R 车型：跑车，跨骑 能源：汽油 排量：650",
            "本田 CB 65F 车型：街车，跨骑 能源：汽油 排量：650",
            "雅马哈 YZF-R1 车型：跑车，跨骑 能源：汽油 排量：1000",
            "雅马哈-MT09 车型：街车，跨骑 能源：汽油 排量：900"


    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {29800, 23500, 42400, 23900, 10980, 9470,22980,12980};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.panigale_s, R.drawable.street_s, R.drawable.h2_s, R.drawable.zh2_s, R.drawable.cbr_s,
            R.drawable.cb_s, R.drawable.yzf_s, R.drawable.mt_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.panigale, R.drawable.street, R.drawable.h2, R.drawable.zh2, R.drawable.cbr,
            R.drawable.cb, R.drawable.yzf, R.drawable.mt

    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}

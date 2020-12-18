package com.example.homework12.bean;

import com.example.homework12.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc1; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号
    public int pic_id;
    public String title;
    public boolean bPressed;
    public int id;
    private static int seq = 0;
    public String desc;
    public GoodsInfo(int pic_id, String title, String desc) {
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "杜卡迪 Superbike Panigale V4 S", "杜卡迪 Street Fightre V4 S", "川崎 Ninja H2", "川崎 Z H2", "本田 CBR 650R", "本田 CB 65F","雅马哈 YZF-R1","雅马哈-MT09"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = new String[]{
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
            R.drawable.panigale_s, R.drawable.street_s, R.drawable.h2_s,
            R.drawable.zh2_s, R.drawable.cbr_s, R.drawable.cb_s, R.drawable.yzf_s,R.drawable.mt_s,
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.panigale, R.drawable.street, R.drawable.h2,
            R.drawable.zh2, R.drawable.cbr, R.drawable.cb,
            R.drawable.yzf, R.drawable.mt
    };

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

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
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"商场", "超市", "百货", "便利店",
            "地摊", "食杂店", "饭店", "餐厅", "会所", "菜市场"};

    public static ArrayList<GoodsInfo> getDefaultGrid() {
        ArrayList<GoodsInfo> gridArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoodsInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }
    private static int[] stagImageArray = {R.drawable.skirt01, R.drawable.skirt02, R.drawable.skirt03
            , R.drawable.skirt04, R.drawable.skirt05, R.drawable.skirt06, R.drawable.skirt07
            , R.drawable.skirt08, R.drawable.skirt09, R.drawable.skirt10, R.drawable.skirt11
            , R.drawable.skirt12, R.drawable.skirt13, R.drawable.skirt14, R.drawable.skirt15
            , R.drawable.skirt16, R.drawable.skirt17, R.drawable.skirt18, R.drawable.skirt19
            , R.drawable.skirt20, R.drawable.skirt21, R.drawable.skirt22, R.drawable.skirt23};
    private static String[] stagTitleArray = {"促销价", "惊爆价", "跳楼价", "白菜价", "清仓价", "割肉价",
            "实惠价", "一口价", "满意价", "打折价", "腰斩价", "无人问津", "算了吧", "大声点",
            "嘘嘘", "嗯嗯", "呼呼", "呵呵", "哈哈", "嘿嘿", "嘻嘻", "嗷嗷", "喔喔"};

    public static ArrayList<GoodsInfo> getDefaultStag() {

        ArrayList<GoodsInfo> stagArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoodsInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }
}

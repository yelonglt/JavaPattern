package com.dmall.pattern.composite;

/**
 * 组合模式测试
 * Created by yelong on 2019-06-18.
 * mail:354734713@qq.com
 */
public class CompositeTest {

    public static void main(String[] args) {
        //创建网站根页面 root
        PageElement root = new Column("网站页面");
        //网站页面添加三个栏目。
        PageElement music = new Column("音乐");
        PageElement video = new Column("视频");
        PageElement ad = new Content("广告");
        root.addPageElement(music);
        root.addPageElement(video);
        root.addPageElement(ad);

        //音乐栏目添加两个子栏目：国语,粤语
        PageElement chineseMusic = new Column("国语");
        PageElement cantoneseMusic = new Column("粤语");
        music.addPageElement(chineseMusic);
        music.addPageElement(cantoneseMusic);

        //国语,粤语栏目添加具体内容
        chineseMusic.addPageElement(new Content("十年.mp3"));
        cantoneseMusic.addPageElement(new Content("明年今日.mp3"));

        //视频栏目添加具体内容
        video.addPageElement(new Content("唐伯虎点秋香.avi"));

        //打印整个页面的内容
        root.print("");
    }

}

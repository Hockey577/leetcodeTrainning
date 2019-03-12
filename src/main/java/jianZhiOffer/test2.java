package jianZhiOffer;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class test2 {
    public static String replaceSpace(StringBuffer str) {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                res.append("%20");
            } else {
                res.append(str.charAt(i));
            }
        }
        String res1 = res.toString();
        return res1;
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("we are happy");
        System.out.println(replaceSpace(str));
    }
}

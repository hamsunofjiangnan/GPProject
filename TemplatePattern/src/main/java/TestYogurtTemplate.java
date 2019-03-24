/**
 * @Author: hamsun
 * @Description:模板模式不一定要通过继承，匿名类实现也可以
 * @Date: 2019/3/24 23:56
 */
public class TestYogurtTemplate {
    public static void main(String[] args) {
        new YogurtTemplate("光明") {
            @Override
            public void inoculation() {
                System.out.println("接种嗜热链球菌，乳酸链球菌,ST3植物乳杆菌");
            }
        }.produce();
        new YogurtTemplate("伊利") {
            @Override
            public void inoculation() {
                System.out.println("双歧杆菌，乳酸链球菌,嗜热链球菌");
            }
        }.produce();
    }
}

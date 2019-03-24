/**
 * @Author: hamsun
 * @Description: 制作酸奶的步骤
 * @Date: 2019/3/24 23:37
 */
public abstract class YogurtTemplate {
    private String name;
    public YogurtTemplate(String name){
        this.name = name;
    }

    public final void produce(){//final防止被重写，破坏模板设计好的 流程
        this.addIngredients();
        this.mixing();
        this.sterilization();
        this.cooling();
        this.inoculation();
        this.fermentation();
        this.coldStorage();
        this.packaging();

    }

    private final void addIngredients(){
        System.out.println("加入稳定剂，蜂蜜等配料");
    }

    private final void mixing(){
        System.out.println("充分搅拌均匀");
    }

    private final void sterilization(){
        System.out.println("90℃15s高温短时杀菌");
    }

    private final void cooling(){
        System.out.println("冷却到43℃");
    }

    public abstract void inoculation();//接种各种菌种

    private final void fermentation(){
        System.out.println("发酵，ph4.7停止发酵，并冷却至20℃");
    }

    private final void coldStorage(){
        System.out.println("4-8℃冷藏后熟");
    }

    private final void packaging(){
        System.out.println(this.name + "牌酸奶生产出来了\r\n");
    }


}

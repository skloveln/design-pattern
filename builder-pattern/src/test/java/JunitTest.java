import com.github.sky.*;
import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/6
 */
public class JunitTest {

    @Test
    public void test(){
        Meal mealA = new MealBuilder().mealABuild();

        System.out.println("套餐名称 : " + mealA.getName());
        System.out.println("套餐明细 : ");
        mealA.showItems();
        System.out.println("总价 : " + mealA.getCost());

        System.out.println("----------------------------------");

        Meal mealB = new MealBuilder().mealBuild();
        System.out.println("套餐名称 : " + mealB.getName());
        System.out.println("套餐明细 : ");
        mealB.showItems();
        System.out.println("总价 : " + mealB.getCost());

        System.out.println("----------------------------------");

        Meal customerMeal = new MealBuilder()
                .addItem(new ChickenBurger())
                .addItem(new VegBurger())
                .addItem(new Pepsi())
                .setName("优选套餐")
                .build();
        System.out.println("套餐名称 : " + customerMeal.getName());
        System.out.println("套餐明细 : ");
        customerMeal.showItems();
        System.out.println("总价 : " + customerMeal.getCost());
    }

}

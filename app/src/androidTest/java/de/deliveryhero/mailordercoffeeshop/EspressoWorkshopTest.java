package de.deliveryhero.mailordercoffeeshop;

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;

@RunWith(AndroidJUnit4ClassRunner.class)
public class EspressoWorkshopTest extends Helper {

    @Rule
    public ActivityTestRule<MainActivity> myActivityRule = new ActivityTestRule<>(MainActivity.class);

    public static final String NAME = "Jhon jackson";

    public static final String EMAIL = "jhon@test.com";

    public static final String CUSTOM_ORDER = "breakfast";

    public HashMap<String, Object> orderData = Fixtures.order();

    @Before
    public void setUp(){
        closeOnboarding();
    }

    @Test
    public void customOrderTest(){

        //Choose Espresso shots
        chooseEspressoShots(Integer.parseInt(orderData.get("espresso").toString()));

        //Choose the temperature
        chooseTemperature((Boolean) orderData.get("hot"));

        //Choose the chocolate option
        chooseChocolate((Boolean) orderData.get("chocolate"));

        //Open milk options
        chooseMilkSelection(orderData.get("milk selection").toString());

        //Choose a milk type
        chooseMilkType(orderData.get("milk type").toString());

        clickOnOrderReview();

        //Type name
        inputName(NAME);

        //Type email
        inputEmail(EMAIL);

        //Type custom order
        inputCustomOrder(CUSTOM_ORDER);

        //Submit order
        submitOrder();
    }
}

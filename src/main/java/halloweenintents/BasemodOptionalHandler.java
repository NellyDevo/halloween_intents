package halloweenintents;

import basemod.BaseMod;
import basemod.ModPanel;
import basemod.interfaces.PostInitializeSubscriber;
import com.badlogic.gdx.graphics.Texture;

public class BasemodOptionalHandler implements PostInitializeSubscriber {

    public static void subscribe() {
        BaseMod.subscribe(new BasemodOptionalHandler());
    }

    @Override
    public void receivePostInitialize() {
        Texture badgeImg = new Texture("halloweenintents/images/badge.png");
        ModPanel settingsPanel = new ModPanel();
        BaseMod.registerModBadge(badgeImg, "Halloween Intents", "thelethargicweirdo", "Makes enemy attack intents a bit more Spooky!", settingsPanel);
    }
}

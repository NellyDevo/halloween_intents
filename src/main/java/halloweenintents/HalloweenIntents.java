package halloweenintents;

import com.evacipated.cardcrawl.modthespire.Loader;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;

@SpireInitializer
public class HalloweenIntents  {
    public static void initialize() {
        if (Loader.isModLoaded("basemod")) {
            BasemodOptionalHandler.subscribe();
        }
    }
}

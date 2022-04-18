package ml.ikwid.nototem;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Nototem implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("nototem");
    @Override
    public void onInitialize() {
        LOGGER.info("nototem loaded");
    }
}

package com.enderio.fixer;

import java.util.Locale;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.MCVersion;


@MCVersion("1.10.2")
@IFMLLoadingPlugin.SortingIndex(0)
@Mod(modid = "enderfixer", name = "EnderFixer", version = EnderFixerPlugin.VERSION)
public class EnderFixerPlugin implements IFMLLoadingPlugin {

  public static final String VERSION = "@VERSION@";

  public static final Logger logger = LogManager.getLogger("EnderFixer");

  static {
    if (Locale.getDefault().getLanguage().equals("tr")) {
      Locale.setDefault(Locale.ENGLISH);
      logger.info("Locale is Turkish. Focing it to English instead.");
    } else {
      logger.info("Locale is not Turkish. Doing nothing.");
    }
  }

  @Override
  public String[] getASMTransformerClass() {
    return new String[] {  };
  }

  @Override
  public String getModContainerClass() {
    return null;
  }

  @Override
  public String getSetupClass() {
    return null;
  }

  @Override
  public void injectData(Map<String, Object> data) {
  }

  @Override
  public String getAccessTransformerClass() {
    return null;
  }
}

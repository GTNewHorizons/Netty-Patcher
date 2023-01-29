package net.laurus.nettyfix.asm;

import java.util.Map;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.SortingIndex;

@SortingIndex(10097)
@MCVersion(value = "1.7.10")
public class NP_CORE_FMLLoadingPlugin implements IFMLLoadingPlugin {

    // -Dfml.coreMods.load=net.laurus.nettyfix.asm.NP_CORE_FMLLoadingPlugin

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[] { NP_CORE_Handler.class.getName() };
    }

    @Override
    public String getModContainerClass() {
        return NP_CORE_Container.class.getName();
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

}

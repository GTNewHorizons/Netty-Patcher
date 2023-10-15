package net.laurus.nettyfix.asm;

import java.util.Map;

import net.laurus.nettyfix.NettyPatch;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;

@MCVersion(value = "1.7.10")
@IFMLLoadingPlugin.TransformerExclusions({ "net.laurus.nettyfix.asm" })
public class NettyPatchLoadingPlugin implements IFMLLoadingPlugin {

    @Override
    public String[] getASMTransformerClass() {
        return new String[] { NettyPatchTransformer.class.getName() };
    }

    @Override
    public String getModContainerClass() {
        return NettyPatch.class.getName();
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {}

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

}

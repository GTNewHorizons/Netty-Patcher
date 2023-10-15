package net.laurus.nettyfix;

import java.util.Collections;

import com.google.common.eventbus.EventBus;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;

public class NettyPatch extends DummyModContainer {

    public NettyPatch() {
        super(new ModMetadata());
        final ModMetadata meta = this.getMetadata();
        meta.modId = Tags.MODID;
        meta.name = Tags.MODNAME;
        meta.version = Tags.VERSION;
        meta.credits = "Roll Credits ...";
        meta.authorList = Collections.singletonList("LunarLaurus");
        meta.description = "Makes Netty a bit safer.";
        meta.screenshots = new String[0];
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller) {
        bus.register(this);
        return true;
    }
}

package net.laurus.nettyfix.asm;

import net.laurus.nettyfix.NettyPatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NP_CORE {
	public static final String NAME = NettyPatch.NAME + "_ASM";
	public static final String MODID = NettyPatch.MODID + "_ASM";
	public static final String VERSION = NettyPatch.VERSION;
	public static List<?> DEPENDENCIES = new ArrayList<>(Arrays.asList(new String[] {""}));
}

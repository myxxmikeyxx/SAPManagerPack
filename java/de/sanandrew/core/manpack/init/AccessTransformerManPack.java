package de.sanandrew.core.manpack.init;

import java.io.IOException;

import cpw.mods.fml.common.asm.transformers.AccessTransformer;

public class AccessTransformerManPack
    extends AccessTransformer
{
    public AccessTransformerManPack() throws IOException {
        super("sapmanpack_at.cfg");
    }
}

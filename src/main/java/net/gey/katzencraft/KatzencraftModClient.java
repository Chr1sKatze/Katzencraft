package net.gey.katzencraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.gey.katzencraft.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class KatzencraftModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        // gives transparency to crops
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_CAKE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_CAKE_CROP, RenderLayer.getCutout());
    }
}

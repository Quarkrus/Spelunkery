package com.ordana.spelunkery.reg;

import net.mehvahdjukaar.moonlight.api.platform.RegHelper;

public class ModCompostable {
    public static void register() {
        RegHelper.registerCompostable(ModBlocks.CAVE_MUSHROOM_STEM.get().asItem(), 0.85f);
        RegHelper.registerCompostable(ModBlocks.INKCAP_MUSHROOM_BLOCK.get().asItem(), 0.85f);
        RegHelper.registerCompostable(ModBlocks.WHITE_INKCAP_MUSHROOM_BLOCK.get().asItem(), 0.85f);
        RegHelper.registerCompostable(ModBlocks.PHOSPHOR_FUNGUS_BLOCK.get().asItem(), 0.85f);
        RegHelper.registerCompostable(ModBlocks.PHOSPHOR_SHROOMLIGHT.get().asItem(), 0.65f);
        RegHelper.registerCompostable(ModBlocks.MUSHGLOOM_BLOCK.get().asItem(), 0.85f);
        RegHelper.registerCompostable(ModBlocks.CONK_FUNGUS_BLOCK.get().asItem(), 0.85f);
        RegHelper.registerCompostable(ModBlocks.PORTABELLA_BLOCK.get().asItem(), 0.85f);
        RegHelper.registerCompostable(ModBlocks.MILLY_BUBCAP_BLOCK.get().asItem(), 0.85f);
        RegHelper.registerCompostable(ModItems.GRILLED_PORTABELLA.get(), 0.85f);
        RegHelper.registerCompostable(ModBlocks.SPOROPHYTE.get().asItem(), 0.5f);
        RegHelper.registerCompostable(ModBlocks.TALL_SPOROPHYTE.get().asItem(), 0.5f);
        RegHelper.registerCompostable(ModBlocks.PORTABELLA.get().asItem(), 0.85f);
        RegHelper.registerCompostable(ModBlocks.CRIMINI.get().asItem(), 0.65f);
        RegHelper.registerCompostable(ModBlocks.BUTTON_MUSHROOM.get().asItem(), 0.5f);
        RegHelper.registerCompostable(ModBlocks.INKCAP_MUSHROOM.get().asItem(), 0.65f);
        RegHelper.registerCompostable(ModBlocks.WHITE_INKCAP_MUSHROOM.get().asItem(), 0.65f);
        RegHelper.registerCompostable(ModBlocks.PHOSPHOR_FUNGUS.get().asItem(), 0.65f);
        RegHelper.registerCompostable(ModBlocks.MUSHGLOOM_BLOCK.get().asItem(), 0.65f);
        RegHelper.registerCompostable(ModBlocks.CONK_FUNGUS.get().asItem(), 0.5f);
        RegHelper.registerCompostable(ModBlocks.TANGLE_ROOTS.get().asItem(), 0.5f);
        RegHelper.registerCompostable(ModBlocks.TANGLE_ROOTS_BLOCK.get().asItem(), 0.85f);
        RegHelper.registerCompostable(ModBlocks.MILLY_BUBCAP.get().asItem(), 0.01f);
    }
}
package com.hybridavenger69.mtlasers.datagen;

import com.hybridavenger69.mtlasers.common.MTLasers;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MTLasers.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        //if (event.includeServer()) {
        generator.addProvider(event.includeServer(), new MTLasersRecipes(generator));
        generator.addProvider(event.includeServer(), new MTLasersLootTables(generator));
        MTLasersBlockTags blockTags = new MTLasersBlockTags(generator, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
        MTLasersItemTags itemTags = new MTLasersItemTags(generator, blockTags, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), itemTags);
        //generator.addProvider(new mtlasersItemTags(generator, blockTags, event.getExistingFileHelper()));
        //}
        //if (event.includeClient()) {
        generator.addProvider(event.includeClient(), new MTLasersBlockStates(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new MTLasersItemModels(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new MTLasersLanguageProvider(generator, "en_us"));
        //}
    }
}

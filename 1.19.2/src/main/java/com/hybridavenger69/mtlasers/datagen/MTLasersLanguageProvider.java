package com.hybridavenger69.mtlasers.datagen;

import com.hybridavenger69.mtlasers.common.MTLasers;
import com.hybridavenger69.mtlasers.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.hybridavenger69.mtlasers.setup.ModSetup.TAB_NAME;

public class MTLasersLanguageProvider extends LanguageProvider {
    public MTLasersLanguageProvider(DataGenerator gen, String locale) {
        super(gen, MTLasers.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "mtlasers");
        add(Registration.LaserConnector.get(), "Laser Connector");
        add(Registration.LaserNode.get(), "Laser Node");
        add(Registration.Laser_Wrench.get(), "Laser Wrench");
        add(Registration.Card_Holder.get(), "Card Holder");
        add(Registration.Card_Item.get(), "Item Card");
        add(Registration.Card_Fluid.get(), "Fluid Card");
        add(Registration.Card_Energy.get(), "Energy Card");
        add(Registration.Card_Redstone.get(), "Redstone Card");
        add(Registration.Filter_Basic.get(), "Basic Filter");
        add(Registration.Filter_Count.get(), "Counting Filter");
        add(Registration.Filter_Tag.get(), "Tag Filter");
        add(Registration.Filter_Mod.get(), "Mod Filter");
        add(Registration.Logic_Chip.get(), "Logic Chip");
        add(Registration.Logic_Chip_Raw.get(), "Raw Logic Chip");
        add(Registration.Overclocker_Card.get(), "Card Overclocker");
        add(Registration.Overclocker_Node.get(), "Node Overclocker");

        add("screen.mtlasers.extractamt", "Transfer Amount");
        add("screen.mtlasers.tickSpeed", "Speed (Ticks)");

        add("screen.mtlasers.priority", "Priority");
        add("screen.mtlasers.channel", "Channel: ");
        add("screen.mtlasers.redstonechannel", "Redstone Channel: ");
        add("screen.mtlasers.regulate", "Regulate");
        add("screen.mtlasers.roundrobin", "Round Robin: ");
        add("screen.mtlasers.true", "True");
        add("screen.mtlasers.false", "False");
        add("screen.mtlasers.enforced", "Enforced");
        add("screen.mtlasers.exact", "Exact");
        add("screen.mtlasers.and", "And");
        add("screen.mtlasers.or", "Or");
        add("screen.mtlasers.allowlist", "Allow");
        add("screen.mtlasers.comparenbt", "NBT");
        add("screen.mtlasers.lasernode", "Laser Node");
        add("screen.mtlasers.energylimit", "Energy Limit (%)");

        add("screen.mtlasers.default", "Default");
        add("screen.mtlasers.up", "Up");
        add("screen.mtlasers.down", "Down");
        add("screen.mtlasers.north", "North");
        add("screen.mtlasers.south", "South");
        add("screen.mtlasers.west", "West");
        add("screen.mtlasers.east", "East");

        add("screen.mtlasers.extract", "Extract");
        add("screen.mtlasers.insert", "Insert");
        add("screen.mtlasers.stock", "Stock");
        add("screen.mtlasers.sensor", "Sensor");
        add("screen.mtlasers.input", "Input");
        add("screen.mtlasers.output", "Output");
        add("screen.mtlasers.weak", "Weak");
        add("screen.mtlasers.strong", "Strong");
        add("screen.mtlasers.redstoneMode", "Redstone: ");
        add("screen.mtlasers.ignored", "Ignored");
        add("screen.mtlasers.low", "Low");
        add("screen.mtlasers.high", "High");

        add("screen.mtlasers.denylist", "Deny");
        add("screen.mtlasers.nbttrue", "Match NBT");
        add("screen.mtlasers.nbtfalse", "Ignore NBT");

        add("message.mtlasers.wrenchrange", "Connection exceeds maximum range of %d");

        //Card Tooltips
        add("mtlasers.tooltip.item.show_settings", "Hold shift to show settings");
        add("mtlasers.tooltip.item.card.mode", "Mode: ");
        add("mtlasers.tooltip.item.card.channel", "Channel: ");
        add("mtlasers.tooltip.item.card.mode.EXTRACT", "Extract");
        add("mtlasers.tooltip.item.card.mode.INSERT", "Insert");
        add("mtlasers.tooltip.item.card.mode.STOCK", "Stock");
        add("mtlasers.tooltip.item.card.sneaky", "Sneaky: ");
        add("mtlasers.tooltip.item.card.sneaky.DOWN", "Down");
        add("mtlasers.tooltip.item.card.sneaky.UP", "Up");
        add("mtlasers.tooltip.item.card.sneaky.NORTH", "North");
        add("mtlasers.tooltip.item.card.sneaky.SOUTH", "South");
        add("mtlasers.tooltip.item.card.sneaky.WEST", "West");
        add("mtlasers.tooltip.item.card.sneaky.EAST", "East");

        //Filter Tooltips
        add("mtlasers.tooltip.item.filter.type", "Type: ");
        add("mtlasers.tooltip.item.filter.type.allow", "Allow");
        add("mtlasers.tooltip.item.filter.type.deny", "Deny");
        add("mtlasers.tooltip.item.filter.nbt", "Match NBT: ");
        add("mtlasers.tooltip.item.filter.nbt.allow", "True");
        add("mtlasers.tooltip.item.filter.nbt.deny", "False");

        //add("", "");
    }
}

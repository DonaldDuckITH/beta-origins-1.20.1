package net.donaldduckith.betaorigins.block;

import net.donaldduckith.betaorigins.BetaOrigins;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ModBlocks {
    public static final Block STONE_RAIL = registerBlock("stone_rail", new RailBlock(FabricBlockSettings.copyOf(Blocks.RAIL).nonOpaque()));
    public static final Block STONE_POWERED_RAIL = registerBlock("stone_powered_rail", new PoweredRailBlock(FabricBlockSettings.copyOf(Blocks.POWERED_RAIL).nonOpaque()));
    public static final Block STONE_DETECTOR_RAIL = registerBlock("stone_detector_rail", new DetectorRailBlock(FabricBlockSettings.copyOf(Blocks.DETECTOR_RAIL).nonOpaque()));
    public static final Block STONE_ACTIVATOR_RAIL = registerBlock("stone_activator_rail", new PoweredRailBlock(FabricBlockSettings.copyOf(Blocks.ACTIVATOR_RAIL).nonOpaque()));

    public static final Block STONE_REPEATER = registerBlock("stone_repeater", new RepeaterBlock(FabricBlockSettings.copyOf(Blocks.REPEATER).nonOpaque()));
    public static final Block STONE_COMPARATOR = registerBlock("stone_comparator", new ComparatorBlock(FabricBlockSettings.copyOf(Blocks.COMPARATOR)));

    public static final Block STONE_TORCH = registerBlock("stone_torch", new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH).nonOpaque().sounds(BlockSoundGroup.STONE), ParticleTypes.FLAME));
    public static final Block STONE_WALL_TORCH = registerBlock("stone_wall_torch", new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH).nonOpaque().dropsLike(STONE_TORCH).sounds(BlockSoundGroup.STONE), ParticleTypes.FLAME));
    public static final Block STONE_SOUL_TORCH = registerBlock("stone_soul_torch", new TorchBlock(FabricBlockSettings.copyOf(Blocks.SOUL_TORCH).nonOpaque().sounds(BlockSoundGroup.STONE), ParticleTypes.SOUL_FIRE_FLAME));
    public static final Block STONE_SOUL_WALL_TORCH = registerBlock("stone_soul_wall_torch", new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.SOUL_WALL_TORCH).nonOpaque().dropsLike(STONE_SOUL_TORCH).sounds(BlockSoundGroup.STONE), ParticleTypes.SOUL_FIRE_FLAME));
    public static final Block STONE_REDSTONE_TORCH = registerBlock("stone_redstone_torch", new RedstoneTorchBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_TORCH).nonOpaque().sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_REDSTONE_WALL_TORCH = registerBlock("stone_redstone_wall_torch", new WallRedstoneTorchBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_WALL_TORCH).nonOpaque().dropsLike(STONE_REDSTONE_TORCH).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_REDSTONE_TORCH_OFF = registerBlock("stone_redstone_torch_off", new RedstoneTorchBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_TORCH).nonOpaque().sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_REDSTONE_WALL_TORCH_OFF = registerBlock("stone_redstone_wall_torch_off", new WallRedstoneTorchBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_WALL_TORCH).nonOpaque().dropsLike(STONE_REDSTONE_TORCH).sounds(BlockSoundGroup.STONE)));

    public static final Block STONE_LADDER = registerBlock("stone_ladder", new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).nonOpaque().sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_TRIPWIRE_HOOK = registerBlock("stone_tripwire_hook", new TripwireHookBlock(FabricBlockSettings.copyOf(Blocks.TRIPWIRE_HOOK).nonOpaque().sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_LEVER = registerBlock("stone_lever", new LeverBlock(FabricBlockSettings.copyOf(Blocks.LEVER).nonOpaque().sounds(BlockSoundGroup.STONE)));

    public static final Block STONE_OAK_SIGN = registerBlock("stone_oak_sign", new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.OAK));
    public static final Block STONE_SPRUCE_SIGN = registerBlock("stone_spruce_sign", new SignBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_SIGN).nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.SPRUCE));
    public static final Block STONE_BIRCH_SIGN = registerBlock("stone_birch_sign", new SignBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_SIGN).nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.BIRCH));
    public static final Block STONE_JUNGLE_SIGN = registerBlock("stone_jungle_sign", new SignBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_SIGN).nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.JUNGLE));
    public static final Block STONE_ACACIA_SIGN = registerBlock("stone_acacia_sign", new SignBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_SIGN).nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.ACACIA));
    public static final Block STONE_DARK_OAK_SIGN = registerBlock("stone_dark_oak_sign", new SignBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_SIGN).nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.DARK_OAK));
    public static final Block STONE_CRIMSON_SIGN = registerBlock("stone_crimson_sign", new SignBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_SIGN).nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.CRIMSON));
    public static final Block STONE_WARPED_SIGN = registerBlock("stone_warped_sign", new SignBlock(FabricBlockSettings.copyOf(Blocks.WARPED_SIGN).nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.WARPED));
    public static final Block STONE_MANGROVE_SIGN = registerBlock("stone_mangrove_sign", new SignBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_SIGN).nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.MANGROVE));
    public static final Block STONE_BAMBOO_SIGN = registerBlock("stone_bamboo_sign", new SignBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_SIGN).nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.BAMBOO));
    public static final Block STONE_CHERRY_SIGN = registerBlock("stone_cherry_sign", new SignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN).nonOpaque().sounds(BlockSoundGroup.WOOD), WoodType.CHERRY));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BetaOrigins.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BetaOrigins.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BetaOrigins.LOGGER.info("Registering mod blocks for " + BetaOrigins.MOD_ID);
    }
}

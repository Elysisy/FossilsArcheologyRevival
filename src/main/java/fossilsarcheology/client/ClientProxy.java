package fossilsarcheology.client;

import fossilsarcheology.client.gui.AnalyzerGUI;
import fossilsarcheology.client.particle.BubbleFX;
import fossilsarcheology.client.render.RenderingHandler;
import fossilsarcheology.server.ServerProxy;
import fossilsarcheology.server.block.entity.AnalyzerBlockEntity;
import fossilsarcheology.server.entity.EntityFishBase;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ClientProxy extends ServerProxy {
    public static final Minecraft MINECRAFT = Minecraft.getMinecraft();
    public static final RenderingHandler RENDER_HANDLER = new RenderingHandler();

    @Override
    public void onPreInit() {
        super.onPreInit();
        RENDER_HANDLER.onPreInit();
    }

    @Override
    public void onInit() {
        super.onInit();
        RENDER_HANDLER.onInit();
    }

    @Override
    public void onPostInit() {
        super.onPostInit();
        RENDER_HANDLER.onPostInit();
    }

    public void calculateChainBuffer(EntityFishBase entity) {
        entity.chainBuffer.calculateChainSwingBuffer(70, 10, 4, entity);
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        if (id == GUI_ANALYZER) {
            return new AnalyzerGUI(player.inventory, (AnalyzerBlockEntity) world.getTileEntity(pos));
        }
        return null;
    }

    public void spawnBubbleParticles(World world, float f, float f1, float f2, double motionX, double motionY, double motionZ) {
        Minecraft.getMinecraft().effectRenderer.addEffect(new BubbleFX(world, f, f1, f2, motionX, motionY, motionZ));
    }
}

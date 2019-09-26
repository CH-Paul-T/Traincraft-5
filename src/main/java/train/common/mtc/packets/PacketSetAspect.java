package train.common.mtc.packets;


import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class PacketSetAspect implements IMessage {
   public int aspect;

    public int x;
    public int y;
    public int z;


    public PacketSetAspect() {}
    public PacketSetAspect(int aspect, int x, int y, int z) {
        this.aspect = aspect;

        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
    aspect = buf.readInt();

    x = buf.readInt();
    y = buf.readInt();
    z = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.aspect);

        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        
    }

}

package train.common.mtc.packets;


import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class PacketSetSpeed  implements IMessage {

    public int speed;

    public int x;
    public int y;
    public int z;
    public int entity;
public PacketSetSpeed() {}

    public PacketSetSpeed(int speed, int x, int y, int z, int entity) {
        this.speed = speed;

        this.x = x;
        this.y = y;
        this.z = z;
        this.entity = entity;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        speed = buf.readInt();

        x = buf.readInt();
        y = buf.readInt();
        z = buf.readInt();
        entity = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.speed);

        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        buf.writeInt(entity);
    }

}

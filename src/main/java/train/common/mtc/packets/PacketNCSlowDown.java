package train.common.mtc.packets;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class PacketNCSlowDown implements IMessage {
    public int entity;
    public int speed;

    public PacketNCSlowDown() {}

    public PacketNCSlowDown(int entity, int speed) {

        this.entity = entity;
        this.speed = speed;
    }


    @Override
    public void fromBytes(ByteBuf buf) {
        this.entity = buf.readInt();
        this.speed = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.entity);
        buf.writeInt(this.speed);

    }

}

package train.common.mtc.packets;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class PacketGetSomethingFromServer implements IMessage {
    public int entity;
    public int function;

    public PacketGetSomethingFromServer() {}

    public PacketGetSomethingFromServer(int entity, int function) {
        this.entity = entity;
        this.function = function;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        entity = buf.readInt();
        function = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entity);
        buf.writeInt(function);
    }
}

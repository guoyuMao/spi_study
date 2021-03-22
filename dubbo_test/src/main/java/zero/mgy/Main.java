package zero.mgy;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

public class Main {
    public static void main(String[] args) {
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myProtocol");
        System.out.println(protocol.getDefaultPort());
    }


}

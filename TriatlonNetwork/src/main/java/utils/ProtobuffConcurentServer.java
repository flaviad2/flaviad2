package utils;



import protobuffprotocol.ProtoWorker;
import triatlon.service.IService;

import java.net.Socket;

public class ProtobuffConcurentServer extends AbsConcurrentServer{
    private IService server;

    public ProtobuffConcurentServer(int port, IService server) {
        super(port);
        this.server = server;
        System.out.println("ProtobuffConcurrentServer");
    }
    @Override
    protected Thread createWorker(Socket client) {
        ProtoWorker worker=new ProtoWorker(server,client);
        Thread tw=new Thread(worker);
        return tw;
    }
}

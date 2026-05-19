package CM2.CM2_EditKuis;

public class NodePembeli20 {
    NodePembeli20 next;
    NodePembeli20 prev;

    Pembeli20 data;

    NodePembeli20(Pembeli20 data, NodePembeli20 next){
        this.data = data;
        this.next = next;
    }    
}

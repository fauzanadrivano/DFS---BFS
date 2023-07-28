package coba;

public class Node {
    int node;
    boolean dikunjungi = false;

    public Node(int node){
        this.node = node;
    }

    public int getNode(){
        return node;
    }

    public boolean getKunjungi(){
        return dikunjungi;
    }

    public void setKunjungi(boolean sudahDikunjungi){
        dikunjungi = sudahDikunjungi;
    }
}
